import java.util.Scanner;

public class SalaDeCampa�a {
	private ControlDeAudio Audio;
	private Scanner scanner;
	
	SalaDeCampa�a(){
		scanner = new Scanner(System.in);
		Audio = new ControlDeAudio();
	}
	
	public void IniciarSalaDeCampa�a() {
		Audio.PararAudio();
		Audio.ReproducirAudioLoop(Audio.CANCION_CAMPA�A_TEMA);
		Utilidades.CargarFrame("Screens/PantallaCampa�a.txt");
		scanner.nextLine();
		Audio.PararAudio();
	}
}
