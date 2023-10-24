
public class ListInput 
{

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

}
