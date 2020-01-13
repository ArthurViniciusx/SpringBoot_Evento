package services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Evento;
import repositorys.EventoRepositorys;

@Service
public class EventoService {

	@Autowired
	private EventoRepositorys repo;
	
	public Evento find(Integer id) {
	Optional <Evento>obj = repo.findById(id);
	return obj.orElse(null);
	}

}
