package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

public class PatchRequest {
    public static void main(String[] args){
        //Constructing the body Using Json Simple Library
        JSONObject body = new JSONObject();
        body.put("key1","value1");

        RestAssured.baseURI = "http//www.google.com/users";
        RestAssured.given().header("Content-type","application/json").contentType(ContentType.JSON)
                .body(body.toJSONString())
                .when().patch()
                .then().statusCode(200);
    }
}
