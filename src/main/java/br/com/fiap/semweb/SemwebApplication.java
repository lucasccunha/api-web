package br.com.fiap.semweb;

import br.com.fiap.semweb.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SemwebApplication {
    @Autowired
    private SerieRepository repositorio;

    public static void main(String[] args) {
        SpringApplication.run(SemwebApplication.class, args);
    }
}