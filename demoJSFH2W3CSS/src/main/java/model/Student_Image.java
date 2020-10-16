package model;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: StudentImage
 *
 */
@Entity
public class Student_Image implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Student_Image() {
		super();
	}
	
	@Id
	private Long studentId;

	@Column(nullable = false) @Lob
	private @NotNull Blob image;

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}
	
	
   
}
