package br.kolecha.jau.service;

import br.kolecha.jau.Coisa;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoisaService extends GumgaService<Coisa, String> {

    @Autowired
    public CoisaService(GumgaCrudRepository<Coisa, String> repository) {
        super(repository);
    }
}
