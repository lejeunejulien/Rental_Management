package technifutur.Rental_Management.service;

import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.CategoryDTO;
import technifutur.Rental_Management.model.dto.Vehicle_statusDTO;
import technifutur.Rental_Management.model.form.Vehicle_statusForm;

import java.util.List;


public interface StatusService {
    Vehicle_statusDTO create(Vehicle_statusForm form);

    List<Vehicle_statusDTO> getAll();

    Vehicle_statusDTO getOne(long id);

    Vehicle_statusDTO update(Vehicle_statusForm form, long id);

    void delete(long id);
}
