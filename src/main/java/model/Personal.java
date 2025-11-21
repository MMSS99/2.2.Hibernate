package model;

import jakarta.persistence.*;

@Entity
@Table(name = "personal")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name= "trabajo", discriminatorType= DiscriminatorType.STRING)
public class Personal {
    @Id
    @Column(name= "dni", nullable=false, unique=true, length=9)
    String dni;
    @Column(name= "nss", nullable=false, unique=true, length=30)
    String NSS;
    @Column(name= "direccion", nullable=false, length=127)
    String direccion;
    @Column(name= "telefono", nullable=false, length=127)
    String telefono;
    @Column(name= "nombre", nullable=false, length=127)
    String nombre;
    @Column(name= "trabajo", nullable=false, length=127)
    String trabajo;
}
