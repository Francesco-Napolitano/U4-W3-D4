package org.epicode;

import jakarta.persistence.EntityManager;
import java.time.LocalDate;

public class MainApp {
    public static void main(String[] args) {
        EntityManager em = EntityManagerUtil.getEntityManager();
        try {
            // Creazione e salvataggio dell'evento
            em.getTransaction().begin();
            Eventi evento1 = new Eventi(
                    "Concerto Vasco Rossi",
                    LocalDate.of(2024, 9, 16),
                    "Miglior concerto di un cantautore italiano degli anni 80' ",
                    false,
                    200
            );
            em.persist(evento1);
            em.getTransaction().commit();

            // Recupero dell'evento appena salvato
            Long eventoId = evento1.getId();
            em.getTransaction().begin();
            Eventi eventoRecuperato = em.find(Eventi.class, eventoId);
            em.getTransaction().commit();

            // Output a console utilizzando i metodi getter
            if (eventoRecuperato != null) {
                System.out.println(evento1);
            } else {
                System.out.println("L'evento con ID " + eventoId + " non è stato trovato.");
            }

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
