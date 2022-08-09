package cl.epcbbr.backend.dto;

import java.io.Serializable;

public class MarcaByIdDTO implements Serializable{
	private Integer idMarca;
	private String nombre;
	
	
	public MarcaByIdDTO() {
	
	}
	
	public MarcaByIdDTO(Integer idMarca, String nombre) {
		super();
		this.idMarca = idMarca;
		this.nombre = nombre;
	}
	public Integer getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
