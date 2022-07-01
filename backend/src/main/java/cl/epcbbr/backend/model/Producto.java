package cl.epcbbr.backend.model;
import com.sun.istack.NotNull;

import javax.persistence.*;

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

    @OneToOne(mappedBy = "producto")
    private DetalleProducto detalleProducto;

    public Producto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(Integer idProducto, String nombre, String modelo, Marca marca, TipoProducto tipoProducto, DetalleProducto detalleProducto) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
        this.tipoProducto = tipoProducto;
        this.detalleProducto = detalleProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public DetalleProducto getDetalleProducto() {
        return detalleProducto;
    }

    public void setDetalleProducto(DetalleProducto detalleProducto) {
        this.detalleProducto = detalleProducto;
    }
}
