package mario.ost.meta;

public class MusicType
{
	public static final MusicType overWorld = new MusicType("overWorld");

	public static final MusicType underGround = new MusicType("underGround");

	public static final MusicType waterWorld = new MusicType("waterWorld");

	public static final MusicType castle = new MusicType("castle");

	public static final MusicType ending = new MusicType("ending");

	public static final MusicType mainTheme = new MusicType("mainTheme");

	public static final MusicType athletic = new MusicType("athletic");

	public static final MusicType map = new MusicType("map");

	public String musicTypeName;

	public MusicType musicType;

	public MusicType(String musicTypeName)
	{
		this.musicTypeName = musicTypeName;
	}

	public MusicType(MusicType musicType)
	{
		this.musicType = musicType;
	}

	@Override
	public String toString()
	{
		return this.musicTypeName;
	}
}

