package technifutur.Rental_Management.model.form;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data // pourquoi cela et pas dans registrationform
public class LoginForm {

    @NotNull
    private String username;

    @NotNull
    private String password;
}
