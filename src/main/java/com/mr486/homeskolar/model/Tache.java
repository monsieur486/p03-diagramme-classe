package com.mr486.homeskolar.model;

import java.time.LocalDate;

public class Tache {
    private Long id;
    private LocalDate dateCreation;
    private Long idEmetteur;
    private Long idDestinataire;
    private String contenu;
    private StatusTache status;

    public void creerTache() {}
    public void modifierTache() {}
    public void marquerFaite() {}
    public void validerTache() {}
    public void refuserTache() {}
}
