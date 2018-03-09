package br.kolecha.jau;

import io.gumga.domain.GumgaModelUUID;
import io.gumga.domain.GumgaMultitenancy;
import io.gumga.domain.domains.GumgaMoney;

import javax.persistence.*;

@Entity
@Table(name = "item")
@GumgaMultitenancy
public class Item extends GumgaModelUUID {

    @Column(name = "nome")
    private String nome;

    @ManyToOne(fetch = FetchType.EAGER)
    private CategoriaItem categoriaItem;

    @Column(name = "valor")
    private GumgaMoney valor;

    public Item() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaItem getCategoriaItem() {
        return categoriaItem;
    }

    public void setCategoriaItem(CategoriaItem categoriaItem) {
        this.categoriaItem = categoriaItem;
    }

    public GumgaMoney getValor() {
        return valor;
    }

    public void setValor(GumgaMoney valor) {
        this.valor = valor;
    }
}
