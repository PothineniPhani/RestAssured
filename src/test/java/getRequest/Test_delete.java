package getRequest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Test_delete {
	@Test
	public void Test_1_Delete()
	{
		when().delete("https://reqres.in/api/users/2").
		then().statusCode(204);
	}

}
