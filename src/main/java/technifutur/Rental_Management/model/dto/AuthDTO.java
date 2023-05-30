package technifutur.Rental_Management.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthDTO {

    private String username;
    private String token;
    private long id_user;

}