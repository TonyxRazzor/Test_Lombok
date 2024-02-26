package com.poc;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.poc.entity.Person;
import com.poc.service.PersonService;

@SpringBootApplication
public class SpringBootJpaEntityPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaEntityPocApplication.class, args);
    }
    @Bean
    public CommandLineRunner demo(PersonService personService) {
        return (args) -> {
            // save few person
            Person person1 = new Person();
            person1.setFName("Peter");
            person1.setLName("Parker");

            Person person2 = new Person();
            person2.setFName("Robert");
            person2.setLName("Smith");

            personService.save(person1);
            personService.save(person2);

            // fetch all person
            System.out.println("-----List of Persons------");
            for (Person person : personService.getPersonList()) {
                System.out.println("Person Detail:" + person);
            }
        };
    }
}