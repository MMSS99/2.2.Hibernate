package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name="dni")
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

    List<Evento> eventos;
}
