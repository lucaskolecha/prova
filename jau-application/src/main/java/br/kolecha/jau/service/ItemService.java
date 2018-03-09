package br.kolecha.jau.service;

import br.kolecha.jau.Item;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService extends GumgaService<Item, String> {

    @Autowired
    public ItemService(GumgaCrudRepository<Item, String> repository) {
        super(repository);
    }

}
