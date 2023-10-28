
public enum Candy 
{
	MILKCHOCOLATE(true, true),
	DARKCHOCOLATE(true, true),
	VEGANCHOCOLATE(true, true),
	LICORICE(true, true),
	LOLLIPOP(false, false),
	HARDCANDY(false, false),
	CHEWINGGUM(false, false),
	BONBONS(true, false),
	MINTS(true, false),
	TRAILMIX(true, false);
	
	boolean organic;
	
	boolean fairTrade;
	
	Candy (boolean organic, boolean fairTrade) 
	{
		this.organic = organic;
		this.fairTrade = fairTrade;
		
	}

}
