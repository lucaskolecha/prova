package br.kolecha.jau.api.resource;

import br.kolecha.jau.Empresa;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaResource extends GumgaAPI<Empresa, String> {

    @Autowired
    public EmpresaResource(@Qualifier("empresaService") GumgaService<Empresa, String> service) {
        super(service);
    }
}
