package br.com.fiap.cp2_java_brinquedos.repository;

import br.com.fiap.cp2_java_brinquedos.model.Brinquedo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrinquedoRepository extends JpaRepository<Brinquedo, Long> {
}