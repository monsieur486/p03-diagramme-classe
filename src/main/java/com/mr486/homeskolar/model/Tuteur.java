package com.mr486.homeskolar.model;

public class Tuteur {
    // La fiche partage l'identifiant de son compte : idUser est à la fois la
    // clé du tuteur et le lien vers le User qui le porte.
    private Long idUser;
    // Ce que le bénévole se sent capable d'apporter, en texte libre. C'est ce
    // que lit l'administrateur pour lui confier un élève.
    private String competences;

    public void modifierFiche() {}
}
