package org.epicode.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "tagliandi")
public class Tagliando {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String descrizione;

    @ManyToOne
    @JoinColumn (name = "veicolo_id")
    private Veicolo veicolo;

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public void setVeicolo(Veicolo veicolo) {
        this.veicolo = veicolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
