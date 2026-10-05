package com.mr486.homeskolar.model;

import java.time.LocalDate;

public class Eleve {
    // La fiche partage l'identifiant de son compte : idUser est à la fois la
    // clé de l'élève et le lien vers le User qui le porte.
    private Long idUser;
    private LocalDate dateNaissance;
    private NiveauScolaire niveauScolaire;
    // Ce que l'élève cherche à travailler, en texte libre : la ou les matières
    // sur lesquelles il a besoin d'aide. C'est ce que lit l'administrateur pour
    // lui trouver un tuteur.
    private String souhait;

    public void modifierFiche() {}
}
