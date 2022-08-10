package cl.epcbbr.backend.repository;

import cl.epcbbr.backend.model.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoProductoRepository extends JpaRepository<TipoProducto, Integer> {
	
	//busqeda de datos tipo de producto
	@Query(value = "SELECT tp.id_tproducto, tp.nombre FROM public.tipo_producto as tp WHERE tp.nombre = :tipo", nativeQuery = true)
	public TipoProducto getTipoProducto(String tipo);

}
