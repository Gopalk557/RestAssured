package com.bridgelabz.rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.junit.Test;

public class CurdForProfiles
{
    @Test
    public void GetProfiles()
    {
        RequestSpecification request = RestAssured.given();
        request.header("content-type", "application/json");
        Response response = request.get("http://localhost:3000/profile");
        System.out.println(response.getStatusCode());
        response.prettyPrint();
    }

    @Test
    public void PostProfiles() {
        RequestSpecification request = RestAssured.given();
        request.header("content-type", "application/json");
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("name", "typicode1");
        request.body(jsonobject.toJSONString());
        Response response = request.post("http://localhost:3000/profile");
        System.out.println(response.getStatusCode());
        System.out.println(response.prettyPrint());
    }

    @Test
    public void PostProfil() {
        RequestSpecification request = RestAssured.given();
        request.header("content-type", "application/json");
        JSONObject jsonobject = new JSONObject();
        //jsonobject.put("id", 3);
        //jsonobject.put("title", "Testing");
        //jsonobject.put("author", "Gopal");
        jsonobject.put("name", "typicode1");
        jsonobject.put("name", "typicode2");
        jsonobject.put("name", "typicode3");
        jsonobject.put("name", "typicode4");
        request.body(jsonobject.toJSONString());
        Response response = request.post("http://localhost:3000/profile");
        System.out.println(response.getStatusCode());
        System.out.println(response.prettyPrint());
    }

    @Test
    public void PutProfiles() {
        RequestSpecification request = RestAssured.given();
        request.header("content-type", "application/json");
        JSONObject jsonobject = new JSONObject();

        jsonobject.put("name1", "typicode2");
        request.body(jsonobject.toJSONString());
        Response response = request.put("http://localhost:3000/profile");
        System.out.println(response.getStatusCode());
        System.out.println(response.prettyPrint());
    }

    @Test
    public void DeleteProfiles()
    {
        RequestSpecification request = RestAssured.given();
        Response response = request.delete("http://localhost:3000/profile/3");
        System.out.println(response.getStatusCode());
        System.out.println(response.prettyPrint());
    }

    @Test
    public void GetComment() {
        RequestSpecification request = RestAssured.given();
        Response response = request.get(" http://localhost:3000/comments");
        System.out.println(response.getStatusCode());
        System.out.println(response.prettyPrint());
    }

    @Test
    public void PostComment() {
        RequestSpecification request = RestAssured.given();
        request.header("content-type", "application/json");
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("id", 2);
        jsonobject.put("body", "comment 2");
        jsonobject.put("postId", 2);
        request.body(jsonobject.toJSONString());
        Response response = request.post("http://localhost:3000/comments");
        System.out.println(response.getStatusCode());
        System.out.println(response.prettyPrint());
    }

    @Test
    public void PutComment() {
        RequestSpecification request = RestAssured.given();
        request.header("content-type", "application/json");
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("id", 2);
        jsonobject.put("body", "comment 2");
        jsonobject.put("postId", 3);
        request.body(jsonobject.toJSONString());
        Response response = request.put("http://localhost:3000/comments/2");
        System.out.println(response.getStatusCode());
        System.out.println(response.prettyPrint());
    }
    @Test
    public void DeleteComment()
    {
        RequestSpecification request = RestAssured.given();
        Response response = request.delete("http://localhost:3000/comments/2");
        System.out.println(response.getStatusCode());
        System.out.println(response.prettyPrint());
    }
}
