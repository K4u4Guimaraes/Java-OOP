package ExecutableJavaPoo;

import javax.swing.JOptionPane;

import StudentClass.Student;

public class Executable_java_Poo {

	public static void main(String[] args) {
		
		String quest_name = JOptionPane.showInputDialog("Digite seu nome");
		
		String quest_age = JOptionPane.showInputDialog("Digite sua idade");
		int real_age = Integer.parseInt(quest_age);
		
		 Student aluno = new Student(quest_name,real_age);
		 
		 
		 System.out.println(aluno);

	}

}
