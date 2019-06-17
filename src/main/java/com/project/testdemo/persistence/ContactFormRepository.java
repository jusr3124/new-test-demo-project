package com.project.testdemo.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.project.testdemo.domain.ContactForm;

@Component
public interface ContactFormRepository extends CrudRepository<ContactForm, Long>{
  
}
