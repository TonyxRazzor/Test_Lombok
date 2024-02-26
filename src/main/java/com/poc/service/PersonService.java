package com.poc.service;

import java.util.List;
import com.poc.entity.Person;

public interface PersonService {
    void save(Person person);
    List<Person> getPersonList();
}
