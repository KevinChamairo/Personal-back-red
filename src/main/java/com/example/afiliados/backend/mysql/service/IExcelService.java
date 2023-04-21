package com.example.afiliados.backend.mysql.service;

import java.math.BigDecimal;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;

import com.example.afiliados.backend.mysql.entity.ExcelEntity;



public interface IExcelService {

	//Listar FindAll
			public List<ExcelEntity> findAll();
			
			//guardar Medicamentos
			public ExcelEntity save(ExcelEntity valorExcel);

			//Convertidor de String a Int
			public int convertStringToInt(String str);
			//Convertidor de String a Double
			public BigDecimal convertStringToDouble(String str);
			//Obtener los valores correspondientes para las celdas
			public String getCellValue(Row row, int cellNo);
}
