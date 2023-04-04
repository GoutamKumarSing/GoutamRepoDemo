package day12_12;

import javax.swing.JOptionPane;

public class Program1 {
     public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("Enter Your Name");
		JOptionPane.showMessageDialog(null,"Hello "+ name);
		int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null,"Your age is "+age);
		double hight=Double.parseDouble(JOptionPane.showInputDialog("Enter Your hight"));
		JOptionPane.showMessageDialog(null,"Your hight is "+hight);
	}
}
