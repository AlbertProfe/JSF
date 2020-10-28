package service;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Customer;

import java.time.LocalDate;
import java.util.UUID;

@Startup
@Singleton
public class InitialCustomerFiller {

    @PersistenceContext
    private EntityManager entityManager;

    @PostConstruct
    public void init() {

        //System.out.println("Storing three initial customers");

    	
    	
    	this.entityManager.persist(createCustomer("Carla", "Swan", "carla@gmail.com", LocalDate.of(1980, 1, 12)));
        this.entityManager.persist(createCustomer("Jessica", "Brown", "jessica@gmail.com", LocalDate.of(1995, 3,
                20)));
        this.entityManager.persist(createCustomer("Philip", "Riecks", "philip@gmail.com", LocalDate.of(1999, 12,
                13)));
        this.entityManager.persist(createCustomer("John", "Doe", "johm@gmail.comn", LocalDate.of(1990, 12, 12)));
        this.entityManager.persist(createCustomer("Max", "Mustermann", "max@gmail.com", LocalDate.of(1985, 4,
                20)));
        this.entityManager.persist(createCustomer("Noe", "Bluemberg", "noe@gmail.com", LocalDate.of(1995, 9,
                13)));

    }

    private Customer createCustomer(String firstName, String lastName, String email, LocalDate dayOfBirth) {
        Customer result = new Customer();
        result.setFirstName(firstName);
        result.setLastName(lastName);
        result.setEmail(email);
        result.setDayOfBirth(dayOfBirth);
        result.setCustomerId(UUID.randomUUID().toString().substring(0, 8));
        return result;
    }
}