package br.dev.nathanfiorito.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.nathanfiorito.exceptions.ResourceNotFoundException;
import br.dev.nathanfiorito.model.Person;
import br.dev.nathanfiorito.repositories.PersonRepository;

@Service
public class PersonService {
	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
	@Autowired
	private PersonRepository repository;
	
	public List<Person> findAll()
	{
		logger.info("Finding all persons");
	
		return repository.findAll();
	}
	
	public Person findById(Long id)
	{
		logger.info("Finding persons by id");
		
		return repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found to this ID."));
	}
	
	public Person create(Person person)
	{
		logger.info("Creating a new person");	
		
		return repository.save(person);
	}
	
	public Person update(Person person)
	{
		logger.info("Updating a person");
		
		Person entity = repository.findById(person.getId())
				.orElseThrow(() -> new ResourceNotFoundException("No records found to this ID."));
		
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
		
		return repository.save(entity);
	}
	
	public void delete(Long id)
	{
		logger.info("Deleting a person");
		
		Person entity = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found to this ID."));
		
		repository.delete(entity);
	}	
}
