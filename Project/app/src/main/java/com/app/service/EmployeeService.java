package com.app.service;

import java.util.List;

import com.app.bean.EmployeeBean;

public interface EmployeeService {
	
	public EmployeeBean save(EmployeeBean bean);
	
	public List<EmployeeBean> saveAll(List<EmployeeBean> bean);
	
	public EmployeeBean fetch(long id);
	
	public List<EmployeeBean> fetchAll();
	
	public EmployeeBean update(EmployeeBean bean);
	
	public void delete(long id);

}
