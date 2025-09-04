package hei.examen.person;

import java.time.Instant;

import lombok.Getter;

@Getter
public class Enseignants extends Person {
    private String specialite;
    public Enseignants(int id, String nom, String prenom, String adresse, Instant dateNaissance, String tel, String email, String specialite) {
        super(id , nom, prenom, adresse, dateNaissance, tel, email);
        this.specialite = specialite;
    }
}
