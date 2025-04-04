package org.example;

import java.util.Set;
import java.util.stream.Collectors;

public class Inscripcion {

    private Set<Materia> materias;
    private Alumno alumno;

    public Inscripcion(Set<Materia> materias, Alumno alumno) {
        this.materias = materias;
        this.alumno = alumno;
    }

    /// Retorna true si esta inscripción se puede aprobar, sino false.
    public boolean aprobada() {
        return getMateriasCorrelativas()
                .stream()
                .allMatch(materia -> alumno.tieneMateriaAprobada(materia));
    }

    public Set<Materia> getMaterias() {
        return this.materias;
    }

    public Set<Materia> getMateriasCorrelativas() {
        return materias
                .stream()
                .flatMap(materia -> materia.getMateriasCorrelativas().stream())
                .collect(Collectors.toSet());
    }
}
