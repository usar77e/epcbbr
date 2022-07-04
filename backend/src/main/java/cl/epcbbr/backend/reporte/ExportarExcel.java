package cl.epcbbr.backend.reporte;

import cl.epcbbr.backend.model.Producto;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ExportarExcel {
    private XSSFWorkbook libro;
    private XSSFSheet hoja;
    private List<Producto> listaProducto;

    public ExportarExcel(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
        libro = new XSSFWorkbook();
        hoja = libro.createSheet("Productos");
    }

    private void escribirCabeceraTabla() {
        Row fila = hoja.createRow(0);
        CellStyle estilo = libro.createCellStyle();
        XSSFFont fuente = libro.createFont();
        fuente.setBold(true);
        fuente.setFontHeight(16);
        estilo.setFont(fuente);

        Cell celda = fila.createCell(0);
        celda.setCellValue("ID");
        celda.setCellStyle(estilo);

        celda = fila.createCell(1);
        celda.setCellValue("Nombre");
        celda.setCellStyle(estilo);

        celda = fila.createCell(2);
        celda.setCellValue("Modelo");
        celda.setCellStyle(estilo);

        celda = fila.createCell(3);
        celda.setCellValue("Marca");
        celda.setCellStyle(estilo);

        celda = fila.createCell(4);
        celda.setCellValue("Tipo Producto");
        celda.setCellStyle(estilo);

    }

    private void escribirDatos(){
        int numeroFilas = 1;

        CellStyle estilo = libro.createCellStyle();
        XSSFFont fuente = libro.createFont();
        fuente.setFontHeight(14);
        estilo.setFont(fuente);

        for(Producto producto: listaProducto) {
            Row fila = hoja.createRow(numeroFilas++);

            Cell celda = fila.createCell(0);
            celda.setCellValue(producto.getIdProducto());
            hoja.autoSizeColumn(0);
            celda.setCellStyle(estilo);

            celda = fila.createCell(1);
            celda.setCellValue(producto.getNombre());
            hoja.autoSizeColumn(0);
            celda.setCellStyle(estilo);

            celda = fila.createCell(2);
            celda.setCellValue(producto.getModelo());
            hoja.autoSizeColumn(0);
            celda.setCellStyle(estilo);

            celda = fila.createCell(3);
            celda.setCellValue(producto.getMarca().getNombre());
            hoja.autoSizeColumn(0);
            celda.setCellStyle(estilo);

            celda = fila.createCell(4);
            celda.setCellValue(producto.getTipoProducto().getNombre());
            hoja.autoSizeColumn(0);
            celda.setCellStyle(estilo);
        }
    }

    public void exportar(HttpServletResponse response) throws IOException {
        escribirCabeceraTabla();
        escribirDatos();

        ServletOutputStream outPutStream = response.getOutputStream();
        libro.write(outPutStream);

        libro.close();
        outPutStream.close();
    }
}
