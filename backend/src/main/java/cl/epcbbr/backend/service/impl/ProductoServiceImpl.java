package cl.epcbbr.backend.service.impl;

import cl.epcbbr.backend.dto.ProductosTotalDTO;
import cl.epcbbr.backend.exception.ModelNoFoundException;
import cl.epcbbr.backend.model.Producto;
import cl.epcbbr.backend.repository.ProductoRepository;
import cl.epcbbr.backend.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto findById(Integer id) {
        Optional<Producto> producto = productoRepository.findById(id);
        if(producto.isPresent()){
            return producto.get();
        } else {
            throw new ModelNoFoundException("Producto no encontrado");
        }
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto update(Producto producto) {
        return save(producto);
    }

    @Override
    public boolean delete(Integer id) {
        productoRepository.deleteById(id);
        return true;
    }

    @Override
    public List<ProductosTotalDTO> findAllDto() {
        List<ProductosTotalDTO> dtos = new ArrayList<>();
        List<Producto> productos = productoRepository.findAll();
        productos.forEach(producto -> {
            ProductosTotalDTO prodDto = new ProductosTotalDTO();
            prodDto.setIdProducto(producto.getIdProducto());
            prodDto.setNombre(producto.getNombre());
            prodDto.setModelo(producto.getModelo());
            prodDto.setMarca(producto.getMarca());
            prodDto.setTipoProducto(producto.getTipoProducto());
            prodDto.setDetalleProducto(producto.getDetalleProducto());
            dtos.add(prodDto);
        });
        return dtos;
    }

    @Override
    public List<ProductosTotalDTO> findMarcaProdDto() {
        List<ProductosTotalDTO> dtos = new ArrayList<>();
        List<Producto> productos = productoRepository.findAll();
        productos.forEach(producto -> {
            ProductosTotalDTO prodDTO = new ProductosTotalDTO();
            prodDTO.setNombre(producto.getNombre());
            prodDTO.setModelo(producto.getModelo());
            //prodDTO.setMarca();
            dtos.add(prodDTO);
        });
        return dtos;
    }
}
