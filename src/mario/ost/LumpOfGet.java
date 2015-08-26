package mario.ost;

import mario.ost.exception.*;
import mario.ost.meta.*;
import java.lang.reflect.*;

public class LumpOfGet
{
	/**
	 * @param ostName The OST name, use {@link OSTList}.
	 * @param musictype The kind of music, use {@link MusicType}.
	 * @return The number of this kind of music in this OST.
	 * @throws OSTNotFoundException If this OST doesn't exists.
	 * @throws UnHandledException If an unknown exception occurs.
	 */
	public static final int getMusic(OST ostName, MusicType musictype) throws OSTNotFoundException, UnHandledException
	{
		try
		{return Class.forName(ostName + ".MetaData").getField(musictype.toString()).getInt("");}
		catch (ClassNotFoundException e)
		{throw new OSTNotFoundException("\"" + ostName + "\" is not a valid ost OST or now unsupported.");}
		catch (Exception e)
		{throw new UnHandledException(e);}
	}

	public static final boolean isMusicInDiskII(OST ostName, String musictype) throws OSTNotFoundException, OnlyOneDiskOSTException, UnHandledException
	{
		try
		{return Class.forName(ostName + ".MetaData").getField(musictype + "IsInDiskII").getBoolean("");}
		catch (ClassNotFoundException e)
		{throw new OSTNotFoundException("\"" + ostName + "\" is not a valid ost OST or now unsupported.");}
		catch (NoSuchFieldException e)
		{
			try
			{
				Class.forName(ostName + ".TrackList").getField("monoDisc").getBoolean("");
				return false;
			}
			catch (NoSuchFieldException f)
			{throw new OnlyOneDiskOSTException("\"" + ostName + "\" just have one disk.");}
			catch (Exception f)
			{throw new UnHandledException(f);}
		}
		catch (Exception e)
		{throw new UnHandledException(e);}
	}

	public static final int getOverworld(OST ostName) throws OSTNotFoundException, UnHandledException
	{
		return getMusic(ostName, MusicType.overWorld);
	}

	public static final int getUnderGround(OST ostName) throws OSTNotFoundException, UnHandledException
	{
		return getMusic(ostName, MusicType.underGround);
	}

	public static final int getWaterWorld(OST ostName) throws OSTNotFoundException, UnHandledException
	{
		return getMusic(ostName, MusicType.waterWorld);
	}

	public static final int getCastle(OST ostName) throws OSTNotFoundException, UnHandledException
	{
		return getMusic(ostName, MusicType.castle);
	}

	public static final int getAthletic(OST ostName) throws OSTNotFoundException, UnHandledException
	{
		return getMusic(ostName, MusicType.athletic);
	}

	public static final double getStatus() throws UnHandledException
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
		{throw new UnHandledException("TotalRes", res, e.getMessage(), e);}
	}

	public static final int getTrackCount(OST ostName) throws OSTNotFoundException, UnHandledException
	{
		try
		{return Class.forName(ostName + ".TrackList").getField("trackCount").getInt("");}
		catch (ClassNotFoundException e)
		{throw new OSTNotFoundException("\"" + ostName + "\" is not a valid ost OST or now unsupported.");}
		catch (Exception e)
		{throw new UnHandledException(e);}
	}

	public static final String getComposer(OST ostName) throws OSTNotFoundException, UnHandledException
	{
		String out = "";
		try
		{
			String[] s = (String[]) Class.forName(ostName + ".TrackList").getField("composer").get("");
			for(int i = 0; i < s.length; i++)
				out = out + s[i] + ",";
			return s.length == 1 ? s[0] : out;
		}
		catch (ClassNotFoundException e)
		{throw new OSTNotFoundException("\"" + ostName + "\" is not a valid ost OST or now unsupported.");}
		catch (Exception e)
		{throw new UnHandledException(e);}
	}
}
