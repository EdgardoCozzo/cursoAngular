package entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name="persona")
@Data
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String nombre;
    @Column
    private String apellido;

}
