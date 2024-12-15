package br.com.fiap.semweb.dto;

import br.com.fiap.semweb.model.Categoria;

public record SerieDTO(

        Long id,

        String titulo,

        Integer totalTemporadas,

        Double avaliacao,

        Categoria genero,

        String atores,

        String poster,

        String sinopse) {

}
