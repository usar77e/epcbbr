package cl.epcbbr.backend.service;

import cl.epcbbr.backend.dto.*;
import cl.epcbbr.backend.model.Producto;

import java.util.List;

public interface ProductoService extends ICRUD<Producto>{

    List<ProductosTotalDTO> findAllDto();

    List<MarcaProductosDTO> findMarcaProdDto();

    List<ProductosDTO> findAllProdDto();

    List<DetalleProductosDTO> findAllProdDetDto();

    List<TipoProductosDTO> findTipoProductoDto();
}
