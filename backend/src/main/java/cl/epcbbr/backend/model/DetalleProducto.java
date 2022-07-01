package cl.epcbbr.backend.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "detalle_producto")
public class DetalleProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_detalleproducto")
    private Integer idDetalleproducto;

    @OneToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;
    @NotNull
    @Column(name = "cantidad")
    private Integer cantidad;
    public DetalleProducto() {
    }

    public DetalleProducto(Integer idDetalleproducto) {
        this.idDetalleproducto = idDetalleproducto;
    }

    public DetalleProducto(Integer idDetalleproducto, Producto producto, Integer cantidad) {
        this.idDetalleproducto = idDetalleproducto;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Integer getIdDetalleproducto() {
        return idDetalleproducto;
    }

    public void setIdDetalleproducto(Integer idDetalleproducto) {
        this.idDetalleproducto = idDetalleproducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
