package technifutur.Rental_Management.mapper;

import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.BookingDTO;
import technifutur.Rental_Management.model.dto.Vehicle_statusDTO;
import technifutur.Rental_Management.model.entity.Booking;
import technifutur.Rental_Management.model.entity.Vehicle_status;
import technifutur.Rental_Management.model.form.BookingCreateForm;
import technifutur.Rental_Management.model.form.Vehicle_statusForm;

@Service
public class Mapper_status {

    public Vehicle_statusDTO toStatusDTO(Vehicle_status entity){
        Vehicle_statusDTO dto = new Vehicle_statusDTO();
        dto.setStatus(entity.getStatus());
        dto.setStart_date(entity.getStart_date());
        dto.setStart_time(entity.getStart_time());

        dto.setEnd_date(entity.getEnd_date());
        dto.setEnd_time(entity.getEnd_time());


        return dto;
    }

    public Vehicle_status toStatusEntity(Vehicle_statusForm form){
        Vehicle_status entity = new Vehicle_status();
        entity.setStatus(form.getStatus());
        entity.setEnd_date(form.getEnd_date());
        entity.setEnd_time(form.getEnd_time());

        entity.setStart_date(entity.getStart_date());
        entity.setStart_time(entity.getStart_time());
        // registered_user et vehicle_properties -> Service

        return entity;
    }
}
