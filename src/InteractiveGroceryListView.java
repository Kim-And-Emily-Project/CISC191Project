import javax.swing.*;
import java.awt.*;

/* 
 * LO6: Construct programs utilizing graphical user interfaces utilizing event-driven programming.
 */

public class InteractiveGroceryListView extends JFrame
{	
	public InteractiveGroceryListView()
	{
	}
	
	public static void main(String[] args)
	{	
		// CREATE INDIVIDUAL METHODS FOR EACH GUI COMPONENT TO SEPARATE CONCERNS AND
		// MAKE IT EASIER TO VISUALLY INTERPRET THE CODE
		
		JPanel grayPanel1 = new JPanel();
		grayPanel1.setBackground(Color.GRAY);
		grayPanel1.setBounds(25,10,200,25);
		
		JPanel grayPanel2 = new JPanel();
		grayPanel2.setBackground(Color.GRAY);
		grayPanel2.setBounds(275,10,200,25);
		grayPanel2.setLayout(new BorderLayout());

		//creates a frame
		JFrame frame = new JFrame();
		frame.setTitle("Interactive Grocery List");
		frame.setSize(500,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.add(grayPanel1);
		frame.add(grayPanel2);	
	}
}
