package services;

import dto.FuncionariosDTO;
import entities.FuncionariosEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.FuncionariosRepository;

@Service
public class FuncionariosService {

    @Autowired
    private FuncionariosRepository funcionariosRepository;

    @Transactional(readOnly = true)
    public Page<FuncionariosDTO> findAll(Pageable pageable){
        Page<FuncionariosEntity> result = funcionariosRepository.findAll(pageable);
        Page<FuncionariosDTO> page = result.map(x -> new FuncionariosDTO(x));
        return page;
    }

    @Transactional(readOnly = true)
    public FuncionariosDTO findById(Long id){
        FuncionariosEntity result = funcionariosRepository.findById(id).get();
        FuncionariosDTO dto = new FuncionariosDTO(result);
        return dto;
    }
}
