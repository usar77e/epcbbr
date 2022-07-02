package cl.epcbbr.backend.service.impl;

import cl.epcbbr.backend.model.Producto;
import cl.epcbbr.backend.service.ProductoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Override
    public List<Producto> findAll() {
        return null;
    }

    @Override
    public Producto findById(Integer id) {
        return null;
    }

    @Override
    public Producto save(Producto producto) {
        return null;
    }

    @Override
    public Producto update(Producto producto) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
