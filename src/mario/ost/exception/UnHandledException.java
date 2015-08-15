package mario.ost.exception;

public class UnHandledException extends Exception
{
	private static final long serialVersionUID = 3195279043644123761L;

	public UnHandledException()
	{
		super();
	}

	public UnHandledException(String string)
	{
		super(string);
	}

	public UnHandledException(Throwable throwable)
	{
		super(throwable);
	}

	public UnHandledException(String string, Throwable throwable)
	{
		super(string, throwable);
	}
}
