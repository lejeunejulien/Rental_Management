package technifutur.Rental_Management.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.dto.PriceDTO;
import technifutur.Rental_Management.model.form.PriceCreateForm;

import java.util.List;

public interface PriceService {
    PriceDTO create(PriceCreateForm form);

    @Transactional
    PriceDTO getOne(long id);

    @Transactional
    List<PriceDTO> getAll();

    PriceDTO update(PriceCreateForm form, long id);

    void delete(long id);
}
