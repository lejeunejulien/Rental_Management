package technifutur.Rental_Management.mapper;

import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.BookingDTO;
import technifutur.Rental_Management.model.entity.Booking;
import technifutur.Rental_Management.model.form.BookingCreateForm;

@Service
public class Mapper_booking {

    public BookingDTO toBookingDTO(Booking entity){
        BookingDTO dto = new BookingDTO();
        dto.setAdress(entity.getAdress());
        dto.setArrival_date(entity.getArrival_date());
        dto.setArrival_time(entity.getArrival_time());

        dto.setStart_date(entity.getStart_date());
        dto.setStart_time(entity.getStart_time());

        dto.setRegistered_user(entity.getRegistered_user());
        dto.setVehicle_properties(entity.getVehicle_properties());

        return dto;
    }

    public Booking toBookingEntity(BookingCreateForm form){
        Booking entity = new Booking();
        entity.setAdress(form.getAdress());
        entity.setArrival_date(form.getArrival_date());
        entity.setArrival_time(form.getArrival_time());

        entity.setStart_date(entity.getStart_date());
        entity.setStart_time(entity.getStart_time());
        // registered_user et vehicle_properties -> Service

        return entity;
    }
}
