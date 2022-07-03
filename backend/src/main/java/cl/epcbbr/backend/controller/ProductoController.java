package cl.epcbbr.backend.controller;

import cl.epcbbr.backend.dto.*;
import cl.epcbbr.backend.model.Producto;
import cl.epcbbr.backend.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("")
    public ResponseEntity<List<Producto>> findAll(){
        return new ResponseEntity<>(productoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Producto findById(@PathVariable("id") Integer id){
        return productoService.findById(id);
    }

    @PostMapping
    public @ResponseBody Producto save(@RequestBody Producto producto){
        return productoService.save(producto);
    }

    @GetMapping("/dtoprod")
    public List<ProductosTotalDTO> findAllDto(){
        return productoService.findAllDto();
    }

    @GetMapping("/dtomprod")
    public List<MarcaProductosDTO> findMarcaProdDto(){
        return productoService.findMarcaProdDto();
    }

    @GetMapping("/dtoprodsolo")
    public List<ProductosDTO> findAllProdDto(){
        return productoService.findAllProdDto();
    }

    @GetMapping("/dtoprodet")
    public List<DetalleProductosDTO> findAllProdDetDto(){
        return productoService.findAllProdDetDto();
    }

    @GetMapping("/dtotprod")
    public List<TipoProductosDTO> findTipoProductoDto(){
        return productoService.findTipoProductoDto();
    }
}
