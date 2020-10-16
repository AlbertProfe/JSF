package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.Message;

@Stateless
public class MessageService {
	 @PersistenceContext
	    private EntityManager entityManager;

	    public void create(Message message) {
	        entityManager.persist(message);
	    }

	    public List<Message> list() {
	        return entityManager
	            .createQuery("FROM Message m", Message.class)
	            .getResultList();
	    }	

}
