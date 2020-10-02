package getRequest;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_Post {
	@Test
	public void Test_1_Post() {
		/*
		 * Map<String, Object> map = new HashMap<String, Object>(); map.put("Name",
		 * "Phani"); map.put("job", "IT EMP");
		 * 
		 * System.out.println("Before=====>" + map);
		 */
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("name", "Phani");
		jsonObj.put("job", "Automation Tester");
		System.out.println("After=====>" + jsonObj);

		given().body(jsonObj.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201);

	}

}
