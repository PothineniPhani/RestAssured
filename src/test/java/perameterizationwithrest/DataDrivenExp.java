package perameterizationwithrest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DataDrivenExp {

	@DataProvider(name = "dataProvider")
	public Object[][] post_data() {
		/*
		 * Object[][] data=new Object[2][3]; data[0][0] ="Albert"; data[0][1] ="Peter";
		 * data[0][2] =2;
		 * 
		 * data[1][0] ="Tom"; data[1][1] ="Peter"; data[1][2] =3;
		 */

		return new Object[][] { { "Graham", "Bell", 3 }, { "Galvin", "Pravin", 4 }, { "raja", "ravi", 4 } };
	}

	@Test(dataProvider = "dataProvider")
	public void Test_Post(String firstname, String lastname, int subjectId) {
		baseURI = "http://localhost:3000/";
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("firstname", firstname);
		jsonObj.put("lastname", lastname);
		jsonObj.put("subjectId", subjectId);

		given().contentType(ContentType.JSON).accept(ContentType.JSON).header("content-Type", "application/json")
				.body(jsonObj.toJSONString()).when().post("/users").then().statusCode(201).log().all();
	}

}
