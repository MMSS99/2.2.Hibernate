package dam.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue(value="3")
public class Limpiador extends Personal{
    String dni;
    int turno;
    int planta;
}
