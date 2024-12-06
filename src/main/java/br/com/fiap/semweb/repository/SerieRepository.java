package br.com.fiap.semweb.repository;

import br.com.fiap.semweb.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository <Serie, Long> {
}
