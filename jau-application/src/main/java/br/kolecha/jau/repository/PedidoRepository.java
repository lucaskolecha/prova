package br.kolecha.jau.repository;

import br.kolecha.jau.Pedido;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends GumgaCrudRepository<Pedido, String> {
}
