/**
 * Calculator UI Design Using Swing and AWT
 * 
 * This code is a part of a project for the course SOEN 6011 "Software Engineering Development Processes"
 * taught by Dr. Pankaj Kamthan.
 * 
 * @author Chetan Dalal
 * @copyright	August 2014 - Concordia University, Montreal, QC
 * 
 */
package functionspackage;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;


@SuppressWarnings({ "unused", "serial" })
/** Class Calculator 
 * implements Swing actionlistener and Itemlistner of AWT to render a UI on JPanel.
 */
public class Calculator extends JFrame implements ActionListener, ItemListener{

	private JPanel contentPane;
	public double result=0.0;
	CheckboxGroup cbg;
	Checkbox radians, degrees;
	/** Debugging
	 * private boolean isDecimal=false;
	 * private boolean isEnter=false;
	 */
	boolean[] function = new boolean[4];
	double[] temporary = {0, 0};
	JTextArea textArea = new JTextArea();
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b0 = new JButton("0");
	JButton buttonDecimal = new JButton(".");
	JButton clearButton = new JButton("C");
	JButton btnNewButton_2 = new JButton("X^X");//Create button for your function
	JButton btnSinx = new JButton("Sin"); 
	JButton btnCosx = new JButton("Cos");
	JButton btnTanx = new JButton("Tan");
	JButton btnNewButton_3 = new JButton("-/+");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
					Xfunc obj= new Xfunc();


				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * Constructor
	 */
	public Calculator() {
		//super("CalcFrame");//Call the super class
		setResizable(false);
		setTitle("Trancendental Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 294);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		for(int i = 0; i < 4; i++)
			function[i] = false;
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.BLUE);
		b1.setFont(new Font("Tahoma", Font.BOLD, 11));

		b1.setBounds(10, 117, 45, 23);
		contentPane.add(b1);
		b1.addActionListener(this);
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.BLUE);
		b2.setFont(new Font("Tahoma", Font.BOLD, 11));

		b2.setBounds(58, 117, 45, 23);
		contentPane.add(b2);
		b2.addActionListener(this);
		b3.setBackground(Color.WHITE);
		b3.setForeground(Color.BLUE);
		b3.setFont(new Font("Tahoma", Font.BOLD, 11));

		b3.setBounds(109, 117, 45, 23);
		contentPane.add(b3);
		b3.addActionListener(this);
		b4.setBackground(Color.WHITE);
		b4.setFont(new Font("Tahoma", Font.BOLD, 11));
		b4.setForeground(Color.BLUE);

		b4.setBounds(10, 151, 45, 23);
		contentPane.add(b4);
		b4.addActionListener(this);
		b5.setBackground(Color.WHITE);
		b5.setForeground(Color.BLUE);
		b5.setFont(new Font("Tahoma", Font.BOLD, 11));

		b5.setBounds(58, 151, 45, 23);
		contentPane.add(b5);
		b5.addActionListener(this);
		b6.setBackground(Color.WHITE);
		b6.setFont(new Font("Tahoma", Font.BOLD, 11));
		b6.setForeground(Color.BLUE);

		b6.setBounds(109, 151, 45, 23);
		contentPane.add(b6);
		b6.addActionListener(this);
		b7.setForeground(Color.BLUE);
		b7.setFont(new Font("Tahoma", Font.BOLD, 11));
		b7.setBackground(Color.WHITE);

		b7.setBounds(10, 185, 45, 23);
		contentPane.add(b7);
		b7.addActionListener(this);
		b8.setFont(new Font("Tahoma", Font.BOLD, 11));
		b8.setBackground(Color.WHITE);
		b8.setForeground(Color.BLUE);

		b8.setBounds(58, 185, 45, 23);
		contentPane.add(b8);
		b8.addActionListener(this);
		b9.setBackground(Color.WHITE);
		b9.setFont(new Font("Tahoma", Font.BOLD, 11));
		b9.setForeground(Color.BLUE);

		b9.setBounds(109, 185, 45, 23);
		contentPane.add(b9);
		b9.addActionListener(this);
		b0.setFont(new Font("Tahoma", Font.BOLD, 11));
		b0.setForeground(Color.BLUE);

		b0.setBounds(10, 219, 93, 23);
		contentPane.add(b0);
		b0.addActionListener(this);
		buttonDecimal.setForeground(Color.BLUE);
		buttonDecimal.setFont(new Font("Tahoma", Font.BOLD, 14));

		buttonDecimal.setBounds(109, 219, 45, 23);
		contentPane.add(buttonDecimal);
		buttonDecimal.addActionListener(this);
		clearButton.setForeground(Color.BLUE);
		clearButton.setFont(new Font("Tahoma", Font.BOLD, 11));

		clearButton.setBounds(10, 83, 89, 23);
		contentPane.add(clearButton);
		clearButton.addActionListener(this);
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_2.setToolTipText("E.g. 5X^X=3125");

		//btnNewButton_2 is for X^X, others are appropriately defined
		btnNewButton_2.setBounds(207, 83, 89, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(this);
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));

		//btnNewButton_3 is to toggle -ve values in input 
		btnNewButton_3.setBounds(109, 83, 70, 23);
		contentPane.add(btnNewButton_3);
		btnNewButton_3.addActionListener(this);
		textArea.setFont(new Font("Monospaced", Font.BOLD, 13));

		textArea.setBounds(10, 33, 265, 22);
		contentPane.add(textArea);
		textArea.setEditable(false);
		btnSinx.setForeground(Color.BLUE);
		btnSinx.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnSinx.setToolTipText("E.g. 60+Sin=Sin60");

		btnSinx.setBounds(207, 117, 89, 23);
		contentPane.add(btnSinx);
		btnSinx.addActionListener(this);//I have already added the action listener here, go to actionsPerformed()
		btnCosx.setToolTipText("E.g. 60+Cos= Cos60");
		btnCosx.setForeground(Color.BLUE);
		btnCosx.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));

		btnCosx.setBounds(207, 151, 89, 23);
		contentPane.add(btnCosx);
		btnCosx.addActionListener(this);
		btnTanx.setToolTipText("E.g. 45+Tan=Tan45");

		btnTanx.setBounds(207, 185, 89, 23);
		contentPane.add(btnTanx);
		btnTanx.addActionListener(this);
		btnTanx.setForeground(Color.BLUE);
		btnTanx.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		
		cbg = new CheckboxGroup();
		degrees = new Checkbox("Degrees", cbg, true);
		degrees.setState(true);
		degrees.setBounds(295, 22, 95, 22);
		contentPane.add(degrees);
		degrees.addItemListener(this);
		
		radians = new Checkbox("Radians", cbg, false);
		radians.setBounds(295, 55, 95, 22);
		contentPane.add(radians);
		radians.addItemListener(this);	
		
	}

	public void clear() {
		try {
			textArea.setText("");
			for(int i = 0; i < 4; i++)
				function[i] = false;
			for(int i = 0; i < 2; i++)
				temporary[i] = 0;
		} catch(NullPointerException e) {}
	}
	public void getPosNeg() {

		try {

			double value = Double.parseDouble(textArea.getText());
			if(value != 0) {
				value = value * (-1);
				textArea.setText(Double.toString(value));
			}
			else {
			}
		} catch(NumberFormatException e) {}
	}
	public void getXpowerX() {
		try {
			double inputted = Double.parseDouble(textArea.getText());
			double value = Xfunc.exponentfunction(inputted, inputted);
			textArea.setText(Double.toString(value));
		} catch(NumberFormatException e) {
		}
	}


	public void sine() {
		try {
			double inputted = Double.parseDouble(textArea.getText());
			double value = Sine.sinet(inputted);
			textArea.setText(Double.toString(value));
		} catch(NumberFormatException e) {
		}
	}
	/*New Method added for Sine using degree and radians: Navpreet has to remove all built in functions
	 like math.rad or degree conversion*/
	public void sinee() {
		try{
			if (degrees.getState())
			{
				double inputted = Double.parseDouble(textArea.getText());				
				double convertRadians= inputted*(Math.PI/180);
				double value = Sine.sinet(convertRadians);
				textArea.setText(Double.toString(value));	
			}
			else {
				double inputted = Double.parseDouble(textArea.getText()); 
				//double convertDegree= Math.toDegrees(inputted);
				double value = Sine.sinet(inputted);
				textArea.setText(Double.toString(value));
			}
		} catch(NumberFormatException e) {
			}
	}

	public void cos() {
		
		try{
			if (degrees.getState())
			{
				double inputted = Double.parseDouble(textArea.getText());				
				double convertRadians= inputted*(Math.PI/180);
				double value = Cose.cosF(convertRadians);
				textArea.setText(Double.toString(value));	
			}
			else {
				double inputted = Double.parseDouble(textArea.getText()); 
				//double convertDegree= Math.toDegrees(inputted);
				double value = Cose.cosF(inputted);
				textArea.setText(Double.toString(value));
			}
		} catch(NumberFormatException e) {
			}
		
		
	}

	public void tan() {
		
		try{
			if (degrees.getState())
			{
				double inputted = Double.parseDouble(textArea.getText());				
				double convertRadians= inputted*(Math.PI/180);
				double value = CalcTan.CalcTanFun(convertRadians);
				textArea.setText(Double.toString(value));	
			}
			else {
				double inputted = Double.parseDouble(textArea.getText()); 
				//double convertDegree= Math.toDegrees(inputted);
				double value = CalcTan.CalcTanFun(inputted);
				textArea.setText(Double.toString(value));
			}
		} catch(NumberFormatException e) {
			}
		
	}

	@Override
	/**
	 * (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource() == b0)

			textArea.append("0");    

		if(ae.getSource() == b1)

			textArea.append("1");

		if(ae.getSource() == b2)

			textArea.append("2");

		if(ae.getSource() == b3)

			textArea.append("3");

		if(ae.getSource() == b4)

			textArea.append("4");

		if(ae.getSource() == b5)

			textArea.append("5");

		if(ae.getSource() == b6)

			textArea.append("6");

		if(ae.getSource() == b7)

			textArea.append("7");

		if(ae.getSource() == b8)

			textArea.append("8");

		if(ae.getSource() == b9)

			textArea.append("9");

		if(ae.getSource() == buttonDecimal)

			textArea.append(".");

		if(ae.getSource() == clearButton)

			clear();

		if(ae.getSource() == btnNewButton_2)

			getXpowerX();

		if(ae.getSource() == btnNewButton_3)

			getPosNeg();

		if(ae.getSource() == btnSinx){
			sinee();  
		}
		//Function call here

		if(ae.getSource() == btnCosx){
			cos();
			//Add function call here
		}	

		if(ae.getSource() == btnTanx){
			tan();
			//Add function call here
		}	

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}