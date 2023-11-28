package unit;

import academy.kata.models.authorGetAllBooks.response.AuthorGetAllBooksResponse;
import academy.kata.models.authorsSave.response.AuthorsSaveResponse;
import academy.kata.rest.ReqSpecificationn;
import academy.kata.steps.checkResponse.AuthorGetAllBooks;
import academy.kata.steps.checkResponse.AuthorSave;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AuthorGetAllBooksTest {
    @Test
    @DisplayName("Получение всех книг автора")
    @Description("В консоль должны вывестись все книги автора")
    @Epic("API тесты")
    @Story("Позитивные тесты")
    public void getAllBooksTest() {

        AuthorsSaveResponse author = ReqSpecificationn.authorsSaveResponse("marat", "abc", "cba");
        AuthorSave.checkResponse(author);

        List<AuthorGetAllBooksResponse> authorGetAllBooksResponses = ReqSpecificationn.authorGetAllBooksResponse(author.getAuthorId().intValue());
        AuthorGetAllBooks.checkResponse(authorGetAllBooksResponses);
    }
}


