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

    //conexion con marcas
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_marca", nullable = false, foreignKey = @ForeignKey(name = "FK_producto_marca"))
    private Marca marca;

    //conexion con tipo productos
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_tproducto", nullable = false, foreignKey = @ForeignKey(name = "FK_producto_tipoproducto"))
    private TipoProducto tipoProducto;

    //conexion con detalle de productos
    @JsonIgnore
    @OneToOne(mappedBy = "producto", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private DetalleProducto detalleProducto;

    
}
