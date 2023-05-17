package technifutur.Rental_Management.mapper;

import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.PriceDTO;
import technifutur.Rental_Management.model.entity.Price;
import technifutur.Rental_Management.model.form.PriceCreateForm;


@Service
public class Mapper_price {

    public PriceDTO toPriceDTO(Price entity){
        PriceDTO dto = new PriceDTO();
        dto.setPrice_month(entity.getPrice_month());
        dto.setPrice_weekend(entity.getPrice_weekend());
        dto.setCaution(entity.getCaution());
        dto.setPrice_day(entity.getPrice_day());

        return dto;
    }

    public Price toPriceEntity(PriceCreateForm form){
        Price entity = new Price();
        entity.setPrice_month(form.getPrice_month());
        entity.setPrice_weekend(form.getPrice_weekend());
        entity.setCaution(form.getCaution());
        entity.setPrice_day(form.getPrice_day());

        return entity;
    }
}
