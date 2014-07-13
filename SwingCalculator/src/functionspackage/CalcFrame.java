package functionspackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class CalcFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcFrame frame = new CalcFrame();
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
	public CalcFrame() {
		setTitle("Trancendental Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(10, 117, 45, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("3");
		button.setBounds(109, 117, 45, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("4");
		button_1.setBounds(10, 151, 45, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setBounds(58, 117, 45, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setBounds(58, 151, 45, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.setBounds(109, 151, 45, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.setBounds(10, 185, 45, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.setBounds(58, 185, 45, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.setBounds(109, 185, 45, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.setBounds(10, 219, 93, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton(".");
		button_9.setBounds(109, 219, 45, 23);
		contentPane.add(button_9);
		
		textField = new JTextField();
		textField.setBounds(17, 48, 253, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
