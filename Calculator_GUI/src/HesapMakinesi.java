import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;
import java.awt.GridLayout;

public class HesapMakinesi extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private double answer,number;
	int operation;
	
	public void calculate() {
		switch(operation) {
		case 1 :
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
			
		case 2 :
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
			
		case 3 :
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
			
		case 4 :
			answer = number % Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;	
		}
	}

	public void AddInput(String str) {
		input.setText(input.getText() + str);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesapMakinesi frame = new HesapMakinesi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HesapMakinesi() {
		setResizable(false);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(10, 10, 356, 72);
		contentPane.add(screen);
		screen.setLayout(null);
		
		input = new JTextField();
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Tahoma", Font.BOLD, 23));
		input.setBounds(0, 0, 356, 72);
		screen.add(input);
		input.setColumns(10);
		
		JPanel control = new JPanel();
		control.setBounds(10, 92, 356, 356);
		contentPane.add(control);
		control.setLayout(new GridLayout(4, 4, 0, 0));
		
		btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddInput(e.getActionCommand());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton);
		
		btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_1);
		
		btnNewButton_4 = new JButton("9");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddInput(e.getActionCommand());
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_4);
		
		btnNewButton_8 = new JButton("+");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 1 ;
				input.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_8);
		
		btnNewButton_7 = new JButton("4");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddInput(e.getActionCommand());
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_7);
		
		btnNewButton_12 = new JButton("5");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddInput(e.getActionCommand());
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_12);
		
		btnNewButton_11 = new JButton("6");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddInput(e.getActionCommand());
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_11);
		
		btnNewButton_10 = new JButton("-");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 2 ;
				input.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_10);
		
		btnNewButton_9 = new JButton("1");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddInput(e.getActionCommand());
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_9);
		
		btnNewButton_6 = new JButton("2");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddInput(e.getActionCommand());
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_6);
		
		btnNewButton_15 = new JButton("3");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddInput(e.getActionCommand());
			}
		});
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_15);
		
		btnNewButton_14 = new JButton("x");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 3 ;
				input.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_14);
		
		btnNewButton_13 = new JButton("c");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_13);
		
		btnNewButton_3 = new JButton("0");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddInput(e.getActionCommand());
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_3);
		
		btnNewButton_2 = new JButton("=");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_2);
		
		btnNewButton_5 = new JButton("%");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 4 ;
				input.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		control.add(btnNewButton_5);
	}
}
