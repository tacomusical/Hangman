import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ControlDeAudio {
	public final String CANCION_DE_MENU = "CancionDeMenu";
	public final String CANCION_REGLAS = "CancionReglas";
	public final String CANCION_INICIAR_JUEGO = "Cancion_Iniciar_Juego";
	public final String CANCION_BUENA_LETRA = "Buena_Letra";
	public final String CANCION_MALA_LETRA = "Mala_letra";
	public final String CANCION_MUERTE = "CancionMuerte";
	public final String CANCION_VICTORIA = "CancionVictoria";
	public final String CANCION_CAMPAÑA_TEMA = "CancionCampañaTema";
	
	File AudioMenu;
	File AudioReglas;
	File AudioIniciarJuego;
	File AudioBuenaLetra;
	File AudioMalaLetra;
	File AudioMuerte;
	File AudioVictoria;
	File AudioCampañaTema;
	Clip Clip;
	AudioInputStream audioStream;
	
	//Definir Canciones
	ControlDeAudio(){
		AudioMenu = new File("Soundtrack/Overture-Super Mario Galaxy.wav");
		AudioReglas = new File("Soundtrack/ReglasAudio.wav");
		AudioIniciarJuego = new File("Soundtrack/IniciarJuego.wav");
		AudioBuenaLetra = new File("Soundtrack/BuenaLetra.wav");
		AudioMalaLetra = new File("Soundtrack/MalaLetra.wav");
		AudioMuerte = new File("Soundtrack/MuerteTema.wav");
		AudioVictoria = new File("Soundtrack/VictoriaMusica.wav");
		AudioCampañaTema = new File("Soundtrack/CampañaTema.wav");
		try {
			Clip = AudioSystem.getClip();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}
	
	//Escoger y Reproduce Cancion
	public void ReproducirAudioLoop(String CancionReproducir){
		// Escoger Cancion a Reproducir
		if(CancionReproducir.equals(CANCION_DE_MENU)) {
			// Reproducir Cancion
			try {
				audioStream = AudioSystem.getAudioInputStream(AudioMenu);
				Clip.open(audioStream);
				Clip.loop(100);
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
		}
		
		if(CancionReproducir.equals(CANCION_REGLAS)) {
			try {
				audioStream = AudioSystem.getAudioInputStream(AudioReglas);
				Clip.open(audioStream);
				Clip.loop(100);
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
		}
		
		if(CancionReproducir.equals(CANCION_INICIAR_JUEGO)) {
			try {
				audioStream = AudioSystem.getAudioInputStream(AudioIniciarJuego);
				Clip.open(audioStream);
				Clip.start();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
		}
		
		if(CancionReproducir.equals(CANCION_BUENA_LETRA)) {
			try {
				audioStream = AudioSystem.getAudioInputStream(AudioBuenaLetra);
				Clip.open(audioStream);
				Clip.start();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
		}
		
		if(CancionReproducir.equals(CANCION_MALA_LETRA)) {
			try {
				audioStream = AudioSystem.getAudioInputStream(AudioMalaLetra);
				Clip.open(audioStream);
				Clip.start();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
		}
		
		if(CancionReproducir.equals(CANCION_MUERTE)) {
			try {
				audioStream = AudioSystem.getAudioInputStream(AudioMuerte);
				Clip.open(audioStream);
				Clip.start();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
		}
		
		if(CancionReproducir.equals(CANCION_VICTORIA)) {
			try {
				audioStream = AudioSystem.getAudioInputStream(AudioVictoria);
				Clip.open(audioStream);
				Clip.loop(100);
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
		}
		
		if(CancionReproducir.equals(CANCION_CAMPAÑA_TEMA)) {
			try {
				audioStream = AudioSystem.getAudioInputStream(AudioCampañaTema);
				Clip.open(audioStream);
				Clip.start();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
		}
	}
	
	//Parar Cancion
	public void PararAudio() {
		Clip.stop();
		Clip.close();
	}
	
	public void AbrirAudio() {
		try {
			Clip.open();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		}
	}
}
