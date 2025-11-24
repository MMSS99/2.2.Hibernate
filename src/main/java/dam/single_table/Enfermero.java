package dam.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue(value="2")
public class Enfermero extends Personal{
    String dni;
    int consulta;
}
