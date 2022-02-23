package services;

import dto.HistoricoDTO;
import entities.HistoricoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.HistoricoRepository;

@Service
public class HistoricoService {

    @Autowired
    HistoricoRepository historicoRepository;

    @Transactional(readOnly = true)
    public Page<HistoricoDTO> findAll(Pageable pageable){
        Page<HistoricoEntity> result = historicoRepository.findAll(pageable);
        Page<HistoricoDTO> page = result.map(x -> new HistoricoDTO(x));
        return page;
    }

    @Transactional(readOnly = true)
    public HistoricoDTO findById(Long id){
        HistoricoEntity result = historicoRepository.findById(id).get();
        HistoricoDTO dto = new HistoricoDTO(result);
        return dto;
    }
}
