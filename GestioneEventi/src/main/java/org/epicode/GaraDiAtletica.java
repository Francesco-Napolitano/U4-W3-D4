package org.epicode;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
@Entity
@DiscriminatorValue("GaraDiAtletica")

public class GaraDiAtletica extends Eventi{
    private Set<String> atleti = new HashSet<>();
    private String atleta_vincitore;

    public GaraDiAtletica(String s, LocalDate of, String s1, boolean b, int i, Set <String> atleti, String atleta_vincitore){

    }

    public Set<String> getAtleti() {
        return atleti;
    }

    public void setAtleti(Set<String> atleti) {
        this.atleti = atleti;
    }

    public String getAtleta_vincitore() {
        return atleta_vincitore;
    }

    public void setAtleta_vincitore(String atleta_vincitore) {
        this.atleta_vincitore = atleta_vincitore;
    }
}
