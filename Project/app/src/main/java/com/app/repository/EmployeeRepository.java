package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.bean.EmployeeBean;

public interface EmployeeRepository extends JpaRepository<EmployeeBean, Long>{

}
