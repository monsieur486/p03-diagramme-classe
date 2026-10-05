package com.mr486.homeskolar.model;

import java.time.LocalDate;

public class User {
    private Long id;
    private RoleUtilisateur role;
    private String prenom;
    private String nom;
    private String email;
    private String motDePasseHash;
    private LocalDate dateInscription;
    private boolean estActif;

    public void inscrire() {}
    public void modifierMotDePasse() {}
    public void modifierProfil() {}
    public void desactiverUtilisateur() {}
}
