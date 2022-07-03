package cl.epcbbr.backend.dto;

import cl.epcbbr.backend.model.Marca;

import java.io.Serializable;

public class MarcaProductosDTO implements Serializable {
    private Integer idProducto;
    private String nombre;
    private String modelo;
    private Marca marca;

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
}
