package technifutur.Rental_Management.model.form;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
public class RegistrationForm {

    private String last_name;

    private String first_name;

    private String username;

    private String password;

}
