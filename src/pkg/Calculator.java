package pkg;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {
    public int addition(int a, int b) {
        if (a < 0 || b < 0) {

            throw new IllegalArgumentException("Lines must not be negative");
        }
        return a + b;
    }

    public int multiplication(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Inputs must be non-negative.");
        }
        return a * b;
    }

    private JFrame frame;
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, multiplyButton;

    public Calculator() {
        // Set up the frame and layout
        frame = new JFrame("Calculator");
        frame.setLayout(new GridLayout(4, 2, 10, 10));  // Using GridLayout for better organization

        JLabel num1Label = new JLabel("Number 1:");
        JLabel num2Label = new JLabel("Number 2:");
        JLabel resultLabel = new JLabel("Result:");
        num1Field = new JTextField();
        num2Field = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        addButton = new JButton("Add");
        multiplyButton = new JButton("Multiply");

        // Add components to the frame
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
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int result = addition(num1, num2);
                    resultField.setText(String.valueOf(result));
                    addButton.setBackground(Color.GREEN); 
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int result = multiplication(num1, num2);
                    resultField.setText(String.valueOf(result));
                    multiplyButton.setBackground(Color.BLUE); 
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });

        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
    }
}
