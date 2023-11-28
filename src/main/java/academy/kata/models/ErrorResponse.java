package academy.kata.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude
public class ErrorResponse {
    int errorCode;
    String errorMessage;
    String errorDetails;
}
