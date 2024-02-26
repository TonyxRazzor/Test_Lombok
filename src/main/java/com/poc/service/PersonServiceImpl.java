package com.poc.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.poc.entity.Person;
import com.poc.repo.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepo;

    @Override
    public void save(Person person) {
        personRepo.save(person);
    }
    @Override
    public List<Person> getPersonList() {
        return personRepo.findAll();
    }
}