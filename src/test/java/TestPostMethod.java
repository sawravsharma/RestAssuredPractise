import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class TestPostMethod {
    @Test
    void testPost(){
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("name" , "Jake");
        map.put("job", "QA");

        JSONObject request = new JSONObject(map);
        System.out.println(request);

        given().
                body(request.toJSONString()).
        when().
                post("https://reqres.in/api/users").
        then().statusCode(201);
    }
}
