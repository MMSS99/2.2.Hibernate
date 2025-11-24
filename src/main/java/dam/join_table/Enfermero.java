package dam.join_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import dam.single_table.Personal;

@Entity
@DiscriminatorValue(value="2")
public class Enfermero extends Personal {

    int consulta;
}
