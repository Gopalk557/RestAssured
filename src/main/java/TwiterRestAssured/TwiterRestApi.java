package TwiterRestAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

public class TwiterRestApi
{
    @Test
    public void twiterPost(){
        Response response = RestAssured.given()
                .auth().oauth("IQvcWRbypPKbaJsiTjiOzcsPL",
                        "vGHETVF5Uz4GfdrufENVGvuzavIdniSbDBUcAODHSLLSsUXiBX",
                        "1527489217734905856-Q43uT0HrtbVoG5tY9w3YoW89teqPik",
                        "aoS41N5Y7V4HSL38dJBstTzU7YiETJr71vTWJBtL8upRO")
                .post("https://api.twitter.com/1.1/statuses/update.json?status=My First tweet via Rest Assured");
        System.out.println(response.prettyPrint());
        JsonPath jsonPath= response.jsonPath();
        System.out.println("ID:"+ jsonPath.get("id_str"));

    }
    @Test
    public void retwitPost()
    {
        Response response = RestAssured.given()
                .auth().oauth("IQvcWRbypPKbaJsiTjiOzcsPL",
                        "vGHETVF5Uz4GfdrufENVGvuzavIdniSbDBUcAODHSLLSsUXiBX",
                        "1527489217734905856-Q43uT0HrtbVoG5tY9w3YoW89teqPik",
                        "aoS41N5Y7V4HSL38dJBstTzU7YiETJr71vTWJBtL8upRO")
                .post("https://api.twitter.com/1.1/statuses/retweet/1528228681294168064.json");
        System.out.println(response.prettyPrint());

    }

}