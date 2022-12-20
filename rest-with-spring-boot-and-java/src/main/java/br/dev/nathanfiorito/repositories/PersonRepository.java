package br.dev.nathanfiorito.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.nathanfiorito.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
