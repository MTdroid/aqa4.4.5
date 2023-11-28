package academy.kata.rest;

import academy.kata.models.authorGetAllBooks.response.AuthorGetAllBooksResponse;
import academy.kata.models.authorGetAllBooksXML.request.AuthorGetAllBooksXMLRequest;
import academy.kata.models.authorGetAllBooksXML.response.AuthorGetAllBooksXMLResponse;
import academy.kata.models.authorsSave.request.AuthorsSaveRequest;
import academy.kata.models.authorsSave.response.AuthorsSaveResponse;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.List;

import static io.restassured.RestAssured.given;


public class ReqSpecificationn {
    public static RequestSpecification requestSpecification() {

        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("http://localhost:8080")
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .build();
    }

    public static RequestSpecification requestSpecificationXML() {

        return new RequestSpecBuilder()
                .setContentType(ContentType.XML)
                .setBaseUri("http://localhost:8080")
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .build();
    }

    public static AuthorsSaveResponse authorsSaveResponse(String firstName, String familyName, String secondName) {
        AuthorsSaveRequest author = new AuthorsSaveRequest(firstName, familyName, secondName);

        return given()
                .spec(requestSpecification())
                .body(author)
                .when()
                .post(Endpoint.authorsSave)
                .then()
                .assertThat()
                .statusCode(201)
                .extract().as(AuthorsSaveResponse.class);
    }

    public static List<AuthorGetAllBooksResponse> authorGetAllBooksResponse(int authorId) {

        return given()
                .spec(requestSpecification())
                .when()
                .get(Endpoint.authorGetAllBooks, authorId)
                .then()
                .assertThat()
                .statusCode(200)
                .extract().jsonPath().getList(".", AuthorGetAllBooksResponse.class);

    }
    public static List<AuthorGetAllBooksXMLResponse> authorGetAllBooksXMLResponse(int authorId) {
        AuthorGetAllBooksXMLRequest author = new AuthorGetAllBooksXMLRequest();
        author.setId(authorId);

        return given()
                .spec(requestSpecificationXML())
                .body(author)
                .when()
                .post(Endpoint.authorGetAllBooksXML)
                .then()
                .assertThat()
                .statusCode(200)
                .extract().xmlPath().getList(".", AuthorGetAllBooksXMLResponse.class);
    }
}
