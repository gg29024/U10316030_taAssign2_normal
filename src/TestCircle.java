
import java.awt.*;

import javax.swing.*;


import java.util.*;
import java.awt.event.*;


public class TestCircle extends JFrame{

	public TestCircle(){
		Circle object = new Circle();
		Triangle object2 =new Triangle();
		Square object3 = new Square();
		add(object,BorderLayout.NORTH);
		add(object2,BorderLayout.CENTER);
		add(object3,BorderLayout.SOUTH);
		
		
	}
	
	public static void main(String[] args) {
		TestCircle frame = new TestCircle();
		frame.setTitle("U10316030_GeoCalculate");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
}


class Circle extends JPanel{

	private JTextField jtfRadius = new JTextField(5);
	private JButton jbtCalculate = new JButton("Calculate");
	private JButton jbtClear = new JButton("Clear");
	private JTextField jtfArea = new JTextField(5);
	private JTextField jtfPerimeter = new JTextField(5);

	double radius;
	double area;
	double perimeter;

	
	public Circle(){
	
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(new JLabel("Circle"));
		//size
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p2.add(new JLabel("Radius: "));
		p2.add(jtfRadius);
		p2.add(jbtCalculate);
		p2.add(jbtClear);
		//size

		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p3.add(new JLabel("The area is: "));
		p3.add(jtfArea);
		//size

		JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p4.add(new JLabel("The perimeter is: "));
		p4.add(jtfPerimeter);
		//size		
		
		setLayout(new GridLayout(4,1));
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		
		jbtCalculate.addActionListener(new ButtonListener1());	
		jbtClear.addActionListener(new ButtonListener2());
		
	}
	

	
	
	private class ButtonListener1 implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			radius = Double.valueOf(jtfRadius.getText());
			jtfArea.setText(String.format("%.2f",getArea()));
			jtfPerimeter.setText(String.format("%.2f",getPerimeter()));
			
		}
	}

	private class ButtonListener2 implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			jtfRadius.setText("");
			jtfArea.setText("");
			jtfPerimeter.setText("");
		}
	}
	
	 /** Return the area of this circle */
	double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return the perimeter of this circle */
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
}

class Triangle extends JPanel{

	private JTextField jtfLength = new JTextField(5);
	private JButton jbtCalculate = new JButton("Calculate");
	private JButton jbtClear = new JButton("Clear");
	private JTextField jtfArea = new JTextField(5);
	private JTextField jtfPerimeter = new JTextField(5);

	double length;
	double area;
	double perimeter;

	
	public Triangle(){
	
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p1.add(new JLabel("Triangle"));
		//size
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p2.add(new JLabel("Length: "));
		p2.add(jtfLength);
		p2.add(jbtCalculate);
		p2.add(jbtClear);
		//size

		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p3.add(new JLabel("The area is: "));
		p3.add(jtfArea);
		//size

		JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p4.add(new JLabel("The perimeter is: "));
		p4.add(jtfPerimeter);
		//size		
		
		setLayout(new GridLayout(4,1));
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		
		jbtCalculate.addActionListener(new ButtonListener1());	
		jbtClear.addActionListener(new ButtonListener2());
		
	}
	

	
	
	private class ButtonListener1 implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			length = Double.valueOf(jtfLength.getText());
			jtfArea.setText(String.format("%.2f",getArea()));
			jtfPerimeter.setText(String.format("%.2f",getPerimeter()));
			
		}
	}

	private class ButtonListener2 implements ActionListener {
		@Override /** Handle the action event */
		public void actionPerformed(ActionEvent e) {
			jtfLength.setText("");
			jtfArea.setText("");
			jtfPerimeter.setText("");
		}
	}
	
	
	double getArea() {
		return length * length * Math.sqrt(3) /4;
	}

	
	double getPerimeter() {
		return 2 * length;
	}
	
}
	
	class Square extends JPanel{

		private JTextField jtfLength = new JTextField(5);
		private JButton jbtCalculate = new JButton("Calculate");
		private JButton jbtClear = new JButton("Clear");
		private JTextField jtfArea = new JTextField(5);
		private JTextField jtfPerimeter = new JTextField(5);

		double length;
		double area;
		double perimeter;

		
		public Square(){
		
			JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			p1.add(new JLabel("Square"));
			//size
			
			JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			p2.add(new JLabel("Length: "));
			p2.add(jtfLength);
			p2.add(jbtCalculate);
			p2.add(jbtClear);
			//size

			JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			p3.add(new JLabel("The area is: "));
			p3.add(jtfArea);
			//size

			JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
			p4.add(new JLabel("The perimeter is: "));
			p4.add(jtfPerimeter);
			//size	
			
			setLayout(new GridLayout(4,1));
			
			add(p1);
			add(p2);
			add(p3);
			add(p4);
			
			jbtCalculate.addActionListener(new ButtonListener1());	
			jbtClear.addActionListener(new ButtonListener2());
			
		}
		

		
		
		private class ButtonListener1 implements ActionListener {
			@Override /** Handle the action event */
			public void actionPerformed(ActionEvent e) {
				length = Double.valueOf(jtfLength.getText());
				jtfArea.setText(String.format("%.2f",getArea()));
				jtfPerimeter.setText(String.format("%.2f",getPerimeter()));
				
			}
		}

		private class ButtonListener2 implements ActionListener {
			@Override /** Handle the action event */
			public void actionPerformed(ActionEvent e) {
				jtfLength.setText("");
				jtfArea.setText("");
				jtfPerimeter.setText("");
			}
		}
		
	
		double getArea() {
			return length * length;
		}

	
		double getPerimeter() {
			return 4 * length;
		}
	}
		