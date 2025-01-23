package org.epicode;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "evento" )
public class Eventi {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "titolo")
    private String titolo;

    @Column (name = "data_evento")
    private LocalDate data_evento;

    @Column (name = "descrizione")
    private String descrizione;

    @Column (name = "tipo_evento")
    private Boolean evento;

    @Column (name = "numero_massimo_partecipanti")
    private Integer maxPartecipanti;

    public Eventi (){

    }

    public Eventi (String t, LocalDate dataE, String d, Boolean ev, Integer partecipanti) {
        this.titolo = t;
        this.data_evento = dataE;
        this.descrizione = d;
        this.evento = ev;
        this.maxPartecipanti = partecipanti;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData_evento() {
        return data_evento;
    }

    public void setData_evento(LocalDate data_evento) {
        this.data_evento = data_evento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Boolean getEvento() {
        return evento;
    }

    public void setEvento(Boolean evento) {
        this.evento = evento;
    }

    public Integer getMaxPartecipanti() {
        return maxPartecipanti;
    }

    public void setMaxPartecipanti(Integer maxPartecipanti) {
        this.maxPartecipanti = maxPartecipanti;
    }

    public Long getId() {
        return id;
    }

    public String toString(){
        return "Evento titolo: " + titolo + "\n Data: "+ data_evento + "\n Descrizione: " + descrizione + "\n Tipo evento (public = true | private = false) : " + evento + "\n Numero massimo di partecipanti:" + maxPartecipanti;
    }


}
