package org.epicode;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("PartitaDiCalcio")
public class PartitaDiCalcio extends Eventi {
    private String squadra_casa;
    private String squadra_ospite;
    private String vincitore;
    private Integer numero_gol_casa;
    private Integer numero_gol_ospiti;

    public PartitaDiCalcio(String t, LocalDate dataE, String d, Boolean ev, Integer partecipanti,String alessandria, String casale, String alessandria1, int i1, int i2) {
    }

    public String getSquadra_oasa() {
        return squadra_casa;
    }

    public void setSquadra_oasa(String squadra_oasa) {
        this.squadra_casa = squadra_oasa;
    }

    public String getSquadra_ospite() {
        return squadra_ospite;
    }

    public void setSquadra_ospite(String squadra_ospite) {
        this.squadra_ospite = squadra_ospite;
    }

    public String getVincitore() {
        return vincitore;
    }

    public void setVincitore(String vincitore) {
        this.vincitore = vincitore;
    }

    public Integer getNumero_gol_casa() {
        return numero_gol_casa;
    }

    public void setNumero_gol_casa(Integer numero_gol_casa) {
        this.numero_gol_casa = numero_gol_casa;
    }

    public Integer getNumero_gol_ospiti() {
        return numero_gol_ospiti;
    }

    public void setNumero_gol_ospiti(Integer numero_gol_ospiti) {
        this.numero_gol_ospiti = numero_gol_ospiti;
    }
}
