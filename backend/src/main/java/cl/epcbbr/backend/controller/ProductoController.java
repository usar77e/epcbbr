package cl.epcbbr.backend.controller;

import cl.epcbbr.backend.dto.*;
import cl.epcbbr.backend.model.Producto;
import cl.epcbbr.backend.reporte.ExportarExcel;
import cl.epcbbr.backend.service.ProductoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @ApiOperation(value = "Obtiene la lista de todas los Productos")
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
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("")
    public ResponseEntity<List<Producto>> findAll(){
        return new ResponseEntity<>(productoService.findAll(), HttpStatus.OK);
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
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
    public Producto findById(@PathVariable("id") Integer id){
        return productoService.findById(id);
    }

    @ApiOperation(value = "Guarda el valor de un nuevo Producto")
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
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public @ResponseBody Producto save(@RequestBody Producto producto){
        return productoService.save(producto);
    }


    @ApiOperation(value = "DTO permite traer solo valores de tablas asociadas a productos")
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
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/dtoprod")
    public List<ProductosTotalDTO> findAllDto(){
        return productoService.findAllDto();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/dtomprod")
    public List<MarcaProductosDTO> findMarcaProdDto(){
        return productoService.findMarcaProdDto();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/dtoprodsolo")
    public List<ProductosDTO> findAllProdDto(){
        return productoService.findAllProdDto();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/dtoprodet")
    public List<DetalleProductosDTO> findAllProdDetDto(){
        return productoService.findAllProdDetDto();
    }

    @ApiOperation(value = "DTO con tipo de producto - producto")
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
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/dtotprod")
    public List<TipoProductosDTO> findTipoProductoDto(){
        return productoService.findTipoProductoDto();
    }

    @ApiOperation(value = "Genera y descarga valores en un excel")
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
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/exportar")
    public void exportarExcel(HttpServletResponse response) throws  IOException {
        response.setContentType("application/octet-stream");

        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String fechaActual = dateFormatter.format(new Date());

        String cabecera = "Content-Disposition";
        String valor = "attachment; filename=Productos_" + fechaActual + ".xlsx";

        response.setHeader(cabecera, valor);

        List<Producto> productos = productoService.findAll();
        ExportarExcel exporter = new ExportarExcel(productos);
        exporter.exportar(response);

    }

}
