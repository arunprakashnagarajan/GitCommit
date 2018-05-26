package com.zurich.sda.apitesting;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.zurich.components.CommonFunctions;
import com.zurich.components.ReusableMethods;
import io.restassured.RestAssured;

public class SDAAPI_scenarios extends ReusableMethods {

	CommonFunctions common = new CommonFunctions();
	boolean flag=false;
	HashMap<List<String>, List<String>> JsonValue= new HashMap<List<String>, List<String>>();
	Logger log= Logger.getLogger(SDAAPI_scenarios.class.getName());

	@Test
	public void AgencyScenario() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="AgencyScenario";
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

	@Test
	public void AgencypropositionScenario() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="AgencypropositionScenario";
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
	@Test
	public void AgencytypeScenario() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="AgencytypeScenario";
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
	@Test
	public void BrokerAddressScenario() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="BrokerAddressScenario";
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
	@Test
	public void BrokerAddresLinkScenario() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="BrokerAddresLinkScenario";
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
	@Test
	public void BrokerPropositionScenario() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="BrokerPropositionScenario";
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
	@Test
	public void BrokerpropositiontypeScenario() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="BrokerpropositiontypeScenario";
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
	@Test
	public void BrokersegmentationScenario() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="BrokersegmentationScenario";
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
	@Test
	public void BrokerSegmentationplScenario() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="BrokerSegmentationplScenario";
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
	@Test
	public void DealScenario() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="DealScenario";
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
	@Test
	public void OrgScenario1() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="OrgScenario1";
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
	//Arunn Need To verify this testcase
	@Test
	public void OrganisationhierarchyScenario() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="OrganisationhierarchyScenario";
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
	@Test
	public void ClaimExposureScenario() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="ClaimExposureScenario";
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
	@Test
	public void ClaimIndicatorsScenario() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="ClaimIndicatorsScenario";
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
	@Test
	public void ClaimPartyRoleScenario() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="ClaimPartyRoleScenario";
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

	}@Test
	public void PaymentsTransactionScenario() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="PaymentsTransactionScenario";
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

	}@Test
	public void Reservetransactions() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Reservetransactions";
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

	}@Test
	public void Businesssegment() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Businesssegment";
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

	}@Test
	public void Conviction() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Conviction";
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

	}@Test
	public void Coverage() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Coverage";
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
	@Test
	public void Coveragepremium() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Coveragepremium";
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
	@Test
	public void Coveragerisklink() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Coveragerisklink";
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
	@Test
	public void Driver() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Driver";
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
	@Test
	public void Endorsement() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Endorsement";
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
	@Test
	public void PolicyExposure() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="PolicyExposure";
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
	@Test
	public void Home() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Home";
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
	@Test
	public void Limit() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Limit";
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
	@Test
	public void PolicyHeader() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="PolicyHeader";
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
	@Test
	public void Policyholder() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Policyholder";
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
	@Test
	public void PolicyServicing() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="PolicyServicing";
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
	@Test
	public void Preinceptionclaim() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Preinceptionclaim";
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
	@Test
	public void Pricingbrokered() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Pricingbrokered";
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
	@Test
	public void Prciningfastflow() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Prciningfastflow";
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
	
	@Test
	public void Riskretention() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Riskretention";
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
	@Test
	public void riskUnit() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="riskUnit";
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
	@Test
	public void Transactionentry() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Transactionentry";
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
	@Test
	public void TransactionPremium() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="TransactionPremium";
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

	@Test
	public void Vehicle() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="Vehicle";
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
	@Test
	public void VehicleDriverlink() throws Exception{
		RestAssured.useRelaxedHTTPSValidation();
		String testCaseName ="VehicleDriverlink";
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
