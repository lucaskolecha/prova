package br.kolecha.jau;

import io.gumga.domain.GumgaModelUUID;
import io.gumga.domain.GumgaMultitenancy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "cardapio")
@GumgaMultitenancy
public class Cardapio extends GumgaModelUUID {

    @Column(name = "nome")
    private String nome;

    @OneToMany()
    private List<Item> itens;

    public Cardapio() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
