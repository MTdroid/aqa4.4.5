package academy.kata.models.authorGetAllBooks.response;


import academy.kata.entity.Author;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;

@Data
@JsonIgnoreProperties(allowSetters = true)
public class AuthorGetAllBooksResponse {
    @XmlElement(name = "book_title", required = true)
    private String bookTitle;
    @XmlElement(name = "author", required = true)
    private Author author;
}

