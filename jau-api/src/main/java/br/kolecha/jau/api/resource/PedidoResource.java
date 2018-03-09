package br.kolecha.jau.api.resource;

import br.kolecha.jau.Pedido;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoResource extends GumgaAPI<Pedido, String> {

    @Autowired
    public PedidoResource(@Qualifier("pedidoService") GumgaService<Pedido, String> service) {
        super(service);
    }

}
