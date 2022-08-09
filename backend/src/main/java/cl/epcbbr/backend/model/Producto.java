package cl.epcbbr.backend.model;
import com.sun.istack.NotNull;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_producto")
    private Integer idProducto;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @Column(name = "modelo", length = 150)
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "id_marca", nullable = false, foreignKey = @ForeignKey(name = "FK_producto_marca"))
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "id_tproducto", nullable = false, foreignKey = @ForeignKey(name = "FK_producto_tipoproducto"))
    private TipoProducto tipoProducto;
    public Producto() {
    }

    @OneToOne(mappedBy = "producto", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private DetalleProducto detalleProducto;

    
}
