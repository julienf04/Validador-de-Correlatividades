package org.example;

import java.util.Set;

/// Son materias de ejemplo usadas para los Tests.
public class MateriasEjemplos {

    public static final Materia AyED = new Materia("AyED");
    public static final Materia PdP = new Materia("PdP", Set.of(AyED));
    public static final Materia DDSI = new Materia("DDSI", Set.of(PdP));

}
