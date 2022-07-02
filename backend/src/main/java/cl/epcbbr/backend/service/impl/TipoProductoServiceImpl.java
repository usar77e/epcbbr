package cl.epcbbr.backend.service.impl;

import cl.epcbbr.backend.exception.ModelNoFoundException;
import cl.epcbbr.backend.model.TipoProducto;
import cl.epcbbr.backend.repository.TipoProductoRepository;
import cl.epcbbr.backend.service.TipoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<TipoProducto> tipoProducto = tipoProductoRepository.findById(id);
        if(tipoProducto.isPresent()){
            return tipoProducto.get();
        } else {
            throw new ModelNoFoundException("Tipo de producto no encontrado");
        }
    }

    @Override
    public TipoProducto save(TipoProducto tipoProducto) {
        return tipoProductoRepository.save(tipoProducto);
    }

    @Override
    public TipoProducto update(TipoProducto tipoProducto) {
        return save(tipoProducto);
    }

    @Override
    public boolean delete(Integer id) {
        tipoProductoRepository.deleteById(id);
        return true;
    }
}
