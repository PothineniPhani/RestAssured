package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {

	@Test
	public void get_request() {

		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString());
		System.out.println(response.getBody());
		// System.out.println(response.getStatusCode());
		int statusCode = response.getStatusCode();
		Assert.assertEquals(200, statusCode);

		System.out.println(response.getTime());
	}
	
	@Test
	public void get_request1()
	{
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
		
	}

}
