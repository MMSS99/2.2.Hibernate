package dam.single_table;

import jakarta.persistence.*;

@Entity
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "fecha", nullable=false, length=127)
    String fecha;
    @Column(name= "descripcion", nullable=false, length=1270)
    String descripcion;

    @ManyToOne
    @JoinColumn(name = "dni")
    private Medico medico;

}
