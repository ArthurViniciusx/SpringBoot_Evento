package repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import models.Evento;

public interface EventoRepository extends JpaRepository<Evento, String> {

}
