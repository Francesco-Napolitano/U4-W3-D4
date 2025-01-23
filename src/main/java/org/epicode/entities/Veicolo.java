package org.epicode.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "veicoli")
public class Veicolo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String modello;

    @OneToOne
    @JoinColumn ( name = "documento_id", unique = true)
    private Documento documento;

    @OneToMany (mappedBy = "veicolo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tagliando> tagliandi = new ArrayList<>();

    public Veicolo (){}

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public List<Tagliando> getTagliandi() {
        return tagliandi;
    }

    public void setTagliandi(List<Tagliando> tagliandi) {
        this.tagliandi = tagliandi;
    }

    public void eliminaTagliando (Tagliando nuovoTagliando){
        tagliandi.remove(nuovoTagliando);
    }
}
