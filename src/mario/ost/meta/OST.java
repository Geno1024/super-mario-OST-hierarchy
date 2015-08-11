package mario.ost.meta;

public class OST
{
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
