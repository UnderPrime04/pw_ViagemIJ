package br.com.etechoracio.pw3viagens.Controller;

import br.com.etechoracio.pw3viagens.Entity.Viagem;
import br.com.etechoracio.pw3viagens.Repository.ViagensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/viagens")

public class ViagemController {
    @Autowired
    private ViagensRepository repository;

    @GetMapping
    public List<Viagem> buscarTodos() {

        return repository.findAll();
    }

    @GetMapping("@/{id}")
    public Optional<Viagem> buscarporId(@PathVariable Long id){
        return repository.findById(id);
    }

    @PostMapping
    public Viagem inserir(@RequestBody Viagem body) {
    Viagem inserida = repository.save(body);
    return inserida;
    }
    @PutMapping("/Id")
    public Viagem alterar(@PathVariable Long id,
                           @RequestBody Viagem obj) {
        Optional<Viagem> existe = buscarporId(id);
        if (existe.isPresent())
            repository.save(obj);
        return obj;
    }
}
