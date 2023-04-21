package com.example.afiliados.backend.mysql.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.afiliados.backend.mysql.entity.ExcelEntity;




public interface ExcelDAO extends CrudRepository<ExcelEntity, Integer>
{
	@Override
	List<ExcelEntity> findAll();
}