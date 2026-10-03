package tn.esprit.backend.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProjetTest {

    @Test
    void testCreationProjetAvecBuilder() {
        Projet projet = Projet.builder()
                .sujet("Application de gestion des projets")
                .build();

        assertEquals("Application de gestion des projets", projet.getSujet());
    }

    @Test
    void testIdEstNullAvantPersistance() {
        Projet projet = new Projet();
        assertNull(projet.getId());
    }

    @Test
    void testModificationSujetProjet() {
        Projet projet = new Projet();
        projet.setSujet("Sujet initial");
        assertEquals("Sujet initial", projet.getSujet());

        projet.setSujet("Sujet modifié");
        assertEquals("Sujet modifié", projet.getSujet());
        assertNotEquals("Sujet initial", projet.getSujet());
    }
}
