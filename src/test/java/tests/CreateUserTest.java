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
        request.put("name", "Neo");
        request.put("job", "leader");

        given()
                .header("Content-Type", "application/json")
                        .body(request)
                .when()
                .post("/users")
                .then()
                .statusCode(201);

    }
}
