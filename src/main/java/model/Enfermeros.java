package model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="dni")
@DiscriminatorValue(value="2")
public class Enfermeros extends Personal{
    String dni;
    int consulta;
}
