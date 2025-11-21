package model;

public enum Turnos {
    MANANA(1),
    TARDE(2),
    NOCHE(3);

    int turno;
    Turnos(int turno) {
        this.turno = turno;
    }
}
