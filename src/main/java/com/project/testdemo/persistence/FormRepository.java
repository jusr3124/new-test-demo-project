package com.project.testdemo.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.project.testdemo.domain.Form;

@Component
public interface FormRepository extends CrudRepository<Form, Long>{

}
