package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.DataDao;
import com.domain.Employee;

public class DataServiceImpl implements DataService {
	
	@Autowired
	DataDao dataDao;


	public int insertRow(Employee employee) {
		return dataDao.insertRow(employee);
	}

	public List<Employee> getList() {
		return dataDao.getList();
	}


	public Employee getRowById(int id) {
		return dataDao.getRowById(id);
	}


	public int updateRow(Employee employee) {
		return dataDao.updateRow(employee);
	}


	public int deleteRow(int id) {
		return dataDao.deleteRow(id);
	}

}
