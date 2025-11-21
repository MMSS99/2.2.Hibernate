package model;

import jakarta.persistence.Column;

public class Evento {
    @Column(name= "fecha", nullable=false, length=127)
    String fecha;
    @Column(name= "descripcion", nullable=false, length=1270)
    String descripcion;
}
