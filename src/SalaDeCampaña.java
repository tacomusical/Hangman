import java.util.Scanner;

public class SalaDeCampaña {
	private ControlDeAudio Audio;
	private Scanner scanner;
	
	SalaDeCampaña(){
		scanner = new Scanner(System.in);
		Audio = new ControlDeAudio();
	}
	
	public void IniciarSalaDeCampaña() {
		Audio.PararAudio();
		Audio.ReproducirAudioLoop(Audio.CANCION_CAMPAÑA_TEMA);
		Utilidades.CargarFrame("Screens/PantallaCampaña.txt");
		scanner.nextLine();
		Audio.PararAudio();
	}
}
