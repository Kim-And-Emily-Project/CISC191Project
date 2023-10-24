
public enum Fruits 
{
	// final constant values that do not/cannot change
	// all fruit items HAVE the organic option
	STRAWBERRIES("A0", true, 1),
	BLUEBERRIES("A1", true, 1),
	PEACH("A2", true, 4),
	BANANAS("A3", true, 1),
	APPLES("A4", true, 6),
	LIME("A5", true, 4),
	LEMON("A6", true, 1),
	AVOCADO("A7", true, 4),
	TOMATOES("A8", true, 6),
	PINEAPPLE("A9", true, 1);
	
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
	 *  @param String alphanumeric
	 */
	Fruits (String alphaNumeric, boolean organic, int amount) 
	{
		this.alphaNumeric = alphaNumeric;
		this.organic = organic;
		this.amount = amount;
	}
}
