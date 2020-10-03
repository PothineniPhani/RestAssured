package apiTest;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class Test_Put {
	@Test
	public void put_Test() {
		baseURI = "http://localhost:3000/";
		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("lastname", "Tom");


		given().contentType(ContentType.JSON).accept(ContentType.JSON).
		header("content-Type","application/json").
		body(jsonObj.toJSONString()).
		when().
		put("/users/4").
		then().
		statusCode(200).log().all();
		
	}

}
