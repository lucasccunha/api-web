package br.com.fiap.semweb.controller;

import br.com.fiap.semweb.dto.SerieDTO;
import br.com.fiap.semweb.model.Serie;
import br.com.fiap.semweb.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SerieController {

    @Autowired
    private SerieRepository repository;

    @GetMapping("/series")
    public List<SerieDTO> obterSeries() {
        return repository.findAll()
                .stream()
                .map(s -> new SerieDTO(s.getTitulo(), s.getTotalTemporadas(), s.getAvaliacao(), s.getGenero(), s.getAtores(), s.getPoster(), s.getSinopse()))
                .collect(Collectors.toList());
    }
}