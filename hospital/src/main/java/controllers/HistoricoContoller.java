package controllers;

import entities.FuncionariosEntity;
import entities.HistoricoEntity;
import org.springframework.web.bind.annotation.*;
import repositories.HistoricoRepository;

import java.util.List;

@RestController
@RequestMapping("/historico")
public class HistoricoContoller {

    private final HistoricoRepository historicoRepository;

    public HistoricoContoller(HistoricoRepository historicoRepository) {
        this.historicoRepository = historicoRepository;
    }
    @GetMapping
    public List<HistoricoEntity> findAll(){
        return this.historicoRepository.findAll();
    }

    @GetMapping("/{id")
    public HistoricoEntity findById(@PathVariable("id") final Long id){
        return this.historicoRepository.findById(id).orElse(null);
    }
    @PostMapping
    public void novoFuncionario(@RequestBody final HistoricoEntity historico){
        this.historicoRepository.save(historico);
    }
    @PutMapping
    public void update(@RequestBody final HistoricoEntity historicoEntity){
        this.historicoRepository.save(historicoEntity);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") final Long id){
        this.historicoRepository.deleteById(id);
    }

}
