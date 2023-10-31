import javax.swing.*;
import java.awt.*;

/* 
 * LO6: Construct programs utilizing graphical user interfaces utilizing event-driven programming:
 * 
 * LO4: Construct programs utilizing Inheritance and Polymorphism, including abstract classes and interfaces:
 * 
 * 		(This class EXTENDS the JFrame class allowing the JFrame class to act as a Super class to the
 * 		sub-class that uses it, effectively demonstrating LO4.)
 */

public class InteractiveGroceryListView extends JFrame
{	
	private JPanel listExportPanel;
	private JPanel grayPanel2;
	
	
	public InteractiveGroceryListView()
	{
		//creates a frame
		setTitle("Interactive Grocery List");	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,700);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setResizable(true);	
				
		buildGrayPanel1();
		add(listExportPanel, BorderLayout.NORTH);
		
		buildGrayPanel2();
		add(grayPanel2);
		
		setVisible(true);
	}
	
	public void buildGrayPanel1() 
	{
		listExportPanel = new JPanel();
		listExportPanel.setBackground(Color.CYAN);
		listExportPanel.setBounds(25,10,200,25);		
		listExportPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 25));
	}
	
	public void buildGrayPanel2() 
	{
		grayPanel2 = new JPanel();
		grayPanel2.setBackground(Color.PINK);
		grayPanel2.setBounds(275,10,200,25);
		grayPanel2.setLayout(new BorderLayout());		
	}
	
	public static void main(String[] args)
	{	
		// CREATE INDIVIDUAL METHODS FOR EACH GUI COMPONENT TO SEPARATE CONCERNS AND
		// MAKE IT EASIER TO VISUALLY INTERPRET THE CODE
		
		// creates an instance of THIS class to "activate" the methods' functionality
		InteractiveGroceryListView view = new InteractiveGroceryListView(); 
		
		// creates an instance of the class to use the JButtons
		ListInput listInput = new ListInput();										
	
	}
}
