package cl.epcbbr.backend.repository;

import cl.epcbbr.backend.dto.MarcaByIdDTO;
import cl.epcbbr.backend.model.Marca;
import cl.epcbbr.backend.repository.projections.FindMarcaByIdDTO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer> {
	
	//busqueda por id en base de datos / DTO
	@Query(value = "SELECT id_marca, nombre FROM marca WHERE id_marca = :id_marca", nativeQuery = true)
	public List<MarcaByIdDTO> findMarcaByIdDTO(Integer id_marca);
	
	//busqueda por id en base de datos / DTO - Projections
	@Query(value = "SELECT id_marca, nombre FROM marca WHERE id_marca = :id_marca", nativeQuery = true)
	public List<FindMarcaByIdDTO> findMarcaByIdDTOB(Integer id_marca);
}
