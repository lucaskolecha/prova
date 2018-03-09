package br.kolecha.jau;

import io.gumga.domain.GumgaModelUUID;
import io.gumga.domain.GumgaMultitenancy;
import io.gumga.domain.domains.GumgaAddress;
import org.hibernate.annotations.Columns;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
@GumgaMultitenancy
public class Empresa extends GumgaModelUUID {

    @Column(name = "nome")
    private String nome;

    @Columns(columns = {
            @Column(name = "cod_postal"),
            @Column(name = "tipo_logradouro"),
            @Column(name = "logradouro"),
            @Column(name = "numero"),
            @Column(name = "informacao"),
            @Column(name = "bairro"),
            @Column(name = "localizacao"),
            @Column(name = "estado"),
            @Column(name = "cidade"),
            @Column(name = "latitude"),
            @Column(name = "longitude"),
            @Column(name = "codIbge"),
            @Column(name = "codEstado")
    })
    private GumgaAddress endereco;

    public Empresa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GumgaAddress getEndereco() {
        return endereco;
    }

    public void setEndereco(GumgaAddress endereco) {
        this.endereco = endereco;
    }
}
