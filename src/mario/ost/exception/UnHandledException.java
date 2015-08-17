package mario.ost.exception;

import com.sun.istack.internal.*;

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

	public UnHandledException(@Nullable String lastType, Object lastValue, @Nullable String string, @Nullable Throwable throwable)
	{
		super(string, throwable);
		System.out.println((lastType == null ? "" : lastType + " = ") + lastValue);
	}
}
