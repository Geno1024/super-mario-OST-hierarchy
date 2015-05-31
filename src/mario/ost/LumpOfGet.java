package mario.ost;

import mario.ost.exception.*;
import mario.ost.meta.*;
import java.lang.reflect.*;

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

	public static final float getStatus()
	{
		float res = 0;
		int count = 0;
		try
		{
			Class c = Class.forName("mario.ost.meta.Status");
			for(int i = 0; i < c.getClasses().length; i++)
			{
				Class d = c.getClasses()[i];
				for(int j = 0; j < d.getClasses().length; j++)
				{
					Field[] f = d.getClasses()[j].getFields();
					for(int k = 0; k < f.length; k++)
					{
						res = res + f[k].getInt("");
						count ++;
					}
				}
			}
			return res/count;
		}
		catch (Exception e)
		{return res;}
	}
}

