package dam.table_per_class;

public enum Turnos {
    MANANA(1),
    TARDE(2),
    NOCHE(3);

    int turno;
    Turnos(int turno) {
        this.turno = turno;
    }
}
