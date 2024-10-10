package pkg;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {
	public int addition(int a, int b) {
		if (a < 0 || b < 0) {
			throw new IllegalArgumentException("Inputs must be non-negative.");
		}
		return a + b;
	}

	public int multiplication(int a, int b) {
		{
			if (a < 0 || b < 0) {
				throw new IllegalArgumentException("Inputs must be non-negative.");
			}
			return a * b;
		}
	}

	private JFrame frame;
	private JTextField num1Field, num2Field, resultField;
	private JButton addButton, multiplyButton;

	public Calculator() {
		 JLabel num1Label = new JLabel("Number 1:");
	        JLabel num2Label = new JLabel("Number 2:");
	        JLabel resultLabel = new JLabel("Result:");
	        num1Field = new JTextField();
	        num2Field = new JTextField();
	        resultField = new JTextField();
	        resultField.setEditable(false);

	        addButton = new JButton("Add");
	        multiplyButton = new JButton("Multiply");

	        frame.add(num1Label);
	        frame.add(num1Field);
	        frame.add(num2Label);
	        frame.add(num2Field);
	        frame.add(resultLabel);
	        frame.add(resultField);
	        frame.add(addButton);
	        frame.add(multiplyButton);

	        addButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                if(e.getSource()==addButton) {
	                addButton.setBackground(Color.GREEN);
	            } 
	        });

	        multiplyButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	 if(e.getSource()==addButton) {
	 	                multiplyButton.setBackground(Color.blue);
	 	            } 
	            }
	        });

	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        }
}

	public static void main(String[] args) {
		Calculator obj = new Calculator();

		System.out.println("System");
		System.out.println(obj.addition(1, 2));
		System.out.println(obj.multiplication(1, 2));
	}

}
