package com.poc.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.poc.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}