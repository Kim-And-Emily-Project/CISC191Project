
public enum Seafood 
{
	TILAPIA(true, true, 1),
	SALMON(true, true, 2),
	MAHIMAHI(true, true, 2),
	SHRIMP(true, true, 4),
	LOBSTER(true, true, 1),
	CRAWFISH(true, true, 2),
	SCALLOPS(true, true, 1),
	OCTUPUS(true, true, 1),
	FLOUNDER(true, true, 1),
	CLAMS(true, true, 6);
	
	boolean wild;
	
	boolean farmed;
	
	int amount;
	
	Seafood (boolean wild, boolean farmed, int amount) 
	{
		this.wild = wild;
		this.farmed = farmed;
		this.amount = amount;	
	}

}
