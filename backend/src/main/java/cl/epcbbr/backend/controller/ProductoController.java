package cl.epcbbr.backend.controller;

import cl.epcbbr.backend.dto.ProductosTotalDTO;
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

    public List<ProductosTotalDTO> findMarcaProdDto(){
        return productoService.findMarcaProdDto();
    }

}
