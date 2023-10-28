
public enum Meats 
{
	RIBEYE(true, true, false, 1),
	TRITIP(true, true, false, 1),
	BEEFBELLY(true, true, false, 2),
	GROUNDBEEF(true, true, false, 2),
	PORKCHOPS(true, true, false, 1),
	PORKRIBS(true, true, false, 2),
	BACON(true, true, false, 3),
	CHICKENBREAST(true, false, true, 2),
	DRUMSTICKS(true, false, true, 2),
	CHICKENTHIGHS(true, false, true, 1);
	
	boolean organic;
	
	boolean grassFed;
	
	boolean freeRange;
	
	int amount;
	
	Meats (boolean organic, boolean grassFed, boolean freeRange, int amount) 
	{
		this.organic = organic;
		this.grassFed = grassFed;
		this.freeRange = freeRange;
		this.amount = amount;
		
	}

}
