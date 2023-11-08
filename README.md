ABSA Assessment


---Task 1 - API:---

# Dog API Response Retrieval

This README provides instructions for using a Java program with REST Assured to retrieve information from the Dog API:

1. **Verifying all Dog breeds
   - This test checks a list of all Dof breeds.
   - To execute this test, run the `test_1` Unit Test class - API_Test in package - APItest.

2. **Verifying the Existence of "retriever" Breed**
   - This test checks if the "retriever" breed is included in the list of all breeds from the Dog API.
   - To execute this test, run the `test_2` Unit Test class - API_Test in package - APItest.

3. **Listing Sub-Breeds for "retriever"**
   - This test retrieves the list of sub-breeds for the "retriever" breed.
   - To execute this test, run the `test_3` Unit Test class - API_Test in package - APItest.

4. **Getting a Random Image/Link for "golden" Sub-Breed**
   - This test fetches a random image or link for the "golden" sub-breed.
   - To execute this test, run the `test_4` Unit Test class - API_Test in package - APItest.

## Prerequisites
- Java development environment.
- Maven 

## Usage
1. Clone this repository or create a new Java project.
2. Add the necessary dependencies for REST Assured and JUnit to your project's `pom.xml` file.

```xml
<dependencies>
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>4.5.0</version> <!-- Make sure to use the appropriate version -->
    </dependency>
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>json-path</artifactId>
        <version>4.5.0</version> <!-- Make sure to use the appropriate version -->
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.7.0</version> <!-- Make sure to use the appropriate version -->
        <scope>test</scope>
    </dependency>
</dependencies>
```

3. Run the test classes using your IDE or Maven.

## Running the Tests
- Execute each test class individually to get the desired API response.
- Each class will make an API request, validate the response status code, and display the API response in the console.



---Task 2 - Web:---

1. To execute the tests navigate to \src\test\java\StepDefinitions\TestRunner and make sure the tags at line 12 equal "@Task2User1" or "@Task2User2"

2. open the IDE terminal make sure you are in the directory of the POM file. Execute test with the following command mvn test

3. navigate to \target\reports open in chrome browser to view report of executed test

**Note webdriver is in the following directory \src\test\resources\Drivers and is version 119 chromewebdriver 
