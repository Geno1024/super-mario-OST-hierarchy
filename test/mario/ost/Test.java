package mario.ost;

import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;

import mario.ost.exception.UnHandledException;
import mario.ost.super_mario_bros_series.super_mario_bros.music_list.*;

import org.jfugue.midi.MidiParser;
import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;
import org.staccato.StaccatoParserListener;

public class Test
{
	public static void main(String[] args)
	{
		Player p = new Player();
		p.play(Super_Mario_Bros_Main_Theme.music);
		//System.out.println(mario.ost.LumpOfGet.getStatus());
		/*String testString = 
				"";
		Player p = new Player();
		p.play(testString);
		//p.play(Invincibility_Star.music);
		
		
		/*MidiParser parser = new MidiParser();
        StaccatoParserListener listener = new StaccatoParserListener();
        parser.addParserListener(listener);
        try
		{
			parser.parse(MidiSystem.getSequence(new File(
					"/media/geno1024/000117610006EECD/Users/Geno1024/Downloads/msddc/dkcountry/dkcountry_aquatic_ambiance(orch).mid"
					)));
		}
		catch (InvalidMidiDataException | IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Pattern staccatoPattern = listener.getPattern();
        System.out.println(staccatoPattern);
        */
	}
}
