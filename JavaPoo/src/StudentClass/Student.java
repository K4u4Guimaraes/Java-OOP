package StudentClass;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int age;
	private String birthday;
	private String rg;
	private String cpf;
	private String mother_name;
	private String father_name;
	private String school;
	private int id_student;
	
	private List  <Subject> obj_subjects = new ArrayList<Subject>();
	
	public void setSubjects(List<Subject> sub) {
		this.obj_subjects = sub;
	}
	
	public List<Subject> getSubjects(){
		return this.obj_subjects;
	}

	
	//java constructor
	public Student(String pattern_name, int pattern_age /*String pattern_grade1,String pattern_subject*/) {
		this.setName(pattern_name);
		this.setAge(pattern_age); 
		//this.getSubject().setGrade1(pattern_grade1);
		//this.getSubject().setSubject1(pattern_subject);
	}
	
	public  String getName(){
		return this. name;
	}
	public void setName(String name) {
		this.name =name;
	}
		
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getBirthday() {
		return this.birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String getRG() {
		return this.rg;
	}
	public void setRG(String rg) {
		this.rg = rg;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getMother_name() {
		return this.mother_name;
	}
	public void setMother_name(String mother) {
		this.mother_name = mother;
	}
	
	public String getFather_name() {
		return this.father_name;
	}
	public void setFather_name(String father) {
		this.father_name = father;
	}
	
	public String getSchool() {
		return this.school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	public int getId_student() {
		return this.id_student;
	}
	public void setId_student(int id) {
		this.id_student = id;
	}
	

	public double getFinal_media() {
		
		double grades = 0.0;
		for(Subject array_obj: obj_subjects) {
			grades += array_obj.getGrade1();
		}
		
		return grades/obj_subjects.size();
	}
	
	public String getAprovved(){
		double media = this.getFinal_media();
		
		if(media >= 5) {
			if(media >= 7) {
				return "approved";
			}else {
				return "come to school";
			}
		}else {
			return "reproved";
		}
	}

	@Override
	//toString is used when you want to show the object, without this  method, if you use print in object, 
	//it will show where the object is allocated in the memory 
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", birthday=" + birthday + ", rg=" + rg + ", cpf=" + cpf
				+ ", mother_name=" + mother_name + ", father_name=" + father_name + ", school=" + school
				+ ", id_student=" + id_student +   "]";
	}


	
	
	@Override
	
	// But it can change when you declare the classes equals and Hashcode.
	// the conditional operator will return true as a result, 
	//because you´re declaring that the attributes being compared are their names (and they´re the same),
	// instead of their memory allocations.
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
}



