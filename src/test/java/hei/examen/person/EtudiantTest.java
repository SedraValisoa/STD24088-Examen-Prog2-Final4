package hei.examen.person;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;

import org.junit.jupiter.api.Test;

public class EtudiantTest {

    @Test
    public void test() {
        Tuteur mark = new Tuteur(1, "Rakoto", "Mark", "Ivandry", Instant.parse("1988-01-01T00:00:00Z"), "0325618975", "rakoto@gmail.com", "Amie du pere de koto");
        Etudiant koto = new Etudiant(5, "Koto", "Rabe", "Ivandry", Instant.parse("2005-01-01T00:00:00Z"), "0328850975", "koto@mail.com", "K2", mark);
        koto.setNote(Instant.parse("2025-01-01T00:00:00Z"), 16);
        koto.setNote(Instant.parse("2026-01-01T00:00:00Z"), 12);

        assertEquals(16, koto.getNote(Instant.parse("2025-06-01T12:00:00Z")));
        assertEquals(12, koto.getNote(Instant.parse("2026-06-01T12:00:00Z")));
    }

}
