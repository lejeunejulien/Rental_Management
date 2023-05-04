package technifutur.Rental_Management.service;

import org.springframework.http.ResponseEntity;
import technifutur.Rental_Management.model.dto.BookingDTO;
import technifutur.Rental_Management.model.form.BookingCreateForm;

import java.util.List;

public interface VehiclePropertiesService {

    static ResponseEntity<BookingDTO> createVehicleProperties(BookingCreateForm form) {
    }

    static List<BookingDTO> getAll() {
    }

    static void getOne(long id) {
    }

    static void update(long id) {
    }

    static void delete(long id) {
    }
}
