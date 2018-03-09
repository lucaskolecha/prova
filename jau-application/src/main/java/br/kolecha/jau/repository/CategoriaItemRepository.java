package br.kolecha.jau.repository;

import br.kolecha.jau.CategoriaItem;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaItemRepository extends GumgaCrudRepository<CategoriaItem, String> {
}
