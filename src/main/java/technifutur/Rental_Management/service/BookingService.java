package technifutur.Rental_Management.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.BookingDTO;
import technifutur.Rental_Management.model.form.BookingCreateForm;

import java.util.List;


@Service
public interface BookingService {
    ResponseEntity<BookingDTO> createBooking(BookingCreateForm form);

    List<BookingDTO> getAll();

    void delete(long id);

    void getOne(long id);

    void update(long id);
}
