package br.kolecha.jau;

import io.gumga.domain.GumgaModelUUID;
import io.gumga.domain.GumgaMultitenancy;
import io.gumga.domain.domains.GumgaMoney;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity()
@Table(name = "pedido")
@GumgaMultitenancy
public class Pedido extends GumgaModelUUID {

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;

    @OneToMany(fetch= FetchType.EAGER)
    private List<Item> itens;

    @Column(name = "total")
    private GumgaMoney total;


    public Pedido() {
    }

    public Enum<Status> getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public GumgaMoney getTotal() {
        return total;
    }

    public void setTotal(GumgaMoney total) {
        this.total = total;
    }
}
