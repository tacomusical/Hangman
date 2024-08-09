import java.util.Scanner;

public class PantallaDeInicio {
	private static final String JUGAR = "1";
	private static final String CAMPAÑA = "2";
	private static final String CREDITOS = "3";
	private static final String SALIR = "4";
	
	Scanner scanner;
	SalaDeJugar SalaDeJugar;
	SalaDeCampaña SalaDeCampaña;
	SalaDeCreditos SalaDeCreditos;
	Salir Salir;
	Animaciones Animaciones;
	ControlDeAudio Audio;
	
	PantallaDeInicio(){
		scanner = new Scanner(System.in);
		SalaDeJugar = new SalaDeJugar();
		SalaDeCampaña = new SalaDeCampaña();
		SalaDeCreditos = new SalaDeCreditos();
		Salir = new Salir();
		Animaciones = new Animaciones();
		Audio = new ControlDeAudio();
	}
	
	public void MostrarPantallaDeInicio() {
		String Opcion = "";

		while(Opcion != SALIR) {
			Audio.ReproducirTemaMenu("NoReproducir");
			Audio.ReproducirTemaMenu("Reproducir");
			
			Utilidades.limpiarPantalla();
			
			Animaciones.Menu();
			
			Opcion = scanner.nextLine();
			
			switch(Opcion) {
			case JUGAR:
				Audio.ReproducirTemaMenu("NoReproducir");
				SalaDeJugar.IniciarSalaDeJugar();
				break;
			case CAMPAÑA: 
				Audio.ReproducirTemaMenu("NoReproducir");
				SalaDeCampaña.IniciarSalaDeCampaña();
				break;
			case CREDITOS:
				Audio.ReproducirTemaMenu("NoReproducir");
				SalaDeCreditos.IniciarSalaDeCreditos();
				break;
			case SALIR:
				Audio.ReproducirTemaMenu("NoReproducir");
				//Salir.CerrarPrograma();
				Opcion = SALIR;
				break;
			}		
		}
	}
}
