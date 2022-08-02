package cl.epcbbr.backend.controller;

import cl.epcbbr.backend.model.TipoProducto;
import cl.epcbbr.backend.service.TipoProductoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

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

    @ApiOperation(value = "Obtener todos los tipos de productos",
  	      notes = "No necesita parametros de entrada",
  	      response = List.class,
  	      responseContainer = "Tipo de Productos")
  @ApiResponses({
  	@ApiResponse(message = "Operacion exitosa", code = 200),
      @ApiResponse(message = "No encontrada", code = 404),
      @ApiResponse(message = "Sin autorizacion", code = 401),
      @ApiResponse(message = "Requiere autenticacion de Proxy", code = 407),
      @ApiResponse(message = "Largo minimo requerido", code = 411),
      @ApiResponse(message = "Falla interna servidor", code = 500),
  	@ApiResponse(message = "No implementado", code = 501),
  	@ApiResponse(message = "Respuesta invalida - Bad gateway", code = 502),
  	@ApiResponse(message = "Servicio fuera de alcance", code = 503),
  	@ApiResponse(message = "Gateway Tinme out", code = 504)
  })
    
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
