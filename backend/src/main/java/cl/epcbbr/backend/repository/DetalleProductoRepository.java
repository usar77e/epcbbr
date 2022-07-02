package cl.epcbbr.backend.repository;

import cl.epcbbr.backend.model.DetalleProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleProductoRepository extends JpaRepository<DetalleProducto, Integer> {
}
