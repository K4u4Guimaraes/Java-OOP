package ExecutableJavaPoo;

import javax.swing.JOptionPane;

import StudentClass.Student;

public class Executable_java_Poo {

	public static void main(String[] args) {
		
		String quest_name = JOptionPane.showInputDialog("Enter the Student큦 name:");
		String quest_age = JOptionPane.showInputDialog("Enter the Student큦 age:");
		int real_age = Integer.parseInt(quest_age);
		
		 Student aluno = new Student(quest_name,real_age); 
		 aluno.setBirthday("15/08/1995");
		 String quest_grade1 = JOptionPane.showInputDialog("Enter the Student큦 first grade: ");
		 aluno.setGrade1( Double.parseDouble(quest_grade1));
		 String quest_grade2 = JOptionPane.showInputDialog("Enter the Student큦 second grade: ");
		 aluno.setGrade2(Double.parseDouble(quest_grade2));
		 String quest_grade3 = JOptionPane.showInputDialog("Enter the Student큦 third grade: ");
		 aluno.setGrade3(Double.parseDouble(quest_grade3));
		 String quest_grade4 = JOptionPane.showInputDialog("Enter the Student큦 fourth grade: ");
		 aluno.setGrade4(Double.parseDouble(quest_grade4));
		 
		  System.out.println("the Student큦 name is "+ aluno.getName());
		System.out.println("The Student was born  "+aluno.getBirthday());
		
		 int confirm =JOptionPane.showConfirmDialog(null, "Do you want to see the final media? ");
		 if(confirm == 0) {
			 System.out.println("The student," + aluno.getName()+", final media is "+aluno.getFinal_media());
		 }else {
			 System.out.println("thaks for using our system");
		 }
		 
		 
		

	}

}
