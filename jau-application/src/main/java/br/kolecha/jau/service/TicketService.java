package br.kolecha.jau.service;

import br.kolecha.jau.Ticket;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService extends GumgaService<Ticket, String> {

    @Autowired
    public TicketService(GumgaCrudRepository<Ticket, String> repository) {
        super(repository);
    }

}
