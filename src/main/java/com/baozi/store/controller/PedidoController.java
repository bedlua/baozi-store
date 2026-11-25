package com.baozi.store.controller;

import com.baozi.store.model.Pedido;
import com.baozi.store.repository.*;
import jakarta.validation.Valid;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    private final PedidoRepository pedidos;
    private final ClienteRepository clientes;
    private final ProdutoRepository produtos;

    public PedidoController(PedidoRepository pedidos, ClienteRepository clientes, ProdutoRepository produtos) {
        this.pedidos = pedidos; this.clientes = clientes; this.produtos = produtos;
    }

    @PostMapping
    public ResponseEntity<?> criar(@Valid @RequestBody Pedido pedido) {
        if (!clientes.existsById(pedido.getClienteId()))
            return ResponseEntity.badRequest().body("Cliente não encontrado.");
        if (!produtos.existsById(pedido.getProdutoId()))
            return ResponseEntity.badRequest().body("Produto não encontrado.");
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidos.save(pedido));
    }
    @GetMapping public List<Pedido> listar() { return pedidos.findAll(); }
    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscar(@PathVariable Long id) {
        return pedidos.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Long id, @Valid @RequestBody Pedido dados) {
        if (!clientes.existsById(dados.getClienteId()))
            return ResponseEntity.badRequest().body("Cliente não encontrado.");
        if (!produtos.existsById(dados.getProdutoId()))
            return ResponseEntity.badRequest().body("Produto não encontrado.");
        return pedidos.findById(id).map(p -> {
            p.setClienteId(dados.getClienteId()); p.setProdutoId(dados.getProdutoId());
            p.setQuantidade(dados.getQuantidade());
            return ResponseEntity.ok(pedidos.save(p));
        }).orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> apagar(@PathVariable Long id) {
        if (!pedidos.existsById(id)) return ResponseEntity.notFound().build();
        pedidos.deleteById(id); return ResponseEntity.noContent().build();
    }
}
