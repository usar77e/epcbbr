package cl.epcbbr.backend.model;


import com.sun.istack.NotNull;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_marca")
    private Integer idMarca;

    @NotNull
    @Column(unique = true, name = "nombre", length = 70)
    private String nombre;

}
