package ExecutableJavaPoo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import StudentClass.Student;
import StudentClass.Subject;

public class Executable_java_Poo {

	public static void main(String[] args) {
			
		
		 //testing toString method
		 Student aluno2= new Student("Yami Yugi",17);
		System.out.println(aluno2);
		
		
		//Equals and Hashcode are used to differentiate objects
		Student aluno3 = new Student("Jotaro Kujo",17);//,"Biology");
		Student aluno4 = new Student("Jotaro Kujo",17);//, "Biology");
		//this conditional operator shows us that the expression bellow is false,
		//because java differentiates objects by their memory allocations.
		//!!WARNING!! LOOK AT THE 138 LINE FROM THE PACKAGE "STUDENT.JAVA"
		if(aluno3.equals(aluno4)) {
			System.out.println("they´re the same");
		}else {
			System.out.println("they´re not the same");
		}
		
		String list_quest = JOptionPane.showInputDialog("How mane studemts would you like to add?");
		int result_count = Integer.parseInt(list_quest);
		List<Student> students = new ArrayList<Student>(); 
		
		for (int counter = 1; counter <= result_count; counter++ ) {
		
		String quest_name = JOptionPane.showInputDialog("Enter the Student´s name " +counter + ":");
		String quest_age = JOptionPane.showInputDialog("Enter the Student´s age " +counter+ ":");
		int real_age = Integer.parseInt(quest_age); 
		
		Student aluno = new Student(quest_name,real_age);
		
		String add_sub = JOptionPane.showInputDialog("How many subjects and grades would you like to add?");
		int res_sub = Integer.parseInt(add_sub);
		if(res_sub > 1) {
			 
			 for(int count = 1; count <= res_sub; count++) {
				 		String quest_subject = JOptionPane.showInputDialog("Enter the Student´s subject "+count);
				 		 String quest_grade1 = JOptionPane.showInputDialog("Enter the Student´s grade: "+count);
						
						 int result_grade = Integer.parseInt(quest_grade1);
							 Subject subjects = new Subject();
							 subjects.setSubject1(quest_subject);
							 subjects.setGrade1(result_grade);
							  aluno.getSubjects().add(subjects);
							  
							  
			 }
			
		}
		 
	
			 
		int del =  JOptionPane.showConfirmDialog(null,"deseja remover alguma disciplina?");
		if(del == 0 ) {
			int keep_remove = 0;
			int pos = 1;
			
			while(keep_remove == 0) {
			String subject_delete = JOptionPane.showInputDialog("Enter the subject´s position that you want to delete ");
			aluno.getSubjects().remove(Integer.valueOf(subject_delete).intValue() - pos);
			pos++;
			keep_remove = JOptionPane.showConfirmDialog(null,"do you wanto to continue removing?");
			
				}
		}
		 
		  students.add(aluno);
		  
		}
			
		int confirm =JOptionPane.showConfirmDialog(null, "Do you want to see the final media? ");
		 if(confirm == 0) {
		//java foreach be like:
		for (Student student : students) {
			 System.out.println("The student," + student.getName()+", final media is "+student.getFinal_media());
			System.out.println(student.getAprovved());
			System.out.println("---------------------------------------------------------------------------------");
			}
		 }else {
			 System.out.println("thanks for using our system ;)");
		 }
		 
		 
	}

}
