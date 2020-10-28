package demoJSF4;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name="studentBean")
@SessionScoped
public class studentBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private int age;

	
	
	public String getfirstName() {
		return firstName;
	}



	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getlastName() {
		return lastName;
	}



	public void setlastName(String lastName) {
		this.lastName = lastName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	
	
}