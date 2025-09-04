package hei.examen.person;

import java.time.Instant;

import hei.examen.HistoriqueNote;
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

    public void setNote(Instant date ,double note) {
        HistoriqueNote.getInstance().setNote(this.getId(), date, note);
    }
    public double getNote(Instant date) {
        return HistoriqueNote.getInstance().getnote(this.getId(), date);
    }

}
