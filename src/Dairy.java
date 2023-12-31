/* Enum is an abbreviation of "enumerated" which means an ordered arrangement
 * of items within a collection. They are immutable which is useful if you have
 * constants that behave like objects that do not or cannot change.
 */
public enum Dairy 
{
	// final constant values that do not/cannot change
	// all dairy products HAVE the organic option
	COWSMILK("B0", true, 2),
	SOYMILK("B1", true, 1),
	ALMONDMILK("B2", true, 0),
	OATMILK("B3", true, 3),
	YOGURT("B4", true, 4),
	VEGANYOGURT("B5", true, 4),
	CHEESE("B6", true, 0),
	VEGANCHEESE("B7", true, 1),
	BUTTER("B8", true, 0),
	VEGANBUTTER("B9", true, 1);
	
	
	// String variable sets the alphanumeric code for each item that the user will
	// use to select an item to be added to the list
	final String alphaNumeric;
	
	// boolean variable sets whether the item can be organic or not
	// if the keyword FINAL is affixed to the front of the statement,
	// then the value cannot be changed after the fact...
	boolean organic;
	
	// perhaps the user can select the amount of each item to be added to the list?
	int amount;
	
	/** Purpose: enum constructor
	 *  @param String alphaNumeric
	 *  @param boolean organic
	 *  @param int amount
	 */
	Dairy (String alphaNumeric, boolean organic, int amount) 
	{
		// the field variables are initialized
		this.alphaNumeric = alphaNumeric;
		this.organic = organic;
		this.amount = amount;
	}
}
