package br.kolecha.jau.service;

import br.kolecha.jau.CategoriaItem;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaItemService extends GumgaService<CategoriaItem, String> {

    @Autowired
    public CategoriaItemService(GumgaCrudRepository<CategoriaItem, String> repository) {
        super(repository);
    }
}
