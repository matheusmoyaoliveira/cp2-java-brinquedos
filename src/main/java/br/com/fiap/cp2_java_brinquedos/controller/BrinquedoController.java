package br.com.fiap.cp2_java_brinquedos.controller;

import br.com.fiap.cp2_java_brinquedos.model.Brinquedo;
import br.com.fiap.cp2_java_brinquedos.service.BrinquedoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    private final BrinquedoService service;

    public BrinquedoController(BrinquedoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Brinquedo> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Brinquedo> buscarPorId(@PathVariable Long id) {
        Brinquedo brinquedo = service.buscarPorId(id);

        if (brinquedo != null) {
            return ResponseEntity.ok(brinquedo);
        }

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Brinquedo> cadastrar(@RequestBody Brinquedo brinquedo) {
        Brinquedo novoBrinquedo = service.cadastrar(brinquedo);
        return ResponseEntity.status(201).body(novoBrinquedo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Brinquedo> atualizar(
            @PathVariable Long id,
            @RequestBody Brinquedo brinquedoAtualizado
    ) {
        Brinquedo brinquedo = service.atualizar(id, brinquedoAtualizado);

        if (brinquedo != null) {
            return ResponseEntity.ok(brinquedo);
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        boolean deletado = service.deletar(id);

        if (deletado) {
            return ResponseEntity.ok(
                    Map.of("mensagem", "Briqnuedo com ID " + id + " deletado com sucesso.")
            );
        }

        return ResponseEntity.status(404)
                .body("Brinquedo com ID " + id + " não encontrado.");
    }
}