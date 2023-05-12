package technifutur.Rental_Management.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.BookingDTO;
import technifutur.Rental_Management.model.form.BookingCreateForm;
import technifutur.Rental_Management.model.form.VehiclePropertiesCreateForm;

import java.util.List;


public interface BookingService {

    BookingDTO create(BookingCreateForm form);

    List<BookingDTO> getAll();

    BookingDTO getOne(long id);

    void delete(long id);

    BookingDTO update(BookingCreateForm form,long id);


}
