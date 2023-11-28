package academy.kata.models.booksSave.response;

import academy.kata.models.authorsSave.request.AuthorsSaveRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookResponse {
  private String bookTitle;
  private AuthorsSaveRequest author;
}
