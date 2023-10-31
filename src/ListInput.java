import java.util.Arrays;
import javax.swing.JButton;

/* 
 * LO2 - SINGLE & MULTIDIMENSIONAL ARRAYS:
 * 		
 * 		(All of the Item Categories, the Enum files, will be turned into 1D Arrays.
 * 		One array per enum. These arrays will be used to turn each Grocery Item into
 * 		a JButton (or Checkbox) which will demonstrate LO2.)
 * 
 * LO8: Construct programs utilizing text file I/O:
 * 
 * 		(We will need to import the text file of Food Quotes for the UI which will
 * 		demonstrate LO8.)
 * 
 * LO7: Construct programs utilizing exception handling:
 * 
 * 		(Whenever we open/read a file, we should use Exceptions to ensure that any 
 * 		errors pertaining to the file not existing or not being located is caught 
 * 		so that our program won't crash, effectively demonstrating LO7.)
 */

public class ListInput 
{
	/* I'm not sure yet, but this class might end up serving as the MODEL...
	 * We have to discuss it further, but the idea of this class is for it to contain
	 * all of the functionality for the enum classes. This is where the enum constants
	 * are manipulated; where their data is used. So, that is why I'm thinking that this
	 * might be the class to serve as the MODEL...
	 * 
	 * The order each Item Category will appear in the GUI is as follows:
	 * 1) Dairy
	 * 2) Grains
	 * 3) Meats
	 * 4) Seafood
	 * 5) Fruits
	 * 6) Vegetables
	 * 7) Candy
	 * 8) Toiletries
	 * 9) Supplies (instead of the Kitchen category)
	 */
	
	//---------------------------------------------------------------------------//
	// ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ //
	
	/** Purpose: converts Enum constants into a 1D Array so that each element can
	 *  be turned into a JButton
	 *  @param dairy
	 */
	public static void dairyArray(Dairy dairy) 
	{
		Dairy[] dairyArray = Dairy.values();
		
		JButton[] dairyButtons = new JButton[dairyArray.length];
		
		for(int i = 0; i < dairyArray.length; i++) 
		{
			dairyButtons[i] = new JButton(dairyArray[i].name());
		}
		
		System.out.println(Arrays.toString(dairyArray));
	}
	
	// ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ //
	//---------------------------------------------------------------------------//
	// ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ //
	
	public static void grainsArray(Grains grains) 
	{
		Grains[] grainsArray = Grains.values();
		
		JButton[] grainsButtons = new JButton[grainsArray.length];
		
		for(int i = 0; i < grainsArray.length; i++) 
		{
			grainsButtons[i] = new JButton(grainsArray[i].name());
		}
		
		System.out.println(Arrays.toString(grainsArray));
	}
	
	// ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ //
	//---------------------------------------------------------------------------//
	// ~ MEATS ~ MEATS ~ MEATS ~ MEATS ~ MEATS ~ MEATS ~ MEATS ~ MEATS ~ MEATS ~ //
	
	public static void meatsArray(Meats meats) 
	{
		Meats[] meatsArray = Meats.values();
		
		JButton[] meatsButtons = new JButton[meatsArray.length];
		
		for(int i = 0; i < meatsArray.length; i++) 
		{
			meatsButtons[i] = new JButton(meatsArray[i].name());
		}
		
		System.out.println(Arrays.toString(meatsArray));
	}
	
	// ~ MEATS ~ MEATS ~ MEATS ~ MEATS ~ MEATS ~ MEATS ~ MEATS ~ MEATS ~ MEATS ~ //
	//---------------------------------------------------------------------------//
	// ~ SEAFOOD ~ SEAFOOD ~ SEAFOOD ~ SEAFOOD ~ SEAFOOD ~ SEAFOOD ~ SEAFOOD ~ //
	
	public static void seafoodArray(Seafood seafood) 
	{
		Seafood[] seafoodArray = Seafood.values();
		
		JButton[] seafoodButtons = new JButton[seafoodArray.length];
		
		for(int i = 0; i < seafoodArray.length; i++) 
		{
			seafoodButtons[i] = new JButton(seafoodArray[i].name());
		}
		
		System.out.println(Arrays.toString(seafoodArray));
	}
	
	// ~ SEAFOOD ~ SEAFOOD ~ SEAFOOD ~ SEAFOOD ~ SEAFOOD ~ SEAFOOD ~ SEAFOOD ~ //
	//---------------------------------------------------------------------------//
	// ~ FRUITS ~ FRUITS ~ FRUITS ~ FRUITS ~ FRUITS ~ FRUITS ~ FRUITS ~ FRUITS ~ //
	
	public static void fruitsArray(Fruits fruits) 
	{
		Fruits[] fruitsArray = Fruits.values();
		
		JButton[] fruitsButtons = new JButton[fruitsArray.length];
		
		for(int i = 0; i < fruitsArray.length; i++) 
		{
			fruitsButtons[i] = new JButton(fruitsArray[i].name());
		}
		
		System.out.println(Arrays.toString(fruitsArray));
	}
	
	// ~ FRUITS ~ FRUITS ~ FRUITS ~ FRUITS ~ FRUITS ~ FRUITS ~ FRUITS ~ FRUITS ~ //
	//---------------------------------------------------------------------------//
	// ~ VEGETABLES ~ VEGETABLES ~ VEGETABLES ~ VEGETABLES ~ VEGETABLES ~ VEGETABLES ~ //
	
	public static void vegetablesArray(Vegetables vegetables) 
	{
		Vegetables[] vegetablesArray = Vegetables.values();
		
		JButton[] vegetablesButtons = new JButton[vegetablesArray.length];
		
		for(int i = 0; i < vegetablesArray.length; i++) 
		{
			vegetablesButtons[i] = new JButton(vegetablesArray[i].name());
		}
		
		System.out.println(Arrays.toString(vegetablesArray));
	}
	
	// ~ VEGETABLES ~ VEGETABLES ~ VEGETABLES ~ VEGETABLES ~ VEGETABLES ~ VEGETABLES ~ //
	//---------------------------------------------------------------------------//
	// ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ CANDY ~ //
	
	/** Purpose: LO2 - SINGLE & MULTIDIMENSIONAL ARRAYS:
	 * 
	 *  PUT ENUM CONSTANTS INTO AN ARRAY. THEN, CREATE BUTTONS FOR EACH
	 *  ELEMENT IN THE ARRAY. (FOR LO2 1D ARRAYS)
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
	//-------------------------------------------------------------------------//
	// TOILETRIES ~ TOILETRIES ~ TOILETRIES ~ TOILETRIES ~ TOILETRIES ~ //
	
	public static void toiletriesArray(Toiletries toiletries) 
	{
		Toiletries[] toiletriesArray = Toiletries.values();
		
		JButton[] toiletriesButtons = new JButton[toiletriesArray.length];
		
		for(int i = 0; i < toiletriesArray.length; i++) 
		{
			toiletriesButtons[i] = new JButton(toiletriesArray[i].name());
		}
		
		System.out.println(Arrays.toString(toiletriesArray));
	}
	
	// TOILETRIES ~ TOILETRIES ~ TOILETRIES ~ TOILETRIES ~ TOILETRIES ~ //
	//-------------------------------------------------------------------------//
	// SUPPLIES ~ SUPPLIES ~ SUPPLIES ~ SUPPLIES ~ SUPPLIES ~ SUPPLIES ~ SUPPLIES ~ //
	
	public static void suppliesArray(Supplies supplies) 
	{
		Supplies[] suppliesArray = Supplies.values();
		
		JButton[] suppliesButtons = new JButton[suppliesArray.length];
		
		for(int i = 0; i < suppliesArray.length; i++) 
		{
			suppliesButtons[i] = new JButton(suppliesArray[i].name());
		}
		
		System.out.println(Arrays.toString(suppliesArray));
	}
	
	// NEXT STEP: Turn the constants in each enum file -> array -> JButtons
	
	// SUPPLIES ~ SUPPLIES ~ SUPPLIES ~ SUPPLIES ~ SUPPLIES ~ SUPPLIES ~ SUPPLIES ~ //
	//-------------------------------------------------------------------------//
	// GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ //		
	
	/** Purpose: method uses a a switch code block to help the user determine
	 *  which grain products are available with the Gluten-Free option.
	 *  @param grains
	 */
	
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
	
	// ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ GRAINS ~ //
	//-------------------------------------------------------------------------//	
	// ~ MAIN ~ MAIN ~ MAIN ~ MAIN ~ MAIN ~ MAIN ~ MAIN ~ MAIN ~ MAIN ~ MAIN ~ //

	public static void main(String[] args) 
	{
		/* THE CODE WITHIN THE MAIN METHOD DEMONSTRATES A FEW THINGS THAT CAN BE 
		 * DONE WITH ENUMERATION. THEY ARE JUST IDEAS OF WHAT IS POSSIBLE.
		 */
		
		// DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ DAIRY ~ //
		
		// this is how to create new "objects" from the enum constants
		Dairy cowsMilk = Dairy.COWSMILK;
		Dairy soyMilk = Dairy.SOYMILK;
		Dairy almondMilk = Dairy.ALMONDMILK;
		Dairy oatMilk = Dairy.OATMILK;
		Dairy veganYogurt = Dairy.VEGANYOGURT;
		Dairy cheese = Dairy.CHEESE;
		Dairy veganCheese = Dairy.VEGANCHEESE;
		Dairy butter = Dairy.BUTTER;
		Dairy veganButter = Dairy.VEGANBUTTER;
		
		// this demonstrates sample functionality for enums
		if(cowsMilk == Dairy.COWSMILK) 
		{
			System.out.println("Cow's Milk\n");
		}
		
		// this statement returns all of the values contained in the enum
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
		
		// INVOKE THE ARRAY METHODS' FUNCTIONALITY SO THAT THE METHODS WILL EXECUTE:
		
		/*
		 * Creates an "object" from each Enum file. This "object" is then passed as
		 * the parameter to the respective Array methods which, in turn, executes 
		 * the functionality of those methods.
		 */
		
		Dairy yogurt = Dairy.YOGURT;
		dairyArray(yogurt);
		
		// the 'whiteBread' variable was declared and initialized previously
		grainsArray(whiteBread);
		
		Meats triTip = Meats.TRITIP;
		meatsArray(triTip);
		
		Seafood tilapia = Seafood.TILAPIA;
		seafoodArray(tilapia);
		
		Fruits peach = Fruits.PEACH;
		fruitsArray(peach);
		
		Vegetables kale = Vegetables.KALE;
		vegetablesArray(kale);
		
		// creates an "object" of a specific Candy enum
		Candy milkChocolate = Candy.MILKCHOCOLATE;
				
		candyArray(milkChocolate);	
		
		Toiletries soap = Toiletries.SOAP;
		toiletriesArray(soap);
		
		Supplies detergent = Supplies.DETERGENT;
		suppliesArray(detergent);
		
		// ~ MAIN ~ MAIN ~ MAIN ~ MAIN ~ MAIN ~ MAIN ~ MAIN ~ MAIN ~ MAIN ~ MAIN ~ //
	}		
}
