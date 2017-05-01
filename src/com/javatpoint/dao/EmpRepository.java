package com.javatpoint.dao;

import org.springframework.data.repository.CrudRepository;

import com.javatpoint.beans.Emp;

public interface EmpRepository extends CrudRepository<Emp, Integer> {
    
}
