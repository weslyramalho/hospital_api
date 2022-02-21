package controllers;

import entities.FuncionariosEntity;
import org.springframework.web.bind.annotation.*;
import repositories.FuncionariosRepository;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionariosController {

    private final FuncionariosRepository funcionariosRepository;

    public FuncionariosController(FuncionariosRepository funcionariosRepository) {
        this.funcionariosRepository = funcionariosRepository;
    }

    @GetMapping
    public List<FuncionariosEntity> findAll(){
        this.funcionariosRepository.findAll();
    }

    @GetMapping("/{id")
    public FuncionariosEntity findById(@PathVariable("id") final Long id){
        return this.funcionariosRepository.findById(id).orElse(null);
    }
    @PostMapping
    public void novoFuncionario(@RequestBody final FuncionariosEntity funcionarios){
        this.funcionariosRepository.save(funcionarios);
    }
    @PutMapping
    public void update(@RequestBody final FuncionariosEntity funcionariosEntity){
        this.funcionariosRepository.save(funcionariosEntity);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") final Long id){
        this.funcionariosRepository.deleteById(id);
    }

}
