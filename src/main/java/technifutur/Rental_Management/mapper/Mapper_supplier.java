package technifutur.Rental_Management.mapper;

import technifutur.Rental_Management.model.dto.SupplierDTO;
import technifutur.Rental_Management.model.entity.Supplier;
import technifutur.Rental_Management.model.form.SupplierCreateForm;

public class Mapper_supplier {

    public SupplierDTO toSupplierDTO(Supplier entity){
        SupplierDTO dto = new SupplierDTO();
        dto.setAdress(entity.getAdress());
        dto.setName(entity.getName());
        dto.setTel(entity.getTel());
        dto.setPurchase_price(entity.getPurchase_price());

        return dto;
    }

    public Supplier toSupplierEntity(SupplierCreateForm form){
        Supplier entity = new Supplier();
        entity.setAdress(form.getAdress());
        entity.setTel(form.getTel());
        entity.setName(form.getName());
        entity.setPurchase_price(form.getPurchase_price());

        return entity;
    }
}
