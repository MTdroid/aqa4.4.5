package academy.kata.steps.checkResponse;
import academy.kata.models.authorGetAllBooksXML.response.AuthorGetAllBooksXMLResponse;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class AuthorGetAllBooksXML {
    public static void checkResponse(List<AuthorGetAllBooksXMLResponse> authorGetAllBooksXMLResponses) {
        assertThat(authorGetAllBooksXMLResponses).isNotNull();
    }
}
