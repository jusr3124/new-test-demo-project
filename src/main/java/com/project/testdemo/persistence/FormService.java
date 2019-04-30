package com.project.testdemo.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FormService {

	@Autowired(required = true)
	private FormRepository formRepository;

}
