package academy.kata.steps.checkResponse;
import academy.kata.models.authorGetAllBooks.response.AuthorGetAllBooksResponse;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class AuthorGetAllBooks {
    public static void checkResponse(List<AuthorGetAllBooksResponse> authorGetAllBooksResponses) {
        assertThat(authorGetAllBooksResponses).isNotNull();
    }
}
