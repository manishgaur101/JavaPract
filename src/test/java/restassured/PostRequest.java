package restassured;

import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.specification.*;
import org.json.simple.JSONObject;

public class PostRequest {
    public static void main(String[] args){
        //Constructing the body Using Json Simple Library
        JSONObject body = new JSONObject();
        body.put("key1","value1");
        body.put("key2","value2");

        RestAssured.baseURI = "http//www.google.com/users";
        RestAssured.given().header("Content-type","application/json").contentType(ContentType.JSON)
                .body(body.toJSONString())
                .when().post()
                .then().statusCode(201);


    }
}
