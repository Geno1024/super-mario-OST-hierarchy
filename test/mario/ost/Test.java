package mario.ost;

import mario.ost.super_mario_bros_series.super_mario_bros.music_list.*;

import org.jfugue.player.Player;

public class Test
{
	public static void main(String[] args)
	{
		Player p = new Player();
		p.play(Super_Mario_Bros_Main_Theme.music);
	}
}
