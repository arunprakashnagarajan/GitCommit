package com.zurich.components;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.JSONArray;
import org.json.JSONObject;

import generalFunctions.Database_Connect;
import generalFunctions.ExcelFunctions;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;

public class ReusableMethods extends ExcelFunctions {

	public static Logger log = Logger.getLogger(ReusableMethods.class.getName());
	public boolean flag = false;
	public static Database_Connect dbConnect=new Database_Connect();
	public static ExcelFunctions excel=new ExcelFunctions();


	/*
	 * Method to Run the Query from MS SQL Database Server
	 */
	public HashMap<List<String>,List<String>> fetchDatafromDB(String Query,String scenarioName) throws Exception {
		HashMap<List<String>, List<String>> DBValues = new HashMap<List<String>, List<String>>();
		if(Query.contains("CLM")) {
			do {
				if(!Query.isEmpty()) {
					DBValues=dbConnect.GBQDS1SDA01DWHCLM(Query, "");
					System.out.println(DBValues);
				}
			}while(!Query.isEmpty()&&flag);
		}else if(Query.contains("POL")) {
			do {
				if(!Query.isEmpty()) {
					DBValues=dbConnect.GBQDS1SDA01DWHPOL(Query, "");
					System.out.println(DBValues);
				}
			}while(!Query.isEmpty()&&flag);
		}else if(Query.contains("BKR")) {
			do {
				if(!Query.isEmpty()) {
					DBValues=dbConnect.GBQIS1SDA01DWHBKR(Query,"");
					System.out.println(DBValues);
				}
			}while(!Query.isEmpty()&&flag);

		}else {
			log.info("DB Values are empty unable to execute the query");
			flag=false;
		}
		return DBValues;
	}



	public static String getValueByJsonPath(String jpath) throws Exception {
		JSONObject responseJson = null;
		Object obj = responseJson;
		for(String s: jpath.split("/")) {
			if(!s.isEmpty())
				if(!(s.contains("'") ||s.contains("]"))) 
					obj = ((JSONObject) obj).get(s);
				else if((s.contains("'") ||s.contains("]"))) {
					obj = ((JSONArray) ((JSONObject) obj).get(s.split("\\[")[0])).get(Integer.parseInt(s.split("\\[")[1].replace("]","")));
				}
		}
		return obj.toString(); 
	}
	public String[] getColumnNames(HashMap<List<String>, List<String>> dbValues) throws Exception {
		String[] ColumnNames = null;
		try {
			for ( List<String> DBColumnNames : dbValues.keySet() ) 
			{
				System.out.println( DBColumnNames );
				ColumnNames = new String[DBColumnNames.size()];
				ColumnNames = DBColumnNames.toArray(ColumnNames);
			}
		}catch(Exception e) {
			System.out.println("Unable to retrive column Values "+e.getMessage());
		}
		return ColumnNames;

	}

	public List<String> getDBValues(HashMap<List<String>, List<String>> dbValues) throws Exception {
		List<String> ColumnNames=null;
		try {
			for ( Entry<List<String>, List<String>> DBColumnNames : dbValues.entrySet() ) 
			{
				System.out.println( DBColumnNames );
				ColumnNames = DBColumnNames.getValue();
			}
		}catch(Exception e) {
			System.out.println("Unable to retrive column Values "+e.getMessage());
		}
		return ColumnNames;

	}
	/*
	 * Method to write JSON values in Excel File
	 */
	public ArrayList<String> jsonExcelWriter(String responseString,String[] ColumnNames,String testCaseName) throws Exception{
		ArrayList<String> valueslist=new ArrayList<String>();
		HashMap<String, List<String>> map=new HashMap<String,List<String>>();
		String param1=excel.getJsonValidator("Endpoints","Param1",testCaseName);
		String[] values= param1.split(",");
		values[1] = values[1].replace("\"", "");
		int j=Integer.valueOf(values[1]);
		j=0;
		try{
			JsonPath jsonPath = new JsonPath(responseString);
			int id=jsonPath.getInt("data["+j+"].id");
			String idstring=String.valueOf(id);
			String organisationId=jsonPath.getString("data["+j+"].organisationId");
			int recordType=jsonPath.getInt("data["+j+"].recordType");
			String recordTypeString=String.valueOf(recordType);
			String organisationName=jsonPath.getString("data["+j+"].organisationName");
			String organisationLegalName=jsonPath.getString("data["+j+"].organisationLegalName");
			String organisationStatus=jsonPath.getString("data["+j+"].organisationStatus");
			int organisationSourceId=jsonPath.getInt("data["+j+"].organisationSourceId");
			String organisationSourceIdString=String.valueOf(organisationSourceId);
			String OrganisationSourceName=jsonPath.getString("data["+j+"].OrganisationSourceName");
			valueslist.add(idstring);
			valueslist.add(organisationId);
			valueslist.add(organisationName);
			valueslist.add(organisationLegalName);
			valueslist.add(organisationSourceIdString);
			valueslist.add(organisationStatus);
			valueslist.add(recordTypeString);
			//valueslist.add(OrganisationSourceName);
			System.out.println(valueslist);
		}catch(Exception e) {
			System.out.println("Unable to retrive the values from Json");
		}
		return valueslist;
	}

	public String[] getJsonColumnNames(HashMap<List<String>, List<String>> dbValues) throws Exception {
		String[] ColumnNames = null;
		try {
			for ( List<String> DBColumnNames : dbValues.keySet() ) 
			{
				ColumnNames = new String[DBColumnNames.size()];
				ColumnNames = DBColumnNames.toArray(ColumnNames);
			}
		}catch(Exception e) {
			System.out.println("Unable to retrive column Values "+e.getMessage());
		}
		return ColumnNames;

	}

	public List<String> getJsonValues(HashMap<List<String>, List<String>> dbValues) throws Exception {
		List<String> ColumnNames=null;
		try {
			for ( Entry<List<String>, List<String>> DBColumnNames : dbValues.entrySet() ) 
			{
				ColumnNames = DBColumnNames.getValue();
			}
		}catch(Exception e) {
			System.out.println("Unable to retrive column Values "+e.getMessage());
		}
		return ColumnNames;

	}
	/*
	 * Method to get the values from Json validator sheet
	 */
	public String getjsonValue(String SheetName, String ScenarioName, String ColumnName) throws Exception {
		FileInputStream fi = new FileInputStream(JsonPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sheet = wb.getSheet(SheetName);
		Row row = sheet.getRow(0);
		int rownum = -1;
		String CellValue =null;
		int number = sheet.getLastRowNum();
		for (int j = 0; j <= number; j++) {
			Row row1 = sheet.getRow(j);
			for (int k = 0; k < row1.getLastCellNum(); k++) {
				if (row1.getCell(k).getStringCellValue().equalsIgnoreCase(ScenarioName)) {
					rownum = j;
					break;
				}
			}
		}
		short lastcolumnused = row.getLastCellNum();
		int colnum = -1;
		for (int i = 0; i < lastcolumnused; i++) {
			if (row.getCell(i).getStringCellValue().equalsIgnoreCase(ColumnName)) {
				colnum = i;
				break;
			}
		}
		row = sheet.getRow(rownum);
		Cell column = row.getCell(colnum);
		if (column.getCellTypeEnum() == CellType.STRING)
		{
			CellValue =column.getStringCellValue();
		}
		else if(column.getCellTypeEnum() == CellType.NUMERIC)
		{
			CellValue =String.valueOf(column.getNumericCellValue());
		}
		fi.close();
		return CellValue;
	}

	public String[] getStringArray(JSONArray jsonArray) {

		String[] stringArray = null;

		if (jsonArray != null) {

			int length = jsonArray.length();

			stringArray = new String[length];

			for (int i = 0; i < length; i++) {

				stringArray[i] = jsonArray.optString(i);

			}

		}

		return stringArray;

	}

	public HashMap<List<String>, List<String>> FetchJsonData(String response) throws Exception {
		HashMap<String,String> resultMap = new HashMap<String,String>();
		HashMap<List<String>, List<String>> JsonValues = new HashMap<List<String>,List<String>>();
		List<String> jsoncolum = new ArrayList<String>();
		List<String> jsonvalue = new ArrayList<String>();
		ObjectMapper mapperObj = new ObjectMapper();

		
		JSONObject jsonstring=new JSONObject(response);
		JSONArray jsonArray = jsonstring.getJSONArray("data");
		System.out.println("Input Json: "+jsonArray);

		String[] jsoninput=getStringArray(jsonArray);
		String UpdatedJsonValue=Arrays.toString(jsoninput);
		UpdatedJsonValue=(String) UpdatedJsonValue.substring(1, UpdatedJsonValue.length()-1).replaceAll(",",",");
		resultMap = mapperObj.readValue(UpdatedJsonValue,new TypeReference<HashMap<String,String>>(){});
		Set<String> keys = resultMap.keySet();
		Iterator itr =keys.iterator();
		while(itr.hasNext()) {
			String ColumnNames =(String) itr.next();
			String KeyValues= resultMap.get(ColumnNames);
			jsoncolum.add(ColumnNames);
			jsonvalue.add(KeyValues);
			JsonValues.put(jsoncolum, jsonvalue);
		}
		return JsonValues;
	}

	public String generateEndpoint(String SheetName, String ScenarioName) throws Exception {
		String BaseURI =getjsonValue(SheetName,ScenarioName,"BaseURI");
		String Resource =getjsonValue(SheetName,ScenarioName,"Resource");
		String ID =getjsonValue(SheetName,ScenarioName,"id");
		String Page =getjsonValue(SheetName,ScenarioName,"page");
		String PageSize =getjsonValue(SheetName,ScenarioName,"pageSize");
		RestAssured.baseURI=BaseURI;
		Response response=given().
				param("id",ID).
				param("page",Page).
				param("pageSize",PageSize).log().all().
				when().
				get(Resource);
		response.then().assertThat().statusCode(200).and().
		header("content-type", "application/json").
		extract().response();
		String responseString =response.asString();
		return responseString;
	}



}
