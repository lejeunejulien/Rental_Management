package technifutur.Rental_Management.mapper;

import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.BookingDTO;
import technifutur.Rental_Management.model.entity.Booking;
import technifutur.Rental_Management.model.form.BookingCreateForm;

@Service
public class Mapper_booking {

    private final Mapper_user mapperUser;
    private final Mapper_vehicle_properties mapperVehicleProperties;

    public Mapper_booking(Mapper_user mapperUser, Mapper_vehicle_properties mapperVehicleProperties) {
        this.mapperUser = mapperUser;
        this.mapperVehicleProperties = mapperVehicleProperties;
    }

    public BookingDTO toBookingDTO(Booking entity){
        BookingDTO dto = new BookingDTO();
        dto.setId(entity.getId());
        dto.setAdress(entity.getAdress());
        dto.setArrival_date(entity.getArrival_date());

        dto.setStart_date(entity.getStart_date());

        dto.setUSerDTO(mapperUser.toRegisteredUserDTO(entity.getRegistered_user()));
        dto.setVehicle_propertiesDTO_user(mapperVehicleProperties.toVehiclePropertiesDTO_User(entity.getVehicle_properties()));

        return dto;
    }

    public Booking toBookingEntity(BookingCreateForm form){
        Booking entity = new Booking();
        entity.setAdress(form.getAdress());
        entity.setArrival_date(form.getArrival_date());
        entity.setStart_date(entity.getStart_date());

        return entity;
    }
}
