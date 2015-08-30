package mario.ost.meta;

public class OST
{
	public static final OST Super_Mario_Bros = new OST("mario.ost.super_mario_bros_series.super_mario_bros");

	public static final OST Super_Mario_Bros_2 = new OST("mario.ost.super_mario_bros_series.super_mario_bros_2");

	public static final OST Super_Mario_Bros_3 = new OST("mario.ost.super_mario_bros_series.super_mario_bros_3");

	public static final OST Super_Mario_RPG = new OST("mario.ost.super_mario_rpg_series.super_mario_rpg");

	public Package ost;

	public String ostName;

	public OST orig;

	public OST(Package ost)
	{
		this.ost = ost;
		this.ostName = ost.getName();
	}

	public OST(String ostName)
	{
		this.ost = Package.getPackage(ostName);
		this.ostName = ostName;
	}

	public OST(OST ost)
	{
		this.ost = orig.ost;
		this.ostName = orig.ostName;
	}

	public Package getPackageName()
	{
		return this.ost;
	}

	public Package getPackageName(OST orig)
	{
		return orig.ost;
	}

	@Override
	public String toString()
	{
		return this.ostName;
	}
}
