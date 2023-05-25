package technifutur.Rental_Management.service.impl;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import technifutur.Rental_Management.exception.RessourceNotFoundException;
import technifutur.Rental_Management.mapper.Mapper_status;
import technifutur.Rental_Management.model.dto.CategoryDTO;
import technifutur.Rental_Management.model.dto.PriceDTO;
import technifutur.Rental_Management.model.dto.Vehicle_statusDTO;
import technifutur.Rental_Management.model.entity.Vehicle_status;
import technifutur.Rental_Management.model.form.Vehicle_statusForm;
import technifutur.Rental_Management.repository.StatusRepository;
import technifutur.Rental_Management.service.StatusService;

import java.util.List;
import java.util.Map;

@Service
public class StatusServiceImpl implements StatusService {

    private final StatusRepository statusRepository;
    private final Mapper_status mapperStatus;

    @PersistenceContext
    private EntityManager entityManager;

    public StatusServiceImpl(StatusRepository statusRepository,
                             Mapper_status mapperStatus){
        this.statusRepository= statusRepository;
        this.mapperStatus = mapperStatus;
    }
    @Override
    @Transactional
    public Vehicle_statusDTO create(Vehicle_statusForm form) {
        Vehicle_status vehicleStatus= mapperStatus.toStatusEntity(form);

        statusRepository.save(vehicleStatus);
        return mapperStatus.toStatusDTO(vehicleStatus);
    }

    @Override
    @Transactional
    public List<Vehicle_statusDTO> getAll() {

        List<Vehicle_statusDTO> list_status_getAll = statusRepository.findAll().stream()
                .map(v->mapperStatus.toStatusDTO(v))
                //.map(mapperVehicleProperties::toVehiclePropertiesDTO)
                .toList();
        return list_status_getAll;
    }

    @Override
    @Transactional
    public Vehicle_statusDTO getOne(long id) {
        Vehicle_status vehicleStatus = entityManager.find(Vehicle_status.class,id);
        return mapperStatus.toStatusDTO(vehicleStatus);
    }

    @Override
    @Transactional
    public Vehicle_statusDTO update(Vehicle_statusForm form, long id) {
        Vehicle_status vehicleStatus = statusRepository.findById(id)
                .orElseThrow(RessourceNotFoundException::new);

        vehicleStatus.setStatus(form.getStatus());
        vehicleStatus.setStart_date(form.getStart_date());
        vehicleStatus.setStart_date(form.getStart_date());

        statusRepository.save(vehicleStatus);

        return mapperStatus.toStatusDTO(vehicleStatus);
    }

    @Override
    public void delete(long id) {

        statusRepository.deleteById(id);
    }
}
