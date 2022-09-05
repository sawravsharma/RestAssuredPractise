import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TestPutMethod {
    @Test
    void testPut(){
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("name" , "Jak`e");
        map.put("job", "QA");

        JSONObject request = new JSONObject(map);
        System.out.println(request);

        given().
                body(request.toJSONString()).
        when().
                put("https://reqres.in/api/users/2").
        then().statusCode(200).log().all();
    }
}
