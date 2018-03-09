package br.kolecha.jau.repository;

import br.kolecha.jau.Item;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends GumgaCrudRepository<Item, String> {
}
