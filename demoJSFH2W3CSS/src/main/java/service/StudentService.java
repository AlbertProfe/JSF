package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Student;

@Stateless
public class StudentService {

	@PersistenceContext
	private EntityManager entityManager;

	public void create(Student student) {
		entityManager.persist(student);
	}

	public List<Student> list() {
		return entityManager.createQuery("FROM Student s", Student.class).getResultList();
	}
	
	public boolean deletebyId(Long id) {
		
		Student student = entityManager.find(Student.class, id);
		
		if (student != null) {
			
			entityManager.remove(student);
			return true;
        }
		return false;
	
	}

}
