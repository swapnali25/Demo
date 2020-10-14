package RestAsuredAutomation.RestAsuredAutomation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AppTest 
{
    
	@Test
	public void GetTest()
	{
		
		RestAssured.baseURI="";
		
		RequestSpecification httpRequest=RestAssured.given();
		
		Response response=httpRequest.request(Method.GET,"2");
		System.out.println("Response Body:"+response);
	}
}
