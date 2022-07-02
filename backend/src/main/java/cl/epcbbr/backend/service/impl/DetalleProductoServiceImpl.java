package cl.epcbbr.backend.service.impl;

import cl.epcbbr.backend.model.DetalleProducto;
import cl.epcbbr.backend.service.DetalleProductoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleProductoServiceImpl implements DetalleProductoService {
    @Override
    public List<DetalleProducto> findAll() {
        return null;
    }

    @Override
    public DetalleProducto findById(Integer id) {
        return null;
    }

    @Override
    public DetalleProducto save(DetalleProducto detalleProducto) {
        return null;
    }

    @Override
    public DetalleProducto update(DetalleProducto detalleProducto) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
