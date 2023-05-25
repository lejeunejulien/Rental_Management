package technifutur.Rental_Management.mapper;

import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.BookingDTO;
import technifutur.Rental_Management.model.entity.Booking;
import technifutur.Rental_Management.model.form.BookingCreateForm;

@Service
public class Mapper_booking {

    public BookingDTO toBookingDTO(Booking entity){
        BookingDTO dto = new BookingDTO();
        dto.setId(entity.getId());
        dto.setAdress(entity.getAdress());
        dto.setArrival_date(entity.getArrival_date());

        dto.setStart_date(entity.getStart_date());

        dto.setRegistered_user(entity.getRegistered_user());
        dto.setVehicle_properties(entity.getVehicle_properties());

        return dto;
    }

    public Booking toBookingEntity(BookingCreateForm form){
        Booking entity = new Booking();
        entity.setAdress(form.getAdress());
        entity.setArrival_date(form.getArrival_date());

        entity.setStart_date(entity.getStart_date());
        // registered_user et vehicle_properties -> Service

        return entity;
    }
}
