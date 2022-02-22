package services;


import dto.PacientesDTO;
import entities.PacientesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.PacientesRepository;

@Service
public class PacientesService {

    @Autowired
    private PacientesRepository pacientesRepository;

    @Transactional(readOnly = true)
    public Page<PacientesDTO> findAll(Pageable pageable){
        Page<PacientesEntity> result = pacientesRepository.findAll(pageable);
        Page<PacientesDTO> page = result.map(x -> new PacientesDTO(x));
        return page;
    }

    @Transactional(readOnly = true)
    public PacientesDTO findById(Long id){
        PacientesEntity result = pacientesRepository.findById(id).get();
        PacientesDTO dto = new PacientesDTO(result);
        return dto;
    }
}
