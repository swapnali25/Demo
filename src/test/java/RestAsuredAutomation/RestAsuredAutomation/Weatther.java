package RestAsuredAutomation.RestAsuredAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Weatther {
	
	@Test
	public void VerifyCityInJsonResponse()
	{
	 RestAssured.baseURI = "https://restapi.demoqa.com/utilities/weather/city";
	 RequestSpecification httpRequest = RestAssured.given();
	 Response response =  httpRequest.queryParam("", "").get("/Hyderabad");
	
	 
	 // First get the JsonPath object instance from the Response interface
	 JsonPath jsonPathEvaluator = response.jsonPath();
	 
	 // Then simply query the JsonPath object to get a String value of the node
	 // specified by JsonPath: City (Note: You should not put $. in the Java code)
	 String city = jsonPathEvaluator.get("City");
	 
	 // Let us print the city variable to see what we got
	 System.out.println("City received from Response " + city);
	 
	 // Validate the response
	 Assert.assertEquals(city, "Hyderabad", "Correct city name received in the Response");
	 
	}
	
	
	
	

}
