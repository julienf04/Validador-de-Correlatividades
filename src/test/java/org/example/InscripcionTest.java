package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    @DisplayName("Una inscripcion está aprobada")
    void aprobada() {
        Alumno alumno = new Alumno(Set.of(MateriasEjemplos.PdP));
        Inscripcion inscripcion = new Inscripcion(Set.of(MateriasEjemplos.DDSI), alumno);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Una inscripcion no está aprobada")
    void noAprobada() {
        Alumno alumno = new Alumno();
        Inscripcion inscripcion = new Inscripcion(Set.of(MateriasEjemplos.DDSI), alumno);

        Assertions.assertFalse(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Se obtienen todas las materias correlativas de todas las materias a inscribirse")
    void getMateriasCorrelativas() {
        Alumno alumno = new Alumno();
        Inscripcion inscripcion = new Inscripcion(Set.of(MateriasEjemplos.PdP, MateriasEjemplos.DDSI), alumno);

        Assertions.assertEquals(Set.of(MateriasEjemplos.AyED, MateriasEjemplos.PdP), inscripcion.getMateriasCorrelativas());
    }
}