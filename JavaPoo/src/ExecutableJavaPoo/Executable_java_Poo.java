package ExecutableJavaPoo;

import javax.swing.JOptionPane;

import StudentClass.Student;

public class Executable_java_Poo {

	public static void main(String[] args) {
		
		String quest_name = JOptionPane.showInputDialog("Digite seu nome");
		
		String quest_age = JOptionPane.showInputDialog("Digite sua idade");
		int real_age = Integer.parseInt(quest_age);
		
		 Student aluno = new Student(quest_name,real_age);
		 aluno.setBirthday("15/08/1995");
		
		 
		 
		 
		 System.out.println("the Student´s name is "+ aluno.getName());
		System.out.println("The Student was born  "+aluno.getBirthday());

	}

}
