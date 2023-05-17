package technifutur.Rental_Management.mapper;

import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.Vehicle_propertiesDTO;
import technifutur.Rental_Management.model.entity.Booking;
import technifutur.Rental_Management.model.entity.Vehicle_properties;
import technifutur.Rental_Management.model.form.VehiclePropertiesCreateForm;

@Service
public class Mapper_vehicle_properties {

    public Vehicle_propertiesDTO toVehiclePropertiesDTO(Vehicle_properties entity){
        Vehicle_propertiesDTO dto = new Vehicle_propertiesDTO();
        dto.setMileage(entity.getMileage());
        dto.setYear(entity.getYear());
        dto.setEngine_power(entity.getEngine_power());

        return dto;
    }

    public Vehicle_properties toVehiclePropertiesEntity(VehiclePropertiesCreateForm form){
        Vehicle_properties entity = new Vehicle_properties();

        entity.setMileage(form.getMileage());
        entity.setYear(form.getYear());
        entity.setEngine_power(form.getEngine_power());

        //setCategory, setSupplier, setStatus -> VehiclePropertiesService

        return entity;
    }
}
