package org.epicode;

import jakarta.persistence.EntityManager;

import java.time.LocalDate;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Set<String> atleti = new HashSet<>();
        atleti.add("Imarisio Matteo");
        atleti.add("Cleman");
        atleti.add("Andrea Prete");
        List<String> genere = new ArrayList<>();
        genere.add("CLASSICO");
        genere.add("ROCK");
        genere.add("POP");

        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            PartitaDiCalcio partita = new PartitaDiCalcio("Alessandria - Casale", LocalDate.of(2024, 9, 16), "GRIGIONERI ALE' ", false, 3000, "Alessandria", "Casale", "Alessandria", 2, 1);
            GaraDiAtletica gara = new GaraDiAtletica("Europei 2025", LocalDate.of(2025, 8, 3), "FORZA IMA", false, 2500, atleti, "Imarisio");
            Concerto concerto = new Concerto("Concerto Green Day", LocalDate.of(2024, 6, 16), "TANTA ROBA", false, 75000, genere.get(1), true);
            em.persist(partita);
            em.persist(gara);
            em.persist(concerto);
            em.getTransaction().commit();
//
//             Recupero dell'evento appena salvato
            Long partitaId = partita.getId();
            Long garaId = gara.getId();
            Long concertoId = concerto.getId();
            em.getTransaction().begin();
            PartitaDiCalcio partitaRecuperata = em.find(PartitaDiCalcio.class, partitaId);
            GaraDiAtletica garaRecuperata = em.find(GaraDiAtletica.class, garaId);
            Concerto concertoRecuperato = em.find(Concerto.class, concertoId);
            em.getTransaction().commit();

            // Output a console utilizzando i metodi getter
            if (partitaRecuperata != null) {
                System.out.println(partita);
            } else {
                System.out.println("L'evento con ID " + partitaId + " non è stato trovato.");
            }
            if (garaRecuperata != null) {
                System.out.println(partita);
            } else {
                System.out.println("L'evento con ID " + garaId + " non è stato trovato.");
            }
            if (concertoRecuperato != null) {
                System.out.println(partita);
            } else {
                System.out.println("L'evento con ID " + concertoId + " non è stato trovato.");
            }
//
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Errore durante l'esecuzione del programma:");
            e.printStackTrace();
        } finally {
            em.close();
        }
    }
}
