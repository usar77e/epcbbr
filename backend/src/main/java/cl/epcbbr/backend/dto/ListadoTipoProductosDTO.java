package cl.epcbbr.backend.dto;

import lombok.Data;

@Data
public class ListadoTipoProductosDTO {
	//variables tipo producto
	private Integer id_tproducto;
	private String tnombre;
	
	//variables producto
	private Integer id_producto;
	private String modelo;
	private String pnombre;
	
}
