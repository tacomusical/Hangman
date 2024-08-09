import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class ControlDeAudio {
	File Menu;
	Clip Clip;
	AudioInputStream audioStream;
	
	ControlDeAudio(){
		Menu = new File("Overture-Super Mario Galaxy.wav");
		try {
			Clip = AudioSystem.getClip();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}
	
	public void ReproducirTemaMenu(String Reproducir) {
		if(Reproducir.equals("NoReproducir")) {
			Clip.stop();
			Clip.close();
		} else if(Reproducir.equals("Reproducir")){
			try {
				audioStream = AudioSystem.getAudioInputStream(Menu);
			} catch (UnsupportedAudioFileException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				Clip.open(audioStream);
			} catch (LineUnavailableException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			Clip.loop(100);
		}
	}
}
