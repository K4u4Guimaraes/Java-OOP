package ExecutableJavaPoo;

import javax.swing.JOptionPane;

import StudentClass.Student;

public class Executable_java_Poo {

	public static void main(String[] args) {
			
		
		 //testing toString method
		 Student aluno2= new Student("Yami Yugi",17,"7","card game");
		System.out.println(aluno2);
		
		
		//Equals and Hashcode are used to differentiate objects
		Student aluno3 = new Student("Jotaro Kujo",17,"9","Biology");
		Student aluno4 = new Student("Jotaro Kujo",17,"9", "Biology");
		//this conditional operator shows us that the expression bellow is false,
		//because java differentiates objects by their memory allocations.
		//!!WARNING!! LOOK AT THE 111 LINE FROM THE PACKAGE "STUDENT.JAVA"
		if(aluno3.equals(aluno4)) {
			System.out.println("they´re the same");
		}else {
			System.out.println("they´re not the same");
		}
		
		
		String quest_name = JOptionPane.showInputDialog("Enter the Student´s name:");
		String quest_age = JOptionPane.showInputDialog("Enter the Student´s age:");
		int real_age = Integer.parseInt(quest_age);
		 String quest_grade1 = JOptionPane.showInputDialog("Enter the Student´s first grade: ");
		 String quest_subject = JOptionPane.showInputDialog("Enter the Student´s subject");
		
		 Student aluno = new Student(quest_name,real_age,quest_grade1,quest_subject); 
		 aluno.setBirthday("15/08/1995");
		 String quest_grade2 = JOptionPane.showInputDialog("Enter the Student´s second grade: ");
		 aluno.getSubject().setGrade2(Double.parseDouble(quest_grade2));
		 String quest_grade3 = JOptionPane.showInputDialog("Enter the Student´s third grade: ");
		 aluno.getSubject().setGrade3(Double.parseDouble(quest_grade3));
		 String quest_grade4 = JOptionPane.showInputDialog("Enter the Student´s fourth grade: ");
		 aluno.getSubject().setGrade4(Double.parseDouble(quest_grade4));
		 
		  System.out.println("the Student´s name is "+ aluno.getName());
		System.out.println("The Student was born  "+aluno.getBirthday());
		
		 int confirm =JOptionPane.showConfirmDialog(null, "Do you want to see the final media? ");
		 if(confirm == 0) {
			 System.out.println("The student," + aluno.getName()+", final media is "+aluno.getFinal_media());
			 if(aluno.getAprovved() == true) {
				 System.out.println("Approved!");
			 }else {
				 System.out.println("rejected");
			 }
		 }else {
			 System.out.println("thanks for using our system");
		 }
		 
		
		
		

	}

}
