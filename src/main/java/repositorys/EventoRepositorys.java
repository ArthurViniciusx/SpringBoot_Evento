package repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Evento;

@Repository
public interface EventoRepositorys extends JpaRepository<Evento, Integer> {
	Evento findById(long id);
}
