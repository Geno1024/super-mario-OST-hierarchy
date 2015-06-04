package mario.ost.exception;

public class OSTNotFoundException extends Exception
{
	private static final long serialVersionUID = 5863422945100796337L;

	public OSTNotFoundException()
	{
		super();
	}

	public OSTNotFoundException(String string)
	{
		super(string);
	}

	public OSTNotFoundException(Throwable throwable)
	{
		super(throwable);
	}

	public OSTNotFoundException(String string, Throwable throwable)
	{
		super(string, throwable);
	}
}

