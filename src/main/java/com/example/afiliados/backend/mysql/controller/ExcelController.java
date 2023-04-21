package com.example.afiliados.backend.mysql.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.example.afiliados.backend.mysql.dto.Excel;
import com.example.afiliados.backend.mysql.entity.ExcelEntity;
import com.example.afiliados.backend.mysql.service.IExcelService;
import com.example.afiliados.backend.mysql.service.IUploadFileService;




@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/home")
public class ExcelController {
	@Autowired(required = false)
	private IUploadFileService uploadService;
	
	@Autowired(required = false)
	private IExcelService excelService;

	@PostMapping("/excel/upload")
	public ResponseEntity<?> upload(@RequestParam("archivo") MultipartFile archivo,String codigo) throws IOException //con el binding result validaremos
	{
	    List<Excel> listaExcelDeAfiliados = new ArrayList<>();
        XSSFWorkbook workbook = new XSSFWorkbook(archivo.getInputStream());
      
        
		Map<String,Object>response= new HashMap<>();
		
		if(!archivo.isEmpty())
		{
			String nombreArchivo= null;
			
			
			  
	        // LEER EL EXCEL.
	        XSSFSheet worksheet = workbook.getSheetAt(0);
	        for (int index = 0; index < worksheet.getPhysicalNumberOfRows(); index++) {
	            if (index > 0) {
	                XSSFRow row = worksheet.getRow(index);
	                Excel excelDeAfiliados = new Excel();
	                
	                excelDeAfiliados.id = excelService.convertStringToInt(excelService.getCellValue(row, 0));
	                
	                excelDeAfiliados.numero_dni_titular =  excelService.getCellValue(row, 1);
	                excelDeAfiliados.tipo_rp_o_a = excelService.getCellValue(row, 2);
	                excelDeAfiliados.numero_dni_afiliado =  excelService.getCellValue(row, 3);
	                excelDeAfiliados.apellido_paterno_afiliado =  excelService.getCellValue(row, 4);
	                excelDeAfiliados.apellido_materno_afiliado =  excelService.getCellValue(row, 5);
	                excelDeAfiliados.primer_nombre_afiliado =  excelService.getCellValue(row, 6);
	                excelDeAfiliados.segundo_nombre_afiliado =  excelService.getCellValue(row, 7);
	                excelDeAfiliados.fecha_de_nacimiento_afiliado =  excelService.getCellValue(row, 8);
	                excelDeAfiliados.edad_afiliado =  excelService.getCellValue(row, 9);
	                excelDeAfiliados.sexo_afiliado =  excelService.getCellValue(row, 10);
	                excelDeAfiliados.estado_civil_afiliado =  excelService.getCellValue(row, 11);
	                excelDeAfiliados.parentesco_afiliado =  excelService.getCellValue(row, 12);
	                excelDeAfiliados.direccion_afiliado =  excelService.getCellValue(row, 13);
	                excelDeAfiliados.telefono_afiliado =  excelService.getCellValue(row, 14);
	                excelDeAfiliados.email_afiliado =  excelService.getCellValue(row, 15);
	                excelDeAfiliados.prima_incl_igv =  excelService.getCellValue(row, 16);
	                excelDeAfiliados.tipo_doc_afiliado =  excelService.getCellValue(row, 17);
	                excelDeAfiliados.cert_num =  excelService.getCellValue(row, 18);
	                excelDeAfiliados.codigo_plan =  excelService.getCellValue(row, 19);
	                excelDeAfiliados.cert_estado =  excelService.getCellValue(row, 20);
	                excelDeAfiliados.fech_ini_vig =  excelService.getCellValue(row, 21);
	                excelDeAfiliados.fech_fin_vig =  excelService.getCellValue(row, 22);
	                excelDeAfiliados.campo_cliente_id =  excelService.getCellValue(row, 23);
	                
	                listaExcelDeAfiliados.add(excelDeAfiliados);
	            }
	        }
	        
	        // Save to db.
	        List<ExcelEntity> entities = new ArrayList<>();
	        if (listaExcelDeAfiliados.size() > 0) {
	        	listaExcelDeAfiliados.forEach(x->{
	            	ExcelEntity entity = new ExcelEntity();
	                entity.id = x.id;
	                entity.numero_dni_titular = x.numero_dni_titular;
	                entity.tipo_rp_o_a =x.tipo_rp_o_a;
	                entity.numero_dni_afiliado = x.numero_dni_afiliado;
	                entity.apellido_paterno_afiliado = x.apellido_paterno_afiliado;
	                entity.apellido_materno_afiliado = x.apellido_materno_afiliado;
	                entity.primer_nombre_afiliado = x.primer_nombre_afiliado;
	                entity.segundo_nombre_afiliado = x.segundo_nombre_afiliado;
	                entity.fecha_de_nacimiento_afiliado = x.fecha_de_nacimiento_afiliado;
	                entity.edad_afiliado = x.edad_afiliado;
	                entity.sexo_afiliado = x.sexo_afiliado;
	                entity.estado_civil_afiliado = x.estado_civil_afiliado;
	                entity.parentesco_afiliado = x.parentesco_afiliado;
	                entity.direccion_afiliado = x.direccion_afiliado;
	                entity.telefono_afiliado = x.telefono_afiliado;
	                entity.email_afiliado = x.email_afiliado;
	                entity.prima_incl_igv = x.prima_incl_igv;
	                entity.tipo_doc_afiliado = x.tipo_doc_afiliado;
	                entity.cert_num = x.cert_num;
	                entity.codigo_plan = x.codigo_plan;
	                entity.cert_estado = x.cert_estado;
	                entity.fech_ini_vig = x.fech_ini_vig;
	                entity.fech_fin_vig = x.fech_fin_vig;
	                entity.campo_cliente_id = x.campo_cliente_id;
	              //  entities.add(entity);
	                //Guarda el excel
	                excelService.save(entity);
	            });
	        
	            try {
					//Guarda en la carpeta 
					nombreArchivo = uploadService.copiar(archivo,codigo);
				} catch (IOException e) {
					response.put("mensaje","Error al subir el archivo : ");
					response.put("error",e.getMessage()+" :" +e.getCause().getMessage());
					return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);
				}
	            
	        }
			//String nombreFotoAnterior=medicamento.getFoto();
			//uploadService.eliminar(nombreFotoAnterior);
			
			
			//medicamento.setFoto(nombreArchivo);
			//medicamentosService.save(medicamento);
			//response.put("medicamento",medicamento);
			response.put("mensaje","EXCEL CARGADO SATISFACTORIAMENTE : "+nombreArchivo);
		}
		
		return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CREATED);
		
	}

	
   
   
}

