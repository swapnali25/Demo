package RestAsuredAutomation.RestAsuredAutomation;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class QueryParams {
	
	public class QUERYPARAMETERRequest {
		 
		 @Test
		        public void queryParameter() {
		 
		 RestAssured.baseURI ="https://samples.openweathermap.org/data/2.5/"; 
		 RequestSpecification request = RestAssured.given();
		 
		 Response response = request.queryParam("q", "London,UK") 
		                    .queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8") 
		                    .get("/weather");
		 
		 String jsonString = response.asString();
		 System.out.println(response.getStatusCode()); 
		 Assert.assertEquals(jsonString.contains("London"), true);
		 
		 }
		}	
	
	@SuppressWarnings("unchecked")
	@Test
	public void RegistrationSuccessful()
	{		
		RestAssured.baseURI ="https://restapi.demoqa.com/customer";
		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "Virender"); // Cast
		requestParams.put("LastName", "Singh");
		requestParams.put("UserName", "sdimpleuser2dd2011");
		requestParams.put("Password", "password1");

		requestParams.put("Email",  "sample2ee26d9@gmail.com");
		request.body(requestParams.toJSONString());
		Response response = request.post("/register");

		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, "201");
		String successCode = response.jsonPath().get("SuccessCode");
		Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
	}

}
