package mario.ost.meta;

import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

public class SoundTrack
{
	public String trackName;

	public String musicString;

	public boolean hasMusicString;

	public Pattern[] pattern;

	public Class<?> trackClass;

	public SoundTrack track;

	public SoundTrack(String trackName)
	{
		this.trackName = trackName;
		this.musicString = "";
		this.hasMusicString = false;
	}

	public SoundTrack(String musicString, boolean hasMusicString)
	{
		this.trackName = "";
		this.musicString = musicString;
		this.hasMusicString = hasMusicString;
	}

	public SoundTrack(Pattern...pattern)
	{
		this.pattern = pattern;
	}

	public SoundTrack(Class<?> trackClass) throws Exception
	{
		this.trackName = trackClass.getSimpleName();
		this.musicString = (String) trackClass.getField("music").get("");
	}

	public SoundTrack(SoundTrack track)
	{
		this.track = track;
	}

	public void play()
	{
		if(!hasMusicString) return;
		Player p = new Player();
		p.play(musicString);
	}

	public boolean hasMusicString()
	{
		return hasMusicString;
	}

	public String getMusicString()
	{
		return hasMusicString ? musicString : null;
	}

	public SoundTrack setMusicString(String musicString)
	{
		this.hasMusicString = true;
		this.musicString = musicString;
		return this;
	}

	@Override
	public String toString()
	{
		return trackName;
	}
}
