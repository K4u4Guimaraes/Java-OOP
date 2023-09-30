package ExecutableJavaPoo;

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
		
		
		String quest_name = JOptionPane.showInputDialog("Enter the Student´s name:");
		String quest_age = JOptionPane.showInputDialog("Enter the Student´s age:");
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
		 
		 aluno.setBirthday("15/08/1995");
		 
		 Subject test = new Subject();
		 System.out.println(test);
		 
		  System.out.println("the Student´s name is "+ aluno.getName());
		System.out.println("The Student was born  "+aluno.getBirthday());
		
		 int confirm =JOptionPane.showConfirmDialog(null, "Do you want to see the final media? ");
		 if(confirm == 0) {
			 System.out.println("The student," + aluno.getName()+", final media is "+aluno.getFinal_media());
			System.out.println(aluno.getAprovved());
		 }
		 
		 
	}

}
