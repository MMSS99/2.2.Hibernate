package model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="dni")
@DiscriminatorValue(value="3")
public class Limpiador extends Personal{
    String dni;
    int turno;
    int planta;
}
