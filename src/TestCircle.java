
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;


public class TestCircle extends JFrame{

	public TestCircle(){
		Circle object = new Circle();
		
		
		
	}
	
	public static void main(String[] args) {
		TestCircle frame = new TestCircle();
		frame.setTitle("U10316030_GeoCalculate");
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 350);
		frame.setVisible(true);
	}
	
}


class Circle extends JFrame{

	private JTextField jtfRadius = new JTextField(5);
	JButton jbtCalculate = new JButton("Calculate");
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
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.CENTER);
		add(p4, BorderLayout.SOUTH);
		
		
	
	}

}