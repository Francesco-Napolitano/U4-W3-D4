package org.epicode;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("Concerto")

public class Concerto extends Eventi {

    private List <String> genere = new ArrayList<>();
    private Boolean streaming;

    public Concerto(String concertoGreenDay, LocalDate of, String tantaRoba, boolean b, int i, String s, boolean b1) {
    }


    public List<String> getGenere() {
        return genere;
    }

    public void setGenere(List<String> genere) {
        this.genere = genere;
    }

    public Boolean getStreaming() {
        return streaming;
    }

    public void setStreaming(Boolean streaming) {
        this.streaming = streaming;
    }
}
