package ProblemNumberOne;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI {
	JFrame frame;
	JPanel panel;
	JLabel label, label2, label3,dispText;
	JTextField field1, field2, field3;
	JButton button;
	
	
	public UI() {
		
	//Frame creation
	frame = new JFrame("CALCULATOR");
	frame.setSize(400,400);
	
	//JLabel creation
	label = new JLabel();
	label.setText("Full name: ");
	label.setBounds(20, 20, 150, 50);
	label2 = new JLabel();
	label2.setText("Civil Status: ");
	label2.setBounds(20,10,150,150);
	label3 = new JLabel();
	label3.setText("GMI: ");
	label3.setBounds(20,50,150,150);
	dispText = new JLabel();
	dispText.setText("dsada");
	dispText.setBounds(130,220,100,25);
	
	
	//JTextField Creation
	field1 = new JTextField();
	field1.setBounds(90, 35, 120, 20);
	field1.setForeground(Color.red);
	field1.setFont(new Font("Serif", Font.BOLD, 10));
	
	field2 = new JTextField();
	field2.setBounds(90,75,120,20);
	field2.setForeground(Color.blue);
	field2.setFont(new Font("Times new Roman", Font.ITALIC, 10));

	field3 = new JTextField();
	field3.setBounds(90,115,120,20);
	field3.setForeground(Color.green);
	field3.setFont(new Font("Arial", Font.ITALIC, 10));
	
	//JButton creation
	button = new JButton("Submit");
	button.setBounds(100, 180, 100, 25);
	
	//Adding Components to JFrame
	frame.add(label);
	frame.add(label2);
	frame.add(label3);
	frame.add(dispText);
	frame.add(field1);
	frame.add(field2);
	frame.add(field3);
	frame.add(button);
	
	//Setting the position of components in the container
	frame.setLayout(null);
	frame.setVisible(true);
	frame.setResizable(false);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}
	
	
	public static void main(String[] args) {
		UI ui = new UI();
		
	}
}
		