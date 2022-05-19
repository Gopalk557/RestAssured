package com.bridgelabz.rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class BDDProfileTest
{
    @Test
    public void getMethod()
    {
        Response response = RestAssured.get("http://localhost:3000/profile");
        response.prettyPrint();
        given().
                header("Content-Type", "application/json").
                get("http://localhost:3000/profile").
                then().
                statusCode(200);
    }
    @Test()
    public void postTest() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "gopal");

        given().
                header("Content-Type", "application/json").
                body(jsonObject.toJSONString()).
                when().post("http://localhost:3000/profile").
                then().statusCode(201);

    }

    @Test()
    public void putTest() {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "monu");

        given().
                header("Content-Type", "application/json").
                body(jsonObject.toJSONString()).
                when().put("http://localhost:3000/profile").
                then().statusCode(200);

    }

    @Test()
    public void deleteTest() {

        given().
                header("Content-Type", "application/json").
                when().delete("http://localhost:3000/profile").
                then().statusCode(200);

    }


}
