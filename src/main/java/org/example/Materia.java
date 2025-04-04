package org.example;

import java.util.HashSet;
import java.util.Set;

public class Materia {

    private String nombre;
    private Set<Materia> materiasCorrelativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.materiasCorrelativas = new HashSet<>();
    }

    public Materia(String nombre, Set<Materia> materiasCorrelativas) {
        this.nombre = nombre;
        this.materiasCorrelativas = materiasCorrelativas;
    }

    public Set<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }
}
