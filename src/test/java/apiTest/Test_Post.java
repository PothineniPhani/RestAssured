package apiTest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;

public class Test_Post {
	@Test
	public void TestPost()

	{
		baseURI = "http://localhost:3000/";
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("firstname", "Tom");
		jsonObj.put("lastname", "Peter");
		jsonObj.put("subjectId", "1");

		given().contentType(ContentType.JSON).accept(ContentType.JSON).
		header("content-Type","application/json").
		body(jsonObj.toJSONString()).
		when().
		post("/users").
		then().
		statusCode(201).log().all();
		
		
		
		

	}

}
