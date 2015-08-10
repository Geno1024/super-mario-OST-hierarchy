package mario.ost;

import mario.ost.exception.*;
import mario.ost.meta.*;
import java.lang.reflect.*;

public class LumpOfGet
{
	/**
	 * @param ostName The OST name.
	 * @param musictype The kind of music, use {@link MusicType}.
	 * @return The number of this kind of music in this OST.
	 * @throws OSTNotFoundException If this OST doesn't exists.
	 */
	public static final int getMusic(String ostName, String musictype) throws OSTNotFoundException
	{
		try
		{
			Class<?> c = Class.forName(ostName + ".MetaData");
			return c.getField(musictype).getInt("");
		}
		catch (ClassNotFoundException e)
		{throw new OSTNotFoundException("\"" + ostName + "\" is not a valid ost package or now unsupported.");}
		catch (Exception e)
		{return 0;}
	}

	public static final boolean isMusicInDiskII(String ostName, String musictype) throws OSTNotFoundException, OnlyOneDiskOSTException
	{
		try
		{
			Class<?> c = Class.forName(ostName + ".MetaData");
			return c.getField(musictype + "IsInDiskII").getBoolean("");
		}
		catch (ClassNotFoundException e)
		{throw new OSTNotFoundException("\"" + ostName + "\" is not a valid ost package or now unsupported.");}
		catch (NoSuchFieldException e)
		{
			try
			{
				Class.forName(ostName + ".TrackList").getField("monoDisc").getBoolean("");
				return false;
			}
			catch (NoSuchFieldException f)
			{
				throw new OnlyOneDiskOSTException("\"" + ostName + "\" just have one disk.");
			}
			catch (Exception f)
			{
				return false;
			}
		}
		catch (Exception e)
		{
			return false;
		}
	}

	public static final int getOverworld(String ostName) throws OSTNotFoundException
	{
		return getMusic(ostName, MusicType.overWorld);
	}

	public static final int getUnderGround(String ostName) throws OSTNotFoundException
	{
		return getMusic(ostName, MusicType.underGround);
	}

	public static final int getWaterWorld(String ostName) throws OSTNotFoundException
	{
		return getMusic(ostName, MusicType.waterWorld);
	}

	public static final int getCastle(String ostName) throws OSTNotFoundException
	{
		return getMusic(ostName, MusicType.castle);
	}

	public static final int getAthletic(String ostName) throws OSTNotFoundException
	{
		return getMusic(ostName, MusicType.athletic);
	}

	public static final double getStatus()
	{
		double res = 0;
		int count = 0;
		try
		{
			for(Class<?> c : ((Class<?>)Class.forName("mario.ost.meta.Status")).getClasses())
			{
				for (Class<?> d : c.getClasses())
				{
					for (Field f : d.getFields())
					{
						res += f.getDouble("");
						count++;
					}
				}
				for (Field f : c.getFields())
				{
					res += f.getDouble("");
					count++;
				}
			}
			return res/count;
		}
		catch (Exception e)
		{return res;}
	}

	public static final int getTrackCount(String ostName) throws OSTNotFoundException
	{
		try
		{
			Class<?> c = Class.forName(ostName + ".TrackList");
			return c.getField("trackCount").getInt("");
		}
		catch (ClassNotFoundException e)
		{throw new OSTNotFoundException("\"" + ostName + "\" is not a valid ost package or now unsupported.");}
		catch (Exception e)
		{return 0;}
	}

	public static final String getComposer(String ostName) throws OSTNotFoundException
	{
		String out = "";
		try
		{
			Class<?> c = Class.forName(ostName + ".TrackList");
			String[] s = (String[]) c.getField("composer").get("");
			for(int i = 0; i < s.length; i++)
				out = out + s[i] + ",";
			return s.length == 1 ? s[0] : out;
		}
		catch (ClassNotFoundException e)
		{throw new OSTNotFoundException("\"" + ostName + "\" is not a valid ost package or now unsupported.");}
		catch (Exception e)
		{return "Unknown Error.\n";}
	}
}
