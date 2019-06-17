package com.project.testdemo.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.testdemo.domain.ContactForm;

@Service
@Transactional
public class ContactFormService {

	@Autowired(required = true)
	private ContactFormRepository contactFormRepository;

	public ContactForm save(ContactForm contactForm) {
		return contactFormRepository.save(contactForm);
	}

	public Iterable<ContactForm> findAll() {
		Iterable<ContactForm> result = contactFormRepository.findAll();
		return result;
	}
}
