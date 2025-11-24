package dam.table_per_class;
import jakarta.persistence.Entity;
import dam.single_table.Personal;

@Entity
public class Enfermero extends Personal {
    String dni;
    int consulta;
}
