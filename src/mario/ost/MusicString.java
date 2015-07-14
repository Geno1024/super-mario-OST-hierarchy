package mario.ost;

public class MusicString
{
	public MusicString musicString;

	public String string;

	public MusicString(String string)
	{
		this.string = string;
	}

	public MusicString(MusicString musicString)
	{
		this.musicString = musicString;
	}

	public static final MusicString play = new MusicString("play");
}
