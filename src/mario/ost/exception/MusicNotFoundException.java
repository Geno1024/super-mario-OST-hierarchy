package mario.ost.exception;

public class MusicNotFoundException extends Exception
{
	private static final long serialVersionUID = 0;

	public MusicNotFoundException()
	{
		super();
	}

	public MusicNotFoundException(String string)
	{
		super(string);
	}

	public MusicNotFoundException(Throwable throwable)
	{
		super(throwable);
	}

	public MusicNotFoundException(String string, Throwable throwable)
	{
		super(string, throwable);
	}
}
