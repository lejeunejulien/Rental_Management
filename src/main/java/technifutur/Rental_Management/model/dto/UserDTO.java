package technifutur.Rental_Management.model.dto;
import lombok.Data;


@Data
public class UserDTO {
    private long id;
    private String last_name;
    private String first_name;
    private String username;
    private String password;
}
