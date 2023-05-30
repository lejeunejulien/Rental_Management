package technifutur.Rental_Management.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.BookingDTO;
import technifutur.Rental_Management.model.dto.Vehicle_propertiesDTO;
import technifutur.Rental_Management.model.dto.Vehicle_propertiesDTO_User;
import technifutur.Rental_Management.model.entity.Vehicle_properties;
import technifutur.Rental_Management.model.form.BookingCreateForm;
import technifutur.Rental_Management.model.form.VehiclePropertiesCreateForm;

import java.util.List;


public interface VehiclePropertiesService {


    List<Vehicle_propertiesDTO> getAll();

    Vehicle_propertiesDTO create(VehiclePropertiesCreateForm form);

    Vehicle_propertiesDTO getOne(long id);

    Vehicle_propertiesDTO_User getOne_User(long id);

    Vehicle_propertiesDTO update(VehiclePropertiesCreateForm form, long id);

    void delete(long id);
}


