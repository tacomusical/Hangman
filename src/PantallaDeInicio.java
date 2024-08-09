import java.util.Scanner;

public class PantallaDeInicio {
	//Definimos Constantes
	private static final String JUGAR = "1";
	private static final String CAMPAÑA = "2";
	private static final String CREDITOS = "3";
	private static final String SALIR = "4";
	
	//Definimos miembros
	private Scanner scanner;
	private SalaDeJugar SalaDeJugar;
	private SalaDeCampaña SalaDeCampaña;
	private SalaDeCreditos SalaDeCreditos;
	private Salir Salir;
	private Animaciones Animaciones;
	private ControlDeAudio Audio;
	
	
	PantallaDeInicio(){
		scanner = new Scanner(System.in);
		SalaDeJugar = new SalaDeJugar();
		SalaDeCampaña = new SalaDeCampaña();
		SalaDeCreditos = new SalaDeCreditos();
		Salir = new Salir();
		Animaciones = new Animaciones();
		Audio = new ControlDeAudio();
	}
	
	//Loop Principal
	public void MostrarPantallaDeInicio() {
		String Opcion = "";

		while(Opcion != SALIR) {
			Audio.PararAudio();
			Audio.ReproducirAudioLoop(Audio.CANCION_DE_MENU);
			
			Utilidades.limpiarPantalla();
			
			Animaciones.MenuAnimacion();
			
			Opcion = scanner.nextLine();
			
			Audio.PararAudio();
			
			switch(Opcion) {
			case JUGAR:
				SalaDeJugar.IniciarSalaDeJugar();
				break;
			case CAMPAÑA: 
				SalaDeCampaña.IniciarSalaDeCampaña();
				break;
			case CREDITOS:
				SalaDeCreditos.IniciarSalaDeCreditos();
				break;
			case SALIR:
				Salir.CerrarPrograma();
				Audio.PararAudio();
				Audio.PararAudio();
				Opcion = SALIR;
				break;
			}		
		}
	}
}
