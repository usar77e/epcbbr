package cl.epcbbr.backend.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
    
    //conexion con productos
    @JsonIgnore
    @OneToMany(mappedBy = "marca")
    private List<Producto> productos;

}
