package technifutur.Rental_Management.model.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RegistrationForm {

    @NotNull
    private String userName;

    @NotNull
    @Size(min =4)
    private String password;

}
