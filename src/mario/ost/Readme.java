package mario.ost;

public class Readme
{
	public static final String[] usingLibrary =
	new String[]
	{
		"JFugue"
	};

	public static final String[] midiSource =
	new String[]
	{
		"https://themushroomkingdom.net"
	};

	public static final class whatToFill
	{
		public static final Class<?>[] afterCreatingAPackage =
		new Class<?>[]
		{
			mario.ost.meta.OST.class,
			mario.ost.meta.Status.class,
		};

		public static final Class<?>[] afterCreatingASong =
		new Class<?>[]
		{
			mario.ost.meta.SoundTrack.class,
		};
	}
}
