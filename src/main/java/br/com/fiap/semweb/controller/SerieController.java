package br.com.fiap.semweb.controller;

import br.com.fiap.semweb.dto.SerieDTO;
import br.com.fiap.semweb.repository.SerieRepository;
import br.com.fiap.semweb.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SerieController {

    @Autowired
    private SerieService service;


    @GetMapping("/series")
    public List<SerieDTO> obterSeries() {
       return service.obterTodasAsSeries();
    }
}