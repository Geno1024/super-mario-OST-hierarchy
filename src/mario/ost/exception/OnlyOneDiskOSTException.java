package mario.ost.exception;

public class OnlyOneDiskOSTException extends Exception
{
	private static final long serialVersionUID = 0;

	public OnlyOneDiskOSTException()
	{
		super();
	}

	public OnlyOneDiskOSTException(String string)
	{
		super(string);
	}

	public OnlyOneDiskOSTException(Throwable throwable)
	{
		super(throwable);
	}

	public OnlyOneDiskOSTException(String string, Throwable throwable)
	{
		super(string, throwable);
	}
}
