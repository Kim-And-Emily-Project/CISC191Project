
public enum Supplies
{
	PAPERTOWELS(false, 2),
	PAPERPLATES(false, 1),
	PLASTICCUPS(false, 1),
	PLASTICUTENSILS(false, 1),
	TRASHBAGS(false, 1),
	ZIPLOCKS(false, 3),
	CLEANINGSPRAY(true, 1),
	DETERGENT(true, 2),
	DRYERSHEETS(true, 1),
	BLEACH(false, 2);
	
	boolean hypoallergenic;
	
	int amount;
	
	Supplies (boolean hypoallergenic, int amount) 
	{
		this.hypoallergenic = hypoallergenic;
		this.amount = amount;
	}

}
