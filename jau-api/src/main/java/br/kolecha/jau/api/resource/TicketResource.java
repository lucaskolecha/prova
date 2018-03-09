package br.kolecha.jau.api.resource;

import br.kolecha.jau.Ticket;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tickets")
public class TicketResource extends GumgaAPI<Ticket, String> {

    @Autowired
    public TicketResource(@Qualifier("ticketService") GumgaService<Ticket, String> service) {
        super(service);
    }
}
