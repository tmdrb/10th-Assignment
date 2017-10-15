package Assignment10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Cal extends JFrame implements ActionListener {

	private JPanel p,p1;
	private JTextField f;
	private JButton[] buttons;
	private String[] labels = {
			"Backspace", "", "", "CE", "C",
			"7", "8", "9", "/", "sqrt",
			"4", "5", "6", "x", "%",
			"1", "2", "3", "-", "1/x",
			"0", "+/-", ".", "+", "=",

			
	};
	private double result;
	private String operator = "=";
	private boolean startOfNumber = true;
	public Cal() {
		f= new JTextField(35);
		p = new JPanel();
		f.setText("");
		f.setEnabled(false);
		
		p.setLayout(new GridLayout(0,5,3,3));
		buttons = new JButton[25];
		int index = 0;
		for (int rows = 0; rows < 5; rows++) {
			for (int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				if( cols >= 3 )
					buttons[index].setForeground(Color.red);
				else 
					buttons[index].setForeground(Color.blue);
				buttons[index].setBackground(Color.yellow);
				p.add(buttons[index]);
				index++;
			}
		}

		
		add(f,BorderLayout.NORTH);
		add(p,BorderLayout.CENTER);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.charAt(0) == 'C') {
			result = 0;
			operator = "=";
			f.setText("0");
		}else if(command.charAt(0) >= '0' && command.charAt(0) <='9') {
			if(startOfNumber == true)
				f.setText(command);
			else
				f.setText(f.getText() + command);
			startOfNumber = false;
		}
		else {
			if(startOfNumber) {
				if(command.equals("-")) {
					f.setText(command);
					startOfNumber = false;
				}
				else
					operator = command;
			}else {
				double x = Double.parseDouble(f.getText());
				calculate(x);
				operator = command;
				startOfNumber = true;
			}
		}
		
	}
	private void calculate(double n) {
		if(operator.equals("+"))
			result +=n;
	else if(operator.equals("-"))
		result -=n;
	else if(operator.equals("*"))
		result *=n;
	else if(operator.equals("/"))
		result /=n;	
	else if(operator.equals("="))
		result = n;
		f.setText("" + result);
	}
	public static void main(String[] args) {
	
	Cal c = new Cal();
	}

}
