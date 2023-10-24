
public enum Grains 
{
	WHITEBREAD("C0", true, 2),
	WHEATBREAD("C1", true, 2),
	RYEBREAD("C2", true, 0),
	SOURDOUGH("C3", true, 1),
	PUMPERNICKEL("C4", true, 0),
	KETOBREAD("C5", true, 1),
	ALLPURPOSEFLOUR("C6", true, 1),
	BAKERSFLOUR("C7", true, 0),
	ALMONDFLOUR("C8", true, 0),
	BREADCRUMBS("C9", true, 3);
	
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
	Grains (String alphaNumeric, boolean organic, int amount) 
	{
		// the field variables are initialized
		this.alphaNumeric = alphaNumeric;
		this.organic = organic;
		this.amount = amount;
	}
}
