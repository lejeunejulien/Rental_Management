package technifutur.Rental_Management.model.form;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginForm {

    private String username;

    private String password;
}
