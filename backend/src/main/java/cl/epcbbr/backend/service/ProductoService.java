package cl.epcbbr.backend.service;

import cl.epcbbr.backend.dto.ProductosTotalDTO;
import cl.epcbbr.backend.model.Producto;

import java.util.List;

public interface ProductoService extends ICRUD<Producto>{

    List<ProductosTotalDTO> findAllDto();

    List<ProductosTotalDTO> findMarcaProdDto();
}
