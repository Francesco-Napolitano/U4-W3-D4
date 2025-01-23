package org.epicode.entities;

import jakarta.persistence.*;

@Entity
@Table ( name = "documenti")
public class Documento {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String numero;

    private Veicolo veicolo;

    public Documento () { }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
