package hei.examen.person;

import java.time.Instant;

import lombok.Getter;

@Getter
public class Etudiant extends Person {
    private String groupe;
    private Tuteur tuteur;

    public Etudiant(int id, String nom, String prenom, String adresse, Instant dateNaissance, String tel, String email, String groupe, Tuteur tuteur) {
        super(id , nom, prenom, adresse, dateNaissance, tel, email);
        this.groupe = groupe;
        this.tuteur = tuteur;
    }
}
