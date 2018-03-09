package br.kolecha.jau.repository;

import br.kolecha.jau.Ticket;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketsRepository extends GumgaCrudRepository<Ticket, String> {
}
