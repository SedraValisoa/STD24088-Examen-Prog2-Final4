package hei.examen.person;

import java.time.Instant;

import lombok.Getter;

@Getter
public class Tuteur extends Person {
    private String description;
    public Tuteur(int id, String nom, String prenom, String adresse, Instant dateNaissance, String tel, String email, String description) { 
        super(id , nom, prenom, adresse, dateNaissance, tel, email);
        this.description = description;
    }
}
