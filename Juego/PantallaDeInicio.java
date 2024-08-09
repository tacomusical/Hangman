import java.util.Scanner;

public class PantallaDeInicio {
	private static final String JUGAR = "1";
	private static final String CAMPA�A = "2";
	private static final String CREDITOS = "3";
	private static final String SALIR = "4";
	
	Scanner scanner;
	SalaDeJugar SalaDeJugar;
	SalaDeCampa�a SalaDeCampa�a;
	SalaDeCreditos SalaDeCreditos;
	Salir Salir;
	Animaciones Animaciones;
	ControlDeAudio Audio;
	
	PantallaDeInicio(){
		scanner = new Scanner(System.in);
		SalaDeJugar = new SalaDeJugar();
		SalaDeCampa�a = new SalaDeCampa�a();
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
			case CAMPA�A: 
				Audio.ReproducirTemaMenu("NoReproducir");
				SalaDeCampa�a.IniciarSalaDeCampa�a();
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
