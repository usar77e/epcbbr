package cl.epcbbr.backend.model;

import javax.persistence.*;

@Entity
@Table(name = "tipo_producto")
public class TipoProducto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tproducto")
    private Integer idTproducto;

    @Column(name = "nombre", length = 70)
    private String nombre;

    public TipoProducto() {
    }

    public TipoProducto(Integer idTproducto) {
        this.idTproducto = idTproducto;
    }

    public TipoProducto(Integer idTproducto, String nombre) {
        this.idTproducto = idTproducto;
        this.nombre = nombre;
    }

    public Integer getIdTproducto() {
        return idTproducto;
    }

    public void setIdTproducto(Integer idTproducto) {
        this.idTproducto = idTproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
