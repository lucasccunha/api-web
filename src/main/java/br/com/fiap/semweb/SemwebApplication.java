package br.com.fiap.semweb;

import br.com.fiap.semweb.model.DadosEpisodio;
import br.com.fiap.semweb.model.DadosSerie;
import br.com.fiap.semweb.model.DadosTemporada;
import br.com.fiap.semweb.principal.Principal;
import br.com.fiap.semweb.repository.SerieRepository;
import br.com.fiap.semweb.service.ConsumoApi;
import br.com.fiap.semweb.service.ConverteDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SemwebApplication implements CommandLineRunner {
	@Autowired
	private SerieRepository repositorio;


	public static void main(String[] args) {
		SpringApplication.run(SemwebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}
}