package org.example;

import java.util.HashSet;
import java.util.Set;

public class Alumno {

    private Set<Materia> materiasAprobadas;

    public Alumno() {
        this.materiasAprobadas = new HashSet<>();
    }

    public Alumno(Set<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public Set<Materia> getMateriasAprobadas() {
        return this.materiasAprobadas;
    }

    public boolean tieneMateriaAprobada(Materia materia) {
        return this.materiasAprobadas.contains(materia);
    }
}
