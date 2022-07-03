package cl.epcbbr.backend.dto;

import cl.epcbbr.backend.model.DetalleProducto;
import cl.epcbbr.backend.model.Marca;
import cl.epcbbr.backend.model.TipoProducto;

import java.io.Serializable;

public class ProductosTotalDTO implements Serializable {
    private Integer idProducto;
    private String nombre;
    private String modelo;
    private Marca marca;
    private TipoProducto tipoProducto;
    private DetalleProducto detalleProducto;

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
