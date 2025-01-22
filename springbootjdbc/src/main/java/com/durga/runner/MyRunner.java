package com.durga.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.durga.dao.impl.DaoImpl;
@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	DaoImpl daoImpl;
	@Override
	public void run(String... args) throws Exception {
       
	//	daoImpl.insertRecord();
		List list=daoImpl.selectRecords();
		list.forEach(map->System.out.println(map));
	}

}
