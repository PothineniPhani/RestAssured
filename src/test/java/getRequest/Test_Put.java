package getRequest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class Test_Put {
	
	@Test
	public void Test_1_Put()
	{
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("name", "Phani");
		jsonObj.put("job", "Automation Tester");
		System.out.println("After=====>" + jsonObj);

		given().body(jsonObj.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();

		
	}

}
