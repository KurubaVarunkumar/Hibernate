package CreateStudent.UpdateStudent;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int s_id;
	
	@Column(name="S_Name")
	String s_name;
	
	@Column(name="s_course")
	String s_course;
	
	
	

	public Student(int s_id, String s_name, String s_course) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_course = s_course;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_course() {
		return s_course;
	}

	public void setS_course(String s_course) {
		this.s_course = s_course;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return s_name+" "+s_course;
	}
	
}

