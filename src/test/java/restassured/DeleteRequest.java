package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteRequest {
    public static void main(String[] args){
        RestAssured.baseURI = "http//www.google.com/users";
        RestAssured.given()
                .when().delete()
                .then().statusCode(204);
    }
}
