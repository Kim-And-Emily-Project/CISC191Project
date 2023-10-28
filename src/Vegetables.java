
public enum Vegetables 
{
	CELERY(true, 1),
	BROCCOLI(true, 4),
	CARROTS(true, 1),
	POTATOES(true, 1),
	PARSNIP(true, 2),
	PARSLEY(true, 1),
	CILANTRO(true, 1),
	ZUCCHINI(true, 1),
	KALE(true, 1),
	ONION(true, 4);
	
	boolean organic;
	
	int amount;
	
	Vegetables (boolean organic, int amount) 
	{
		this.organic = organic;
		this.amount = amount;
	}

}
