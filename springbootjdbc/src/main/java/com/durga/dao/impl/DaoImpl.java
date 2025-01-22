package com.durga.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
 import org.springframework.stereotype.Repository;

import com.durga.dao.ITestDao;
@Repository
public class DaoImpl implements ITestDao {
@Autowired
JdbcTemplate jdbcTemplate;
	@Override
	public void insertRecord() {
		// add multiple records
		jdbcTemplate.update("insert into emp values(100,'xyz','xyz',7902,'2023-09-09',22222,222,30)");
		
       
	}

	@Override
	public List selectRecords() {
		
 		return jdbcTemplate.queryForList("select * from emp");
	}

}
