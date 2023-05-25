package technifutur.Rental_Management.service.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.exception.RessourceNotFoundException;
import technifutur.Rental_Management.mapper.Mapper_price;
import technifutur.Rental_Management.model.dto.PriceDTO;
import technifutur.Rental_Management.model.entity.Price;
import technifutur.Rental_Management.model.form.PriceCreateForm;
import technifutur.Rental_Management.repository.PriceRepository;
import technifutur.Rental_Management.service.PriceService;

import java.util.List;


@Service
public class PriceServiceImpl implements PriceService {

    private final PriceRepository priceRepository;
    private final Mapper_price mapper_price;

    @PersistenceContext
    private EntityManager entityManager;

    public PriceServiceImpl(PriceRepository priceRepository,
                            Mapper_price mapper_price){
        this.priceRepository = priceRepository;
        this.mapper_price= mapper_price;
    }

    @Override
    @Transactional
    public PriceDTO create(PriceCreateForm form) {
        Price price = mapper_price.toPriceEntity(form);

        priceRepository.save(price);
        return mapper_price.toPriceDTO(price);
    }

    @Override
    @Transactional
    public PriceDTO getOne(long id) {
        Price price = entityManager.find(Price.class,id);
        return mapper_price.toPriceDTO(price);
    }

    @Override
    @Transactional
    public List<PriceDTO> getAll() {

        List<PriceDTO> list_price_getAll = priceRepository.findAll().stream()
                .map(v->mapper_price.toPriceDTO(v))
                //.map(mapperVehicleProperties::toVehiclePropertiesDTO)
                .toList();
        return list_price_getAll;

    }

    @Transactional
    @Override
    public PriceDTO update(PriceCreateForm form,long id) {
        Price price = priceRepository.findById(id)
                .orElseThrow(RessourceNotFoundException::new);

        price.setPrice_month(form.getPrice_month());
        price.setPrice_weekend(form.getPrice_weekend());
        price.setPrice_day(form.getPrice_day());
        price.setCaution(form.getCaution());

        priceRepository.save(price);

        return mapper_price.toPriceDTO(price);
    }

    @Override
    public void delete(long id) {

        priceRepository.deleteById(id);
    }
}
