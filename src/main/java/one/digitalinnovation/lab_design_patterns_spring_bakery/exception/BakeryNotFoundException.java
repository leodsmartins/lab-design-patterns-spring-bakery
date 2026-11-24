package one.digitalinnovation.lab_design_patterns_spring_bakery.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BakeryNotFoundException extends RuntimeException {

  public BakeryNotFoundException(String type) {
    super("Confeitaria não encontrada: " + type);
  }
}
