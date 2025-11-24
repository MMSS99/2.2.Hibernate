package dam.join_table;

import jakarta.persistence.*;
import dam.single_table.Consulta;
import dam.single_table.Personal;
import dam.single_table.Turnos;

import java.util.List;

@Entity
@DiscriminatorValue(value="1")
public class Medico extends Personal {

    @Enumerated(EnumType.ORDINAL)
    Turnos turno;


}
