package dam.table_per_class;
import jakarta.persistence.*;
import dam.single_table.Personal;
import dam.single_table.Turnos;


@Entity
public class Medico extends Personal {

    @Enumerated(EnumType.ORDINAL)
    Turnos turno;

}
