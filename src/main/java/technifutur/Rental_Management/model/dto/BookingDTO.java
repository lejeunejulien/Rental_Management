package technifutur.Rental_Management.model.dto;

import lombok.Data;
import technifutur.Rental_Management.model.entity.Registered_user;
import technifutur.Rental_Management.model.entity.Vehicle_properties;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class BookingDTO {

    //private Boolean validation; //-> définit par admin
    private long id;
    private String adress;
    private LocalDateTime start_date;
    private LocalDateTime arrival_date;
    private UserDTO USerDTO;
    private Vehicle_propertiesDTO_User vehicle_propertiesDTO_user;
}
