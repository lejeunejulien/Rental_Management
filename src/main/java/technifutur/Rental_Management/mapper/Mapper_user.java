package technifutur.Rental_Management.mapper;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.UserDTO;
import technifutur.Rental_Management.model.dto.Vehicle_propertiesDTO;
import technifutur.Rental_Management.model.entity.Registered_user;
import technifutur.Rental_Management.model.entity.Vehicle_properties;
import technifutur.Rental_Management.model.form.RegistrationForm;
import technifutur.Rental_Management.model.form.VehiclePropertiesCreateForm;

@Service
public class Mapper_user {

    public UserDTO toRegisteredUserDTO(Registered_user entity){
        UserDTO dto = new UserDTO();
        dto.setId(entity.getId());
        dto.setUsername(entity.getUsername());

        return dto;
    }

    public Registered_user toRegisteredUserEntity(RegistrationForm form){
        Registered_user entity = new Registered_user();

        entity.setFirst_name(form.getFirst_name());
        entity.setLast_name(form.getLast_name());
        entity.setUsername(form.getUsername());
        entity.setPassword(form.getPassword());

        return entity;
    }
}
