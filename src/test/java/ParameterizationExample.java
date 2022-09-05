import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class ParameterizationExample {


    @Test
    void testPost(String firstName, String lastName, int subjectID ){
        JSONObject request = new JSONObject();
        request.put("fName", firstName);
        request.put("lName", lastName);
        request.put("subjectId", subjectID);

        baseURI = "https://reqres.in/api";

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type", "application/json").
                body(request.toJSONString()).
        when().
                post("/users").
        then().
                statusCode(201).
                log().all();
    }

    @Parameters({"usersId"})
    @Test
    void testDelete(int usersId){
        baseURI = "https://reqres.in/api";
        when().
                post("/usersId" + usersId).
        then().
                statusCode(415);
    }
}
