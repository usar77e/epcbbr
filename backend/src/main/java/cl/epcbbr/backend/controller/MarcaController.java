package cl.epcbbr.backend.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import cl.epcbbr.backend.dto.MarcaByIdDTO;
import cl.epcbbr.backend.model.Marca;
import cl.epcbbr.backend.repository.projections.FindMarcaByIdDTO;
import cl.epcbbr.backend.service.MarcaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

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
    
    protected final Logger logger = LogManager.getLogger(getClass().getName());
    
    @ApiOperation(value = "Obtiene la lista de todas las marcas")
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
    public ResponseEntity<List<Marca>> findAll(){
        return new ResponseEntity<>(marcaService.findAll(), HttpStatus.OK);
    }

    @ApiOperation(value = "Buscar por valor")
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
    @GetMapping("/{id}")
    public Marca findById(@PathVariable("id") Integer id){
        return marcaService.findById(id);
    }

    @ApiOperation(value = "Guarda el valor de una nueva marca")
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
    @PostMapping(value = "/save")
    public @ResponseBody Marca save(@RequestBody Marca marca){
        return marcaService.save(marca);
    }
    
    @RequestMapping(value = "/search", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<MarcaByIdDTO>> findByIdDto(
			@RequestParam(value = "id", required = true) Integer id) {
		try {
			List<MarcaByIdDTO> list = marcaService.findMarcaByIdDTO(id);
			return new ResponseEntity<List<MarcaByIdDTO>>(list, HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Ha ocurrido un error al realizar la busqueda de credenciales vinculadas al usuario: " + ex.getMessage());
			return new ResponseEntity<List<MarcaByIdDTO>>(HttpStatus.FAILED_DEPENDENCY);
		}
	}
    
    @RequestMapping(value = "/searchb", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<List<FindMarcaByIdDTO>> findByIdDtoB(
			@RequestParam(value = "id", required = true) Integer id) {
		try {
			List<FindMarcaByIdDTO> list = marcaService.findMarcaByIdDTOB(id);
			return new ResponseEntity<List<FindMarcaByIdDTO>>(list, HttpStatus.OK);
		} catch (Exception ex) {
			logger.error("Ha ocurrido un error al realizar la busqueda de credenciales vinculadas al usuario: " + ex.getMessage());
			return new ResponseEntity<List<FindMarcaByIdDTO>>(HttpStatus.FAILED_DEPENDENCY);
		}
	}
}
