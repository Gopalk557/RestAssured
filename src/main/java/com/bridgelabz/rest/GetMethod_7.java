package com.bridgelabz.rest;

import io.restassured.RestAssured;
import io.restassured.internal.path.json.mapping.JsonObjectDeserializer;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Test;
import org.junit.runner.Request;

public class GetMethod_7 {
    @Test
    public void Test() {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        // RestAssured.given().when().get("https://reqres.in/api/users?page=2").then().body("total",(12));
        System.out.println("Status code: " + response.statusCode());

        System.out.println("Response body: " + response.prettyPrint());
    }

    @Test
    public void postTest() {
        RequestSpecification request = RestAssured.given();
        request.header("content-type", "application/json");
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("id", 3);
        jsonobject.put("title", "Testing");
        jsonobject.put("author", "Gopal");
        request.body(jsonobject.toJSONString());
        Response response = request.post("http://localhost:3000/posts");
        System.out.println(response.getStatusCode());
        System.out.println(response.prettyPrint());
    }

   @Test
    public void GetTest()
   {
       RequestSpecification request = RestAssured.given();
       request.header("content-type", "application/json");
       Response response = request.get("http://localhost:3000/posts");
       System.out.println(response.getStatusCode());
       System.out.println(response.prettyPrint());
   }
   @Test
    public void PutTest()
   {
       RequestSpecification request = RestAssured.given();
       request.header("content-type", "application/json");
       JSONObject jsonobject = new JSONObject();
       jsonobject.put("id", 3);
       jsonobject.put("title", "Manual testing");
       jsonobject.put("author", "Gopal");
       request.body(jsonobject.toJSONString());
       Response response = request.put("http://localhost:3000/posts/3");
       System.out.println(response.getStatusCode());
       System.out.println(response.prettyPrint());
   }
   @Test
    public void DeleteTest()
   {
       RequestSpecification request = RestAssured.given();
       request.header("content-type", "application/json");
       JSONObject jsonobject = new JSONObject();
       jsonobject.put("id", 3);
       jsonobject.put("title", "Manual testing");
       jsonobject.put("author", "Gopal");
       request.body(jsonobject.toJSONString());
       Response response = request.delete("http://localhost:3000/posts/3");
       System.out.println(response.getStatusCode());
       System.out.println(response.prettyPrint());
   }
}