package com.bridgelabz.rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class BddComments
{
    @Test
    public void getMethod()
    {
        Response response = RestAssured.get("http://localhost:3000/comments");
        response.prettyPrint();
        given().
                header("Content-Type", "application/json").
                get("http://localhost:3000/comments").
                then().
                statusCode(200);
    }
    @Test()
    public void postTest() {

        //  http://localhost:3000/comments

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 3);
        jsonObject.put("body", "server");
        jsonObject.put("postId", 1);

        given().
                header("Content-Type", "application/json").
                body(jsonObject.toJSONString()).
                when().post("http://localhost:3000/comments").
                then().statusCode(201);

    }

    @Test()
    public void putTest() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("body", "j-server");
        jsonObject.put("postId", 3);

        given().
                header("Content-Type", "application/json").
                body(jsonObject.toJSONString()).
                when().put("http://localhost:3000/comments/3").
                then().statusCode(200);

    }

    @Test()
    public void deleteTest() {

        given().
                header("Content-Type", "application/json").
                when().delete("http://localhost:3000/comments/4").
                then().statusCode(200);

    }


}
