import java.util.Arrays;
import javax.swing.JButton;

/* 
 * LO2 - SINGLE & MULTIDIMENSIONAL ARRAYS
 */

public class ListInput 
{
	/* I'm not sure yet, but this class might end up serving as the MODEL...
	 * We have to discuss it further, but the idea of this class is for it to contain
	 * all of the functionality for the enum classes. This is where the enum constants
	 * are manipulated; where their data is used. So, that is why I'm thinking that this
	 * might be the class to serve as the MODEL...
	 */
	

	public static void main(String[] args) 
	{
		// DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ //
		
		// creates new "objects" from the enum constants
		Dairy cowsMilk = Dairy.COWSMILK;
		Dairy soyMilk = Dairy.SOYMILK;
		Dairy almondMilk = Dairy.ALMONDMILK;
		Dairy oatMilk = Dairy.OATMILK;
		Dairy veganYogurt = Dairy.VEGANYOGURT;
		Dairy cheese = Dairy.CHEESE;
		Dairy veganCheese = Dairy.VEGANCHEESE;
		Dairy butter = Dairy.BUTTER;
		Dairy veganButter = Dairy.VEGANBUTTER;
		
		// sample functionality for enums
		if(cowsMilk == Dairy.COWSMILK) 
		{
			System.out.println("Cow's Milk\n");
		}
		
		// returns all of the values contained in the enum
		Dairy.values();
		
		// for-each loop prints all of the items contained in the enum
		// "for all the dairy items, the value for each item is printed"
		for(Dairy items : Dairy.values()) 
		{
			System.out.println(items);
		}
		
		// prints the pre-determined boolean value for cow's milk's organic option
		System.out.println("\nCan Cow's Milk be organic?\n" + Dairy.COWSMILK.organic);
		
		// since the boolean value was NOT assigned the FINAL keyword, its value is
		// mutable and can be changed:
		Dairy.COWSMILK.organic = false;
		
		// prints the new boolean value for cow's milk's organic option
		System.out.println("Can Cow's Milk be organic?\n" + Dairy.COWSMILK.organic + "\n");
		
		// DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ //
		
		//-------------------------------------------------------------------------//
		
		// GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ //
		
		// creates "objects" of the Grains enum set specifically to White Bread and
		// Bread Crumbs
		Grains whiteBread = Grains.WHITEBREAD;
		Grains breadCrumbs = Grains.BREADCRUMBS;
		
		// calls the method with 'grains' as the argument which executes the method's
		// functionality in letting the user know if White Bread and Bread Crumbs 
		// come in Gluten-Free or not
		isGlutenFree(whiteBread);
		isGlutenFree(breadCrumbs);	
		
		// GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ //
		
		//-------------------------------------------------------------------------//
		
		// CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY //
		
		// creates an "object" of a specific Candy enum
		Candy milkChocolate = Candy.MILKCHOCOLATE;
		
		// invokes the method in the main method with one Candy enum passed as the
		// argument which executes the method's functionality for this specific argument
		candyArray(milkChocolate);
		
		
		
	}
	
	public static void isGlutenFree(Grains grains) 
	{
		// switch statement will determine the value of "dairy"
		switch(grains) 
		{
		case WHITEBREAD:
			System.out.println("There is a Gluten-Free option.");
			break;
		case WHEATBREAD:
			System.out.println("There is a Gluten-Free option.");
			break;
		case ALLPURPOSEFLOUR:
			System.out.println("There is a Gluten-Free option.");
			break;
		case BAKERSFLOUR:
			System.out.println("There is a Gluten-Free option.");
		default:
			System.out.println("This item does not have a Gluten-Free option.");
		}
	}
	
	// GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ //
	
	//-------------------------------------------------------------------------//
	
	// CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY //
	
	/** Purpose: LO2 - SINGLE & MULTIDIMENSIONAL ARRAYS:
	 * 
	 *  PUT ENUM CONSTANTS INTO AN ARRAY. THEN, CREATE BUTTONS FOR EACH
	 *  ELEMENT IN THE ARRAY.
	 *  
	 *  Method is concerned with creating an array to hold the Candy
	 *  enum constants. A button is then created for every element in the array.
	 *  A for loop then traverses the length of the array assigning a button to
	 *  each element it encounters with the name of the constant.
	 *  Finally, a print statement prints the contents of the array to the console.
	 *  @param Candy candy
	 */
	public static void candyArray(Candy candy) 
	{
		Candy[] candyArray = Candy.values();
		
		JButton[] candyButtons = new JButton[candyArray.length];
		
		for(int i = 0; i < candyArray.length; i++) 
		{
			candyButtons[i] = new JButton(candyArray[i].name());
		}
		
		System.out.println(Arrays.toString(candyArray));
	}
	
	// CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY //
	
	// Turn the constants in each enum file -> array -> JButtons
	
	

}
