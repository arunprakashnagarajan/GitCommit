package com.zurich.components;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Logger;

import org.testng.Assert;

import com.zurich.sda.apitesting.SDAAPI_scenarios;

import generalFunctions.Database_Connect;
import generalFunctions.ExcelFunctions;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.JSONArray;
import org.json.JSONML;
import org.json.JSONObject;

public class CommonFunctions {
	public static String queryPath = System.getProperty("user.dir")+"\\src\\test\\resources\\QueryReader.xlsx";
	public static String JsonPath=System.getProperty("user.dir")+"\\src\\test\\resources\\JsonValidator.xlsx";
	Database_Connect config = new Database_Connect();
	ExcelFunctions sdiconfig = new ExcelFunctions();
	public static String Dbsheet ="requests";
	public static String Jsonsheet ="Endpoints";
	ExcelFunctions excel=new ExcelFunctions();
	ReusableMethods common = new ReusableMethods();
	boolean flag=false;
	Logger log= Logger.getLogger(SDAAPI_scenarios.class.getName());


	/* 
	 * Method to do complete excel Validation
	 */
	public boolean DBValidation(String testCaseName) throws Exception{
		String Query =excel.getQueryReader(Dbsheet,"Query1", testCaseName);
		if(Query.equals(null)||Query.isEmpty()) {
			Assert.fail("The Queries values are empty");
		}

		HashMap<List<String>, List<String>> dbValues=common.fetchDatafromDB(Query,testCaseName);
		if(dbValues.isEmpty()) {
			Assert.fail("The DBValues values are empty");
		}

		String[] ColumnNames= common.getColumnNames(dbValues);
		List<String> DBValues=common.getDBValues(dbValues);
		if(ColumnNames[0].isEmpty()&&DBValues.isEmpty()) {
			Assert.fail("Values are empty ");
		}

		flag= excel.writeDBColumnValuesinExcel(ColumnNames,DBValues,testCaseName);
		if(flag) {
			log.info("DB values are written successfully");
			flag =true;
		}else {
			Assert.fail("DB Values are not written successfully");
		}
		return flag;

	}

	/*
	 * Method to Validate the JSon Input and write values in the Excel
	 */

	public boolean JsonValidation(String ScenarioName) throws Exception {

		String response=common.generateEndpoint(Jsonsheet,ScenarioName);
		if(response.isEmpty()) {
			Assert.fail("Unable to Generate the End point");
		}
		HashMap<List<String>, List<String>> FetchJsonData=common.FetchJsonData(response);
		if(FetchJsonData.isEmpty()) {
			Assert.fail("The Json values are empty");
		}

		String[] ColumnNames= common.getJsonColumnNames(FetchJsonData);
		List<String> JsonValues=common.getJsonValues(FetchJsonData);
		if(ColumnNames[0].isEmpty()&&JsonValues.isEmpty()) {
			Assert.fail("Values are empty ");
		}

		flag= excel.writeJSONColumnValuesinExcel(ColumnNames, JsonValues,ScenarioName);
		if(flag) {
			log.info("Json values are written successfully");
			flag =true;
		}else {
			Assert.fail("Json Values are not written successfully");
		}
		return flag;

	}



}
