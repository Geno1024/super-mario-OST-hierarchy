package mario.ost.exception;

public class OnlyOneDiskOSTException extends Exception
{
	private static final long serialVersionUID = -7055386884315147743L;

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
