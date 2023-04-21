package com.example.afiliados.backend.mysql.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.afiliados.backend.mysql.dao.ExcelDAO;
import com.example.afiliados.backend.mysql.entity.ExcelEntity;
import com.example.afiliados.backend.mysql.service.IExcelService;




@Service //los servicios representan la logica de negocio
public class ExcelServiceImpl implements IExcelService {
	//Inyectamos dependencias con autowired
	@Autowired
	private ExcelDAO valoresExcelDAO;
	
	@Override
	@Transactional(readOnly = true)//es opcional
	public List<ExcelEntity> findAll(){
		// TODO Auto-generated method stub
		return (List<ExcelEntity>) valoresExcelDAO.findAll();//hacemos un casteo
	}
	
	/*@Override
	@Transactional(readOnly = true)//es opcional
	public Page<ExcelEntity> findAllByOrderByIdAsc(Pageable pageable) {
		// TODO Auto-generated method stub
		return valoresExcelDAO.findAlllByOrderByIdAsc(pageable);
	}
	*/
	@Override
	@Transactional
	public ExcelEntity save(ExcelEntity valorExcel) {
		// TODO Auto-generated method stub
		//retorna la entidad guardada
		return valoresExcelDAO.save(valorExcel);
	}
	/*@Override 
	@Transactional
	public void delete(Long id) {
		medicamentoDAO.deleteById(id);
		
	}*/
	/*@Override
	@Transactional(readOnly = true)
	public ExcelEntity findById(Long id) {
		// TODO Auto-generated method stub
		return medicamentoDAO.findById(id).orElse(null);
	}
	*/

	@Override
	public int convertStringToInt(String str) {
		int result = 0;
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            return result;
        }
        result = Integer.parseInt(str);
        return result;
	}

	@Override
	public BigDecimal convertStringToDouble(String str) {
		Double obj = new Double(str.replace(",", "."));
        BigDecimal num = BigDecimal.valueOf(obj);
        
       //if (str == null || str.isEmpty() || str.trim().isEmpty()) {
       //     return result;
        //}
        //result = Double.parseDouble(str);
        
        return num;
    }

	@Override
	public String getCellValue(Row row, int cellNo) {
		 DataFormatter formatter = new DataFormatter();
	     Cell cell = row.getCell(cellNo);
	     return formatter.formatCellValue(cell);
	}
	

}
