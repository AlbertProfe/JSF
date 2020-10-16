package view;

import javax.enterprise.context.RequestScoped;

import javax.inject.Inject;
import javax.inject.Named;

import model.Student;
import service.StudentService;

import java.util.List;

import javax.annotation.PostConstruct;

@Named
@RequestScoped
public class StudentBean {
	
	private Student student = new Student();
    private List<Student> students;


    @Inject
    private StudentService studentService;

    @PostConstruct
    public void init() {
    	students = studentService.list();
    }
    
    public void submit() {
    	studentService.create(student);
    	students.add(student);
        student = new Student();
    }
    
    public Student getStudent() {
        return student;
    }
    
    public List<Student> getStudents() {
        return students;
    }
    
    public String deleteStudent (Long id) {
    	         
    	boolean deletedStudent = studentService.deletebyId(id);
    	
    	if (deletedStudent) {
    	return "/students.xhtml?faces-redirect=true";
    		}
    	else return "/error.xhtml?faces-redirect=true";
    }
    
    public String updateStudent (Long id) {
    	
    	
    	
		return "/error.xhtml?faces-redirect=true";
    	
    	
    }

}
