package tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class QueryParaExample {

    @Test
    public void queryParameterExample(){
        given()
                .queryParam("page", 2)
                .when()
                .get("https://reqres.in/api/users")
                .then()
                .statusCode(200);
    }
}
