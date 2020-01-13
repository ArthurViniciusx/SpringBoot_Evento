package com.evento.aprimorandoSpring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import models.Evento;
import repositorys.EventoRepositorys;

@SpringBootApplication
public class AprimorandoSpringApplication implements CommandLineRunner {

	@Autowired
	private EventoRepositorys eventoRepositorys;

	public static void main(String[] args) {
		SpringApplication.run(AprimorandoSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Evento ev1 = new Evento(null, "Reunião", "MarquesConsult", "14/01/2020", "11:00AM");

	
		eventoRepositorys.saveAll(Arrays.asList(ev1));
	
	}

}
