package restassured;

import io.restassured.*;
import io.restassured.response.*;
import io.restassured.specification.*;

public class QueryParameter {
    public static void main(String[] args){
        RestAssured.baseURI="";
        Response response  = RestAssured.given()
       .queryParam("name","manish").queryParam("age",32)
                .when().get();
        ResponseBody body = response.getBody();
        String responseBody = body.asString();


    }
}
