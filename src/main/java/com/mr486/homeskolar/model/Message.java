package com.mr486.homeskolar.model;

import java.time.LocalDate;

public class Message {
    private Long id;
    private Long idEmetteur;
    private Long idDestinataire;
    private LocalDate dateEnvoi;
    private String titre;
    private String contenu;
    private boolean estLu;
    private boolean estEpingle;

    public void envoyerMessage() {}
    public void marquerCommeLu() {}
    public void epinglerMessage() {}
    public void desepinglerMessage() {}
}
