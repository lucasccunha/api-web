package br.com.fiap.semweb.controller;

import br.com.fiap.semweb.dto.SerieDTO;
import br.com.fiap.semweb.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    private SerieService service;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<SerieDTO> obterSeries() {
        return service.obterTodasAsSeries();
    }

    @GetMapping("/top5")
    @ResponseStatus(HttpStatus.OK)
    public List<SerieDTO> obterTop5Series() {
        return service.obterTop5Series();
    }

    @GetMapping("/lancamentos")
    @ResponseStatus(HttpStatus.OK)
    public List<SerieDTO> obterLancamentos() {
        return service.obterLancamentos();
    }


}