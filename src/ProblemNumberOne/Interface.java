package ProblemNumberOne;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface {

	JFrame frame;
	JTextField textField1, textField2, textField3;

	JLabel fullName, civStatus, gmIncome, fullName2, civStatus2, gmIncome2, label1, label2, label3, label4, label5,
			label6, information, gmIncome3, aiTax, netIncome;
	JButton button;
	JDialog dialog;

	/**
	 * 
	 */
	Interface() {

		// JLabel Creation
		fullName = new JLabel("Full Name: ");
		fullName.setBounds(10, 17, 64, 23);
		civStatus = new JLabel("Civil Status: ");
		civStatus.setBounds(10, 45, 71, 14);
		gmIncome = new JLabel("Gross Monthly ");
		gmIncome.setBounds(10, 70, 90, 17);
		fullName2 = new JLabel("Full Name:");
		fullName2.setBounds(35, 50, 64, 14);
		civStatus2 = new JLabel("Civil Status:");
		civStatus2.setBounds(35, 80, 77, 14);
		gmIncome2 = new JLabel("Gross Monthly Income:");
		gmIncome2.setBounds(267, 50, 148, 14);
		label1 = new JLabel();
		label1.setBounds(124, 47, 111, 19);
		label2 = new JLabel();
		label2.setBounds(124, 77, 113, 20);
		label3 = new JLabel();
		label3.setBounds(401, 47, 86, 20);
		information = new JLabel("Here are the details of your income and tax rate: ");
		information.setBounds(150, 200, 300, 20);
		gmIncome3 = new JLabel("Gross Annual Income");
		gmIncome3.setBounds(20, 250, 250, 20);
		label4 = new JLabel();
		label4.setBounds(150, 250, 250, 20);
		aiTax = new JLabel("Annual Income Tax");
		aiTax.setBounds(20, 300, 250, 20);
		label5 = new JLabel();
		label5.setBounds(150, 300, 500, 20);
		netIncome = new JLabel("Net Annual Income");
		netIncome.setBounds(300, 250, 250, 20);
		label6 = new JLabel();
		label6.setBounds(430, 250, 500, 20);

		// JTextField Creation
		textField1 = new JTextField();
		textField1.setBounds(91, 14, 121, 20);
		textField2 = new JTextField();
		textField2.setBounds(91, 42, 121, 20);
		textField3 = new JTextField();
		textField3.setBounds(91, 68, 121, 20);

		// JButton Creation
		button = new JButton("Submit");
		button.setBounds(112, 122, 89, 23);

		// JFrame Creation
		frame = new JFrame("CALCULATOR");
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		frame.add(fullName);
		frame.add(civStatus);
		frame.add(gmIncome);
		frame.add(textField1);
		frame.add(textField2);
		frame.add(textField3);
		frame.add(button);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Submit")) {
					dialog = new JDialog(frame, "BIR TAX CALCULATOR");
					dialog.setSize(600, 600);
					dialog.setVisible(true);
					dialog.setLocationRelativeTo(frame);
					dialog.setLayout(null);
					dialog.add(label1);
					dialog.add(label2);
					dialog.add(label3);
					dialog.add(label4);
					dialog.add(label5);
					dialog.add(label6);
					dialog.add(fullName2);
					dialog.add(civStatus2);
					dialog.add(gmIncome2);
					dialog.add(information);
					dialog.add(gmIncome3);
					dialog.add(aiTax);
					dialog.add(netIncome);

					label1.setText(textField1.getText());
					label2.setText(textField2.getText());
					label3.setText(textField3.getText());
				}

			}
		});

	}

}
