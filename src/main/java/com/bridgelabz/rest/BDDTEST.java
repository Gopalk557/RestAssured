package com.bridgelabz.rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class BDDTEST {
    @Test
    public void getMethod() {
        Response response = RestAssured.get("http://localhost:3000/posts");
        response.prettyPrint();
        given().
                header("Content-Type", "application/json").
                get("http://localhost:3000/posts").
                then().
                statusCode(200);
    }

    @Test()
    public void postTest() {

        //  http://localhost:3000/posts/

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 1);
        jsonObject.put("title", "json-server");
        jsonObject.put("author", "Sachin");

        given().
                header("Content-Type", "application/json").
                body(jsonObject.toJSONString()).
                when().post("http://localhost:3000/posts/").then().statusCode(201);

    }

    @Test()
    public void putTest() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", "json-server");
        jsonObject.put("author", "John");

        given().
                header("Content-Type", "application/json").
                body(jsonObject.toJSONString()).
                when().put("http://localhost:3000/posts/1").then().statusCode(200);

    }

    @Test()
    public void deleteTest() {

        given().
                header("Content-Type", "application/json").
                when().delete("http://localhost:3000/posts/1").then().statusCode(200);

    }

    @Test
    public void getMethods() {
        Response response = RestAssured.get("http://localhost:3000/posts");
        response.prettyPrint();
        given().
                header("Content-Type", "application/json").
                get("http://localhost:3000/posts").
                then().
                statusCode(200);
    }
}