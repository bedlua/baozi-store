package com.baozi.store.controller;

import com.baozi.store.model.Cliente;
import com.baozi.store.repository.ClienteRepository;
import jakarta.validation.Valid;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteRepository repository;
    public ClienteController(ClienteRepository repository) { this.repository = repository; }

    @PostMapping
    public ResponseEntity<Cliente> criar(@Valid @RequestBody Cliente cliente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(cliente));
    }
    @GetMapping public List<Cliente> listar() { return repository.findAll(); }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscar(@PathVariable Long id) {
        return repository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @Valid @RequestBody Cliente dados) {
        return repository.findById(id).map(c -> {
            c.setNome(dados.getNome()); c.setClienteDesde(dados.getClienteDesde());
            return ResponseEntity.ok(repository.save(c));
        }).orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> apagar(@PathVariable Long id) {
        if (!repository.existsById(id)) return ResponseEntity.notFound().build();
        repository.deleteById(id); return ResponseEntity.noContent().build();
    }
}
