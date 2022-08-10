package cl.epcbbr.backend.manager;

import java.util.List;

import cl.epcbbr.backend.dto.MarcaByIdDTO;
import cl.epcbbr.backend.model.Marca;
import cl.epcbbr.backend.model.TipoProducto;
import cl.epcbbr.backend.repository.projections.FindMarcaByIdDTO;

public interface MarcaManager extends ICRUDManager<Marca> {
	public List<MarcaByIdDTO> findMarcaByIdDTO(Integer id_marca);
	
	public List<FindMarcaByIdDTO> findMarcaByIdDTOB(Integer id_marca);
	
	public Marca getMarcaProductoByNombreDTO(String marca);
}
