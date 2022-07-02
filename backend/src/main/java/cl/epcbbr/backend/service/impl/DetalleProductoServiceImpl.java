package cl.epcbbr.backend.service.impl;

import cl.epcbbr.backend.exception.ModelNoFoundException;
import cl.epcbbr.backend.model.DetalleProducto;
import cl.epcbbr.backend.repository.DetalleProductoRepository;
import cl.epcbbr.backend.service.DetalleProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleProductoServiceImpl implements DetalleProductoService {
    @Autowired
    private DetalleProductoRepository detalleProductoRepository;

    public DetalleProductoServiceImpl(DetalleProductoRepository detalleProductoRepository) {
        this.detalleProductoRepository = detalleProductoRepository;
    }

    @Override
    public List<DetalleProducto> findAll() {
        return detalleProductoRepository.findAll();
    }

    @Override
    public DetalleProducto findById(Integer id) {
        Optional<DetalleProducto> detalleProducto = detalleProductoRepository.findById(id);
        if(detalleProducto.isPresent()){
            return detalleProducto.get();
        } else {
            throw new ModelNoFoundException("Detalle de producto no encontrado");
        }
    }

    @Override
    public DetalleProducto save(DetalleProducto detalleProducto) {
        return detalleProductoRepository.save(detalleProducto);
    }

    @Override
    public DetalleProducto update(DetalleProducto detalleProducto) {
        return save(detalleProducto);
    }

    @Override
    public boolean delete(Integer id) {
        detalleProductoRepository.deleteById(id);
        return true;
    }
}
