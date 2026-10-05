package com.mr486.homeskolar.model;

import java.time.LocalDateTime;

public class RendezVous {
    private Long id;
    private Long idEleve;
    private Long idTuteur;
    private LocalDateTime dateHeureDebut;
    private LocalDateTime dateHeureFin;
    private String lienVisio;
    private RdvStatus status;

    public void creerRendezVous() {}
    public void annulerRendezVous() {}
    public void terminerRendezVous() {}
}
