package br.kolecha.jau.api.resource;

import br.kolecha.jau.Coisa;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coisas")
public class CoisaResource extends GumgaAPI<Coisa, String> {

    @Autowired
    public CoisaResource(@Qualifier("coisaService") GumgaService<Coisa, String> service) {
        super(service);
    }
}
