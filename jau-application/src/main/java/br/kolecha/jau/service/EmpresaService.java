package br.kolecha.jau.service;

import br.kolecha.jau.Empresa;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService extends GumgaService<Empresa, String> {

    @Autowired
    public EmpresaService(GumgaCrudRepository<Empresa, String> repository) {
        super(repository);
    }
}
