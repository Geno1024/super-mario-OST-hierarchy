package mario.ost;

import mario.ost.exception.*;
import mario.ost.meta.*;

public class LumpOfGet
{
	public static final int get(String ostName, String musictype) throws OSTNotFoundException
	{
		try
		{
			Class c = Class.forName(ostName+".MetaData");
			return c.getField(musictype).getInt("");
		}
		catch (ClassNotFoundException e)
		{throw new OSTNotFoundException("\""+ostName+"\" is not a valid ost package or now unsupported.");}
		catch (Exception e)
		{return 0;}
	}

	public static final int getOverworld(String ostName) throws OSTNotFoundException
	{
		return get(ostName, MusicType.overWorld);
	}

	public static final int getUnderGround(String ostName) throws OSTNotFoundException
	{
		return get(ostName, MusicType.underGround);
	}

	public static final int getWaterWorld(String ostName) throws OSTNotFoundException
	{
		return get(ostName, MusicType.waterWorld);
	}
}

