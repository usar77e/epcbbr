package cl.epcbbr.backend.dto;

import cl.epcbbr.backend.model.TipoProducto;

import java.io.Serializable;

public class TipoProductosDTO implements Serializable {
    private Integer idProducto;
    private String nombre;
    private String modelo;
    private TipoProducto tipoProducto;

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

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}
