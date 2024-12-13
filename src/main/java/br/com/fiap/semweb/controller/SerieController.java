package br.com.fiap.semweb.controller;

import br.com.fiap.semweb.dto.SerieDTO;
import br.com.fiap.semweb.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {

    @Autowired
    private SerieService service;


    @GetMapping("/series")
    public List<SerieDTO> obterSeries() {
        return service.obterTodasAsSeries();
    }

    @GetMapping("/series/top5")
    public List<SerieDTO> obterTop5Series() {
        return service.obterTop5Series();
    }
}