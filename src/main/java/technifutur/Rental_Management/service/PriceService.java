package technifutur.Rental_Management.service;

import org.springframework.stereotype.Service;
import technifutur.Rental_Management.model.form.PriceCreateForm;

@Service
public interface PriceService {
    void create(PriceCreateForm form);

    void update(long id);

    void delete(long id);
}
