package cl.epcbbr.backend.model;


import com.sun.istack.NotNull;

import javax.persistence.*;

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

    public Marca() {
    }

    public Marca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public Marca(Integer idMarca, String nombre) {
        this.idMarca = idMarca;
        this.nombre = nombre;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
