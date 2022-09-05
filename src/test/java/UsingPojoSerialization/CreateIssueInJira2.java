package UsingPojoSerialization;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class CreateIssueInJira2 {

    public void createJessionID(){
        JSONObject json = new JSONObject();
        json.put("username", "saurav");
        json.put("password", "abcd@1234");

        Response resp = RestAssured.given()
                .header("content-Type", "application/json")
                .body(json).post("");
    }
}
