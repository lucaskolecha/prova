package br.kolecha.jau.service;

import br.kolecha.jau.Pedido;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService extends GumgaService<Pedido, String> {

    @Autowired
    public PedidoService(GumgaCrudRepository<Pedido, String> repository) {
        super(repository);
    }
}
