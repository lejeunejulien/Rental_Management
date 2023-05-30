package technifutur.Rental_Management.mapper;

import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.Vehicle_propertiesDTO;
import technifutur.Rental_Management.model.dto.Vehicle_propertiesDTO_User;
import technifutur.Rental_Management.model.dto.Vehicle_statusDTO;
import technifutur.Rental_Management.model.entity.Vehicle_properties;
import technifutur.Rental_Management.model.form.VehiclePropertiesCreateForm;

import java.util.ArrayList;
import java.util.List;

@Service
public class Mapper_vehicle_properties {

    private final Mapper_supplier mapperSupplier;
    private final Mapper_category mapperCategory;
    private final Mapper_status mapperStatus;

    public Mapper_vehicle_properties(Mapper_supplier mapperSupplier,
                                     Mapper_category mapperCategory,
                                     Mapper_status mapperStatus) {
        this.mapperSupplier = mapperSupplier;
        this.mapperCategory = mapperCategory;
        this.mapperStatus = mapperStatus;
    }

    //ADMIN
    public Vehicle_propertiesDTO toVehiclePropertiesDTO(Vehicle_properties entity){
        Vehicle_propertiesDTO dto = new Vehicle_propertiesDTO();
        dto.setId(entity.getId());
        dto.setMileage(entity.getMileage());
        dto.setYear(entity.getYear());
        dto.setEngine_power(entity.getEngine_power());
        dto.setCategory(mapperCategory.toCategoryDTO(entity.getCategory()));
        dto.setSupplier(mapperSupplier.toSupplierDTO(entity.getSupplier()));

        List<Vehicle_statusDTO> list_vehicle_status =new ArrayList<>();
        for(int i = 0; i< entity.getList_status_vehicle().size() ;i++){
            list_vehicle_status.add(mapperStatus.toStatusDTO(entity.getList_status_vehicle().get(i)));
        }
        dto.setList_vehicle_status(list_vehicle_status);

        return dto;
    }

    //USER
    public Vehicle_propertiesDTO_User toVehiclePropertiesDTO_User(Vehicle_properties entity){
        Vehicle_propertiesDTO_User dto = new Vehicle_propertiesDTO_User();

        dto.setId(entity.getId());
        dto.setMileage(entity.getMileage());
        dto.setYear(entity.getYear());
        dto.setEngine_power(entity.getEngine_power());
        dto.setCategory(mapperCategory.toCategoryDTO(entity.getCategory()));

        return dto;
    }

    public Vehicle_properties toVehiclePropertiesEntity(VehiclePropertiesCreateForm form){
        Vehicle_properties entity = new Vehicle_properties();

        entity.setMileage(form.getMileage());
        entity.setYear(form.getYear());
        entity.setEngine_power(form.getEngine_power());


        return entity;
    }
}
