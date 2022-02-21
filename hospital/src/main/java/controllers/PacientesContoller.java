package controllers;

import entities.PacientesEntity;
import org.springframework.web.bind.annotation.*;
import repositories.PacientesRepository;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacientesContoller {

    private final PacientesRepository pacientesRepository;

    public PacientesContoller(PacientesRepository pacientesRepository) {
        this.pacientesRepository = pacientesRepository;
    }

    @GetMapping
    public List<PacientesEntity> findAll(){
        return this.pacientesRepository.findAll();
    }

    @GetMapping("/{id}")
    public PacientesEntity findById(@PathVariable("id") final Long id){
        return this.pacientesRepository.findById(id).orElse(null);
    }

    @GetMapping
    public void novoPaciente(@RequestBody final PacientesEntity pacientes){
        this.pacientesRepository.save(pacientes);
    }

    @PutMapping
    public void update(@RequestBody final PacientesEntity pacientesEntity){
        this.pacientesRepository.save(pacientesEntity);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") final Long id){
        this.pacientesRepository.deleteById(id);
    }


}
