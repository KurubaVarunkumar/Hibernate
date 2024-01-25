package ManyToMany.com.ManyToMany;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String courseName;

    @ManyToMany
    private List<Student> students = new ArrayList<>();

    // Constructors, getters, and setters...
    
    public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(long id, String courseName, List<Student> students) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.students = students;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
    
}
