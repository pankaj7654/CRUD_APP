package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.bean.EmployeeBean;
import com.app.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	
	@PostMapping("_save")
	public ResponseEntity<?> save(@RequestBody EmployeeBean bean)
	{
	EmployeeBean responce = service.save(bean);	
		return ResponseEntity.ok(responce);
	}
	
	@PostMapping("_saveAll")
	public ResponseEntity<?> saveAll(@RequestBody List<EmployeeBean> bean)
	{
	List<EmployeeBean> responce = service.saveAll(bean);	
		return ResponseEntity.ok(responce);
	}
	
	@GetMapping("_fetch")
	public ResponseEntity<?> fetch(@RequestParam long id)
	{
	EmployeeBean responce = service.fetch(id);
		return ResponseEntity.ok(responce);
	}
	
	
	@GetMapping("_fetchAll")
	public ResponseEntity<?> fetchAll()
	{
	List<EmployeeBean> responce = service.fetchAll();
		return ResponseEntity.ok(responce);
	}
	
	
	@PostMapping("_update")
	public ResponseEntity<?> update(@RequestBody EmployeeBean bean)
	{
	EmployeeBean responce = service.update(bean);
		return ResponseEntity.ok(responce);
	}
	
	
	@PostMapping("_delete")
	public ResponseEntity<?> delete(@RequestParam long id)
	{
	service.delete(id);
		return ResponseEntity.ok("done");
	}

}
