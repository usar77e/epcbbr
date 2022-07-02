package cl.epcbbr.backend.controller;

import cl.epcbbr.backend.model.DetalleProducto;
import cl.epcbbr.backend.service.DetalleProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalle")
public class DetalleProductoController {
    @Autowired
    private DetalleProductoService detalleProductoService;

    @GetMapping("")
    public ResponseEntity<List<DetalleProducto>> findAll(){
        return new ResponseEntity<>(detalleProductoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public DetalleProducto findById(@PathVariable("id") Integer id){
        return detalleProductoService.findById(id);
    }

    @PostMapping
    public @ResponseBody DetalleProducto save(@RequestBody DetalleProducto detalleProducto){
        return detalleProductoService.save(detalleProducto);
    }

}
