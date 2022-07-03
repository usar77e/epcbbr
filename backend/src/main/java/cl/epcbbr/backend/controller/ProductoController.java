package cl.epcbbr.backend.controller;

import cl.epcbbr.backend.dto.*;
import cl.epcbbr.backend.model.Producto;
import cl.epcbbr.backend.reporte.ExportarExcel;
import cl.epcbbr.backend.service.ProductoService;
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
