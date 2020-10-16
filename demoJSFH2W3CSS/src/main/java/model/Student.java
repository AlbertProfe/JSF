package model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;

	@Column(nullable = false) @Lob
	private @NotNull String firstName;
	
	@Column(nullable = false) @Lob
	private @NotNull String lastName;
	
	@Column(nullable = false) @Lob
	private @NotNull String address;
	
	@Column(nullable = false) @Lob
	private @NotNull String city;
	
	@Column(nullable = false) @Lob
	private @NotNull String postcode;
	
	@Column(nullable = false) @Lob
	private @NotNull String country;
	
	@Column(nullable = false)
	private @NotNull int age;
	

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	

}
