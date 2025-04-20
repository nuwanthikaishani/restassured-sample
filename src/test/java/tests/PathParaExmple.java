package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PathParaExmple {
    @Test
    public void pathParameterExample(){

        given()
                .pathParams("userId", 2)
                .when()
                .get("https://reqres.in/api/users/{userId}")
                .then()
                .statusCode(200);

    }
}
