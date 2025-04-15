package com.exemplo.crudjava.controller;

import com.exemplo.crudjava.dto.PessoaDTO;
import com.exemplo.crudjava.model.Pessoa;
import com.exemplo.crudjava.repository.PessoaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

private final PessoaRepository repository;

public PessoaController(PessoaRepository repository) {
this.repository = repository;
}

@GetMapping
public List<Pessoa> listar() {
return repository.findAll();
}

@PostMapping
public Pessoa criar(@RequestBody PessoaDTO dto) {
Pessoa pessoa = new Pessoa(null, dto.getNome(), dto.getEmail(), dto.getTrabalho());
return repository.save(pessoa);
}

@PutMapping("/{id}")
public Pessoa atualizar(@PathVariable Long id, @RequestBody PessoaDTO dto) {
Pessoa pessoa = new Pessoa(id, dto.getNome(), dto.getEmail(), dto.getTrabalho());
return repository.save(pessoa);
}

@DeleteMapping("/{id}")
public void deletar(@PathVariable Long id) {
repository.deleteById(id);
}
}
