package unit;

import academy.kata.models.authorGetAllBooksXML.response.AuthorGetAllBooksXMLResponse;
import academy.kata.models.authorsSave.response.AuthorsSaveResponse;
import academy.kata.rest.ReqSpecificationn;
import academy.kata.steps.checkResponse.AuthorGetAllBooksXML;
import academy.kata.steps.checkResponse.AuthorSave;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AuthorGetAllBooksXMLTest {

    @Test
    @DisplayName("Получение всех книг автора в формате XML")
    @Description("В консоль должны вывестись все книги автора")
    @Epic("API тесты")
    @Story("Позитивные тесты")
    public void getAllBooksXMLTest() {

        AuthorsSaveResponse author = ReqSpecificationn.authorsSaveResponse("jon", "doe", "sads");
        AuthorSave.checkResponse(author);

        List<AuthorGetAllBooksXMLResponse> authorGetAllBooksXMLResponses = ReqSpecificationn.authorGetAllBooksXMLResponse(Math.toIntExact(author.getAuthorId()));
        AuthorGetAllBooksXML.checkResponse(authorGetAllBooksXMLResponses);
    }
}

