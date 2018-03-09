package br.kolecha.jau.api.resource;

import br.kolecha.jau.Item;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/itens")
public class ItemResource extends GumgaAPI<Item, String> {

    @Autowired
    public ItemResource(@Qualifier("itemService") GumgaService<Item, String> service) {
        super(service);
    }

}
