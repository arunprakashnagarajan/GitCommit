package com.zurich.sda.apitesting;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.zurich.components.CommonFunctions;
import com.zurich.components.ReusableMethods;

import io.restassured.RestAssured;

public class HomeScenario extends ReusableMethods{
	CommonFunctions common = new CommonFunctions();
	boolean flag=false;
	HashMap<List<String>, List<String>> JsonValue= new HashMap<List<String>, List<String>>();
	Logger log= Logger.getLogger(SDAAPI_scenarios.class.getName());

	@Test
	public void ClaimScenario() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="ClaimScenario";
		try {
			boolean flag=common.DBValidation(testCaseName);
			if(!flag) {
				Assert.fail("Unable to retrive the values "+testCaseName);
			}
			log.info("The Query values are Retrived for the "+testCaseName+" scenario and writtein the Query Writter sheet" );

			flag=common.JsonValidation(testCaseName);
			if(!flag) {
				Assert.fail("Unable to Generate the values "+testCaseName);
			}
			log.info("The Json values are generated for the "+testCaseName+" scenario and writtein the JSON Writter sheet" );

		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail("The execution got failed: "+e.getMessage());
		}

	}
}