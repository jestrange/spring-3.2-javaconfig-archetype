package ${groupId}.${artifactId}.repository;

import ${groupId}.${artifactId}.model.Person;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface PersonRepository extends Repository<Person, Long> {

	List<Person> findAll();
}