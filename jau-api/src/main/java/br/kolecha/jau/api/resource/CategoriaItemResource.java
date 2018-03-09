package br.kolecha.jau.api.resource;

import br.kolecha.jau.CategoriaItem;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categoriaitens")
public class CategoriaItemResource extends GumgaAPI<CategoriaItem, String> {

    @Autowired
    public CategoriaItemResource(@Qualifier("categoriaItemService") GumgaService<CategoriaItem, String> service) {
        super(service);
    }
}
