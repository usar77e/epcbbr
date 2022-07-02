package cl.epcbbr.backend.controller;

import cl.epcbbr.backend.model.TipoProducto;
import cl.epcbbr.backend.service.TipoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipop")
public class TipoProductoController {
    @Autowired
    private TipoProductoService tipoProductoService;

    @GetMapping("")
    public ResponseEntity<List<TipoProducto>> findAll(){
        return new ResponseEntity<>(tipoProductoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public TipoProducto findById(@PathVariable("id") Integer id){
        return tipoProductoService.findById(id);
    }

    @PostMapping
    public @ResponseBody TipoProducto save(@RequestBody TipoProducto tipoProducto){
        return tipoProductoService.save(tipoProducto);
    }
}
