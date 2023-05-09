package technifutur.Rental_Management.service.impl;

import org.springframework.http.ResponseEntity;
import technifutur.Rental_Management.model.dto.BookingDTO;
import technifutur.Rental_Management.model.form.BookingCreateForm;
import technifutur.Rental_Management.service.BookingService;

import java.util.List;

public class BookingServiceImpl implements BookingService {
    @Override
    public ResponseEntity<BookingDTO> create(BookingCreateForm form) {
        return null;
    }

    @Override
    public List<BookingDTO> getAll() {
        return null;
    }

    @Override
    public BookingDTO getOne(long id) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void update(long id) {

    }
}
