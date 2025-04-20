package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import java.util.HashMap;
import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.equalTo;

public class CreateUserTest extends BaseTest {

    @Test
    public void createUser(){
        HashMap<String, String> request = new HashMap<>();
        request.put("name", "morpheus");
        request.put("job", "leader");

        given()
                .log().all()
                .header("Content-Type", "application/json")
                .body(request)
                .when()
                .post("/users")
                .then()
                .log().all()
                .statusCode(201)
                .body("name", equalTo("morpheus"))
                .body("job", equalTo("leader"));

    }
}
