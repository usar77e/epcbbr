package cl.epcbbr.backend.service.impl;

import cl.epcbbr.backend.model.TipoProducto;
import cl.epcbbr.backend.repository.TipoProductoRepository;
import cl.epcbbr.backend.service.TipoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoProductoServiceImpl implements TipoProductoService {

    @Autowired
    private TipoProductoRepository tipoProductoRepository;

    public TipoProductoServiceImpl(TipoProductoRepository tipoProductoRepository) {
        this.tipoProductoRepository = tipoProductoRepository;
    }

    @Override
    public List<TipoProducto> findAll() {
        return tipoProductoRepository.findAll();
    }

    @Override
    public TipoProducto findById(Integer id) {
        return null;
    }

    @Override
    public TipoProducto save(TipoProducto tipoProducto) {
        return null;
    }

    @Override
    public TipoProducto update(TipoProducto tipoProducto) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }
}
