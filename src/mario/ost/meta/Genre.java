package mario.ost.meta;

public class Genre
{
	public static class Action
	{
		public static Genre Platform = new Genre("Platform");

		public static Genre Action = new Genre("Action");
	}

	public static Genre RPG = new Genre("RPG");

	public String genreString;

	public Genre genre;

	public Genre(String genreString)
	{
		this.genreString = genreString;
	}

	public Genre(Genre genre)
	{
		this.genre = genre;
	}

	@Override
	public String toString()
	{
		return genreString;
	}
}
