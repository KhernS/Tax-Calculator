package ProblemNumberOne;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class Execution extends Interface {
	float annualIncomeTax = 0;
	float netAnnualIncome = 0;

	public Execution() {
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
					computation();
				}

			}
		});

	}

	public void computation() {
		// Converting Strings into Integer
		int num = Integer.parseInt(textField3.getText());
		int annualIncome = num * 13; // Getting the 13th month pay
		String s1 = String.valueOf(annualIncome);
		label4.setText(s1);

		// Computing the Tax
		if (annualIncome > 250000 && annualIncome <= 400000) {
			annualIncomeTax = (float) (30000 + (annualIncomeTax - 400000) * .20);
			netAnnualIncome = annualIncome - annualIncomeTax;
			String s2 = String.valueOf(annualIncomeTax); // Converting Integer into Strings
			String s7 = String.valueOf(netAnnualIncome); // Converting Integer into Strings
			label5.setText(s2);
			label6.setText(s7);

		} else if (annualIncome > 400000 && annualIncome <= 800000) {
			annualIncomeTax = (float) (30000 + (annualIncome - 400000) * .25);
			netAnnualIncome = annualIncome - annualIncomeTax;
			String s3 = String.valueOf(annualIncomeTax);
			String s8 = String.valueOf(netAnnualIncome);
			label5.setText(s3);
			label6.setText(s8);

		} else if (annualIncome > 800000 && annualIncome <= 2000000) {
			annualIncomeTax = (float) (130000 + (annualIncome - 800000) * .30);
			netAnnualIncome = annualIncome - annualIncomeTax;
			String s4 = String.valueOf(annualIncomeTax);
			String s9 = String.valueOf(netAnnualIncome);
			label5.setText(s4);
			label6.setText(s9);

		} else if (annualIncome > 2000000 && annualIncome <= 8000000) {
			annualIncomeTax = (float) (490000 + (annualIncome - 2000000) * .32);
			netAnnualIncome = annualIncome - annualIncomeTax;
			String s5 = String.valueOf(annualIncomeTax);
			String s10 = String.valueOf(netAnnualIncome);
			label5.setText(s5);
			label6.setText(s10);

		} else if (annualIncome > 8000000) {
			annualIncomeTax = (float) (2400000 + (annualIncome - 8000000) * .35);
			netAnnualIncome = annualIncome - annualIncomeTax;
			String s6 = String.valueOf(annualIncomeTax);
			String s11 = String.valueOf(netAnnualIncome);
			label5.setText(s6);
			label6.setText(s11);
		}
	}
}
