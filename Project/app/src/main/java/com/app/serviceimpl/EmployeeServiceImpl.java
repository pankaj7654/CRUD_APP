package com.app.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bean.EmployeeBean;
import com.app.repository.EmployeeRepository;
import com.app.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	EmployeeRepository repository;
	
	@Override
	public EmployeeBean save(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return repository.save(bean);
	}

	@Override
	public List<EmployeeBean> saveAll(List<EmployeeBean> bean) {
		// TODO Auto-generated method stub
		return repository.saveAll(bean);
	}

	@Override
	public EmployeeBean fetch(long id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}

	@Override
	public List<EmployeeBean> fetchAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public EmployeeBean update(EmployeeBean bean) {
		// TODO Auto-generated method stub
		return repository.save(bean);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
