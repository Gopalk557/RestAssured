package com.bridgelabz.rest;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class GetMethod
{
    @Test
    public void Test()
    {
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println("Status code: " + response.statusCode());

        System.out.println("Response body: " + response.prettyPrint());
        Assert.assertEquals(response.statusCode(),200);

    }
}