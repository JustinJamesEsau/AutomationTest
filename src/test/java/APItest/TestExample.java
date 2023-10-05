package APItest;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TestExample {

    @Test
    public void test_1() {

        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getBody().asString());

    }
}
