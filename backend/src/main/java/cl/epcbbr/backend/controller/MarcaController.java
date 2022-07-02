package cl.epcbbr.backend.controller;

import cl.epcbbr.backend.model.Marca;
import cl.epcbbr.backend.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marca")
public class MarcaController {
    @Autowired
    private MarcaService marcaService;

    @GetMapping("")
    public ResponseEntity<List<Marca>> findAll(){
        return new ResponseEntity<>(marcaService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Marca findById(@PathVariable("id") Integer id){
        return marcaService.findById(id);
    }

    @PostMapping
    public @ResponseBody Marca save(@RequestBody Marca marca){
        return marcaService.save(marca);
    }
}
