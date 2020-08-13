package br.com.apirest.apirest.repositories;

import br.com.apirest.apirest.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
