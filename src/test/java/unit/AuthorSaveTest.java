package unit;

import academy.kata.models.authorsSave.response.AuthorsSaveResponse;
import academy.kata.rest.ReqSpecificationn;
import academy.kata.steps.checkResponse.AuthorSave;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AuthorSaveTest {
    @Test
    @DisplayName("Добавление нового автора")
    @Description("Должен добавиться автор с уникальным id")
    @Epic("API тесты")
    @Story("Позитивные тесты")
    public void saveAuthor() {
        AuthorsSaveResponse author = ReqSpecificationn.authorsSaveResponse("john", "lalala", "lalala");
        AuthorSave.checkResponse(author);
    }
}
