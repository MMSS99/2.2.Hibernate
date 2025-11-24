package dam.single_table;

import jakarta.persistence.*;

import java.util.List;

@Entity
@DiscriminatorValue(value="1")
public class Medico extends Personal{

    @OneToOne
    @JoinColumn(name = "dni")
    Personal dni;

    @Enumerated(EnumType.ORDINAL)
    Turnos turno;

    @OneToOne
    @JoinColumn(name = "id")
    Consulta consulta;

    @OneToMany(mappedBy = "medico")
    private List<Evento> eventos;

}
