package br.kolecha.jau.repository;

import br.kolecha.jau.Cardapio;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardapioRepository extends GumgaCrudRepository<Cardapio, String> {
}
