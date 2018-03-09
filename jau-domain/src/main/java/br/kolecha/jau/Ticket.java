package br.kolecha.jau;

import io.gumga.domain.GumgaModelUUID;
import io.gumga.domain.GumgaMultitenancy;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
@GumgaMultitenancy
public class Ticket extends GumgaModelUUID {

    @OneToOne
    private Pedido pedido;

}
