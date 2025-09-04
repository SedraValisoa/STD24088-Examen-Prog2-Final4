package hei.examen.person;

import java.time.Instant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person {
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private Instant dateNaissance;
    private String tel;
    private String email;
}
