package StudentClass;

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
	private double grade1;
	private double grade2;
	private double grade3;
	private double grade4;
	
	//java constructor
	public Student(String pattern_name, int pattern_age) {
		name = pattern_name;
		age = pattern_age; 
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
	
	public double getGrade1() {
		return this.grade1;
	}
	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}
	
	public double getGrade2() {
		return this.grade2;
	}
	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}
	
	public double getGrade3() {
		return this.grade3;
	}
	public void setGrade3(double grade3) {
		this.grade3 = grade3;
	}
	
	public double getGrade4() {
		return this.grade4;
	}
	public void setGrade4(double grade4) {
		this.grade4 = grade4;
	}
	
	public double getFinal_media() {
		return (grade1 + grade2 + grade3 + grade4)/4;
	}
	
}



