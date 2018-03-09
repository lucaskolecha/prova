package br.kolecha.jau.repository;

import br.kolecha.jau.Coisa;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoisaRepository extends GumgaCrudRepository<Coisa, String> {
}
