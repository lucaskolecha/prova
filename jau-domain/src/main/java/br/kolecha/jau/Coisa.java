package br.kolecha.jau;

import io.gumga.domain.GumgaModelUUID;
import io.gumga.domain.GumgaMultitenancy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "coisa")
@GumgaMultitenancy
public class Coisa extends GumgaModelUUID {

    @Column(name="nome")
    private String nome;

    public Coisa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
