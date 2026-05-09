package br.com.fiap.cp2_java_brinquedos.service;

import br.com.fiap.cp2_java_brinquedos.model.Brinquedo;
import br.com.fiap.cp2_java_brinquedos.repository.BrinquedoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrinquedoService {

    private final BrinquedoRepository repository;

    public BrinquedoService(BrinquedoRepository repository) {
        this.repository = repository;
    }

    public List<Brinquedo> listarTodos() {
        return repository.findAll();
    }

    public Brinquedo buscarPorId(Long id) {
        Optional<Brinquedo> brinquedo = repository.findById(id);
        return brinquedo.orElse(null);
    }

    public Brinquedo cadastrar(Brinquedo brinquedo) {
        return repository.save(brinquedo);
    }

    public Brinquedo atualizar(Long id, Brinquedo brinquedoAtualizado) {
        Optional<Brinquedo> existente = repository.findById(id);

        if (existente.isPresent()) {
            Brinquedo brinquedo = existente.get();

            brinquedo.setNome(brinquedoAtualizado.getNome());
            brinquedo.setTipo(brinquedoAtualizado.getTipo());
            brinquedo.setClassificacao(brinquedoAtualizado.getClassificacao());
            brinquedo.setTamanho(brinquedoAtualizado.getTamanho());
            brinquedo.setPreco(brinquedoAtualizado.getPreco());

            return repository.save(brinquedo);
        }

        return null;
    }

    public boolean deletar(Long id) {
        Optional<Brinquedo> existente = repository.findById(id);

        if (existente.isPresent()) {
            repository.deleteById(id);
            return true;
        }

        return false;
    }
}