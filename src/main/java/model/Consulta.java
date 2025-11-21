package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Consulta {
    int planta;

    @Column(name= "direccion", nullable=false)
    String direccion;

    @Id
    @Column(name= "dni", nullable=false, unique=true, length=9)
    int id;
}
