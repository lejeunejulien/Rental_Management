package technifutur.Rental_Management.service.impl;


import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.CategoryDTO;
import technifutur.Rental_Management.model.dto.Vehicle_statusDTO;
import technifutur.Rental_Management.model.form.Vehicle_statusForm;
import technifutur.Rental_Management.service.StatusService;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {

    @Override
    public void create(Vehicle_statusForm form) {

    }

    @Override
    public List<Vehicle_statusDTO> getAll() {
        return null;
    }

    @Override
    public Vehicle_statusDTO getOne(long id) {
        return null;
    }

    @Override
    public CategoryDTO update(Vehicle_statusForm form, long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
