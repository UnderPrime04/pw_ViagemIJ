package br.com.etechoracio.pw3viagens.Repository;

import br.com.etechoracio.pw3viagens.Entity.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ViagensRepository extends JpaRepository<Viagem, Long> {
}
