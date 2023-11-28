package academy.kata.steps.checkResponse;

import academy.kata.models.authorsSave.response.AuthorsSaveResponse;
import academy.kata.rest.ReqSpecificationn;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.request;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AuthorSave {
    public static void checkResponse(AuthorsSaveResponse author) {
        assertNotNull(author.getAuthorId());



    }
}
