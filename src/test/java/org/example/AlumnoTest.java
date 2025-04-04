package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    @DisplayName("Un alumno tiene una materia aprobada")
    void tieneMateriaAprobada() {
        Alumno alumno = new Alumno(Set.of(MateriasEjemplos.AyED));
        Assertions.assertTrue(alumno.tieneMateriaAprobada(MateriasEjemplos.AyED));
    }

    @Test
    @DisplayName("Un alumno no tiene una materia aprobada")
    void noTieneMateriaAprobada() {
        Alumno alumno = new Alumno();
        Assertions.assertFalse(alumno.tieneMateriaAprobada(MateriasEjemplos.AyED));
    }
}