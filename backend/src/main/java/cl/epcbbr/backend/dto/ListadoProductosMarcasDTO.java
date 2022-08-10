package cl.epcbbr.backend.dto;

import cl.epcbbr.backend.model.Marca;
import cl.epcbbr.backend.model.Producto;
import lombok.Data;

@Data
public class ListadoProductosMarcasDTO {
	//variables de marca
	private Integer id_marca;
	private String marca_nombre;
	private Marca marca;
	
	//variables de producto - prueba con entidades
	private String modelo;
	private String producto_nombre;
	private Producto producto;
}
