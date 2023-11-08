package APItest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertListContains;
import static org.testng.Assert.assertTrue;

public class API_Test {

    @Test
    public void test_1() {

        Response response = get("https://dog.ceo/api/breeds/list/all?retriever");

        System.out.println(response.getStatusCode());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getBody().asString());


    }

    @Test
    public void test_2() {

        RestAssured.baseURI = "https://dog.ceo/api";

        Response response = given()
                .when()
                .get("/breeds/list/all");

        response.then().statusCode(200);

        String responseBody = response.getBody().asString();

        boolean retrieverBreedExists = responseBody.contains("retriever");

        if (retrieverBreedExists) {
            System.out.println("The 'retriever' breed is within the list of breeds.");
        } else {
            System.out.println("The 'retriever' breed is not in the list of breeds.");
        }
    }


    @Test
    public void test_3() {

        RestAssured.baseURI = "https://dog.ceo/api";

        Response response = given()
                .when()
                .get("/breed/retriever/list");

        response.then().statusCode(200);

        String responseBody = response.getBody().asString();

        System.out.println("List of sub-breeds for 'retriever':");
        System.out.println(responseBody);
    }


    @Test
    public void test_4() {
        RestAssured.baseURI = "https://dog.ceo/api";

        Response response = given()
                .when()
                .get("/breed/retriever/golden/images/random");

        response.then().statusCode(200);

        String responseBody = response.getBody().asString();

        System.out.println("Random image/link for the 'golden' sub-breed:");
        System.out.println(responseBody);
    }
}


