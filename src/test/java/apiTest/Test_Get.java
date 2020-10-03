package apiTest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;



public class Test_Get {
	@Test
	public void get_Test()
	{
		baseURI="http://localhost:3000/";
		given().
		get("/users").
		then().
		statusCode(200).log().all();

		
	}

}
