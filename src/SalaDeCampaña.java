import java.util.Scanner;

public class SalaDeCampaņa {
	private ControlDeAudio Audio;
	private Scanner scanner;
	
	SalaDeCampaņa(){
		scanner = new Scanner(System.in);
		Audio = new ControlDeAudio();
	}
	
	public void IniciarSalaDeCampaņa() {
		Audio.PararAudio();
		Audio.ReproducirAudioLoop(Audio.CANCION_CAMPAŅA_TEMA);
		Utilidades.CargarFrame("Screens/PantallaCampaņa.txt");
		scanner.nextLine();
		Audio.PararAudio();
	}
}
