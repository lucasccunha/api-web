//package br.com.fiap.semweb;
//
//import br.com.fiap.semweb.principal.Principal;
//import br.com.fiap.semweb.repository.SerieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class SemwebApplicationSemWeb implements CommandLineRunner {
//    @Autowired
//    private SerieRepository repositorio;
//
//
//    public static void main(String[] args) {
//        SpringApplication.run(SemwebApplicationSemWeb.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Principal principal = new Principal(repositorio);
//        principal.exibeMenu();
//    }
//}