package ${groupId}.${artifactId}.service;

import ${groupId}.${artifactId}.model.Person;
import ${groupId}.${artifactId}.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	@Override
	@Transactional
	public List<Person> findAll() {
		return personRepository.findAll();
	}
}