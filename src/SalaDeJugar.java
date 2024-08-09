import java.util.Random;
import java.util.Scanner;

public class SalaDeJugar {
	private static final int INTENTOS_MAXIMOS = 10;
	
	private Scanner scanner;
	private Random random;
	private BancoDePalabras EscogerBancoDePalabras;
	private ControlDeAudio Audio;
	private Animaciones Animaciones;
	
	SalaDeJugar(){
		scanner = new Scanner(System.in);
		random = new Random();
		EscogerBancoDePalabras = new BancoDePalabras();
		Audio = new ControlDeAudio();
		Animaciones = new Animaciones();
	}
	
	public void IniciarSalaDeJugar() {
		//Declaramos Variables que vamos a usar
		int intentos = 0;
		String PalabraSecreta = "";
		Boolean LetraFueAdivinada;
		char Respuesta;
		String[] BancoDePalabras = new String[100];
		
		//Mostramos reglas del juego y esperamos la dificultad a usar
		Audio.ReproducirAudioLoop(Audio.CANCION_REGLAS);
		Utilidades.CargarFrame("Screens/ReglasDelJuegoPantalla.txt");
		BancoDePalabras = EscogerBancoDePalabras.EscogerBancoDePalabras(scanner.next());
		
		//Eligiendo palabra
		Utilidades.limpiarPantalla();
		//Reemplazar el número mágico 100 por una constante
		PalabraSecreta = BancoDePalabras[random.nextInt(100)];
		char[] LetrasAdivinadas = new char[PalabraSecreta.length()];
		
		//mostramos la primera animacion
		Audio.PararAudio();
		Audio.ReproducirAudioLoop(Audio.CANCION_INICIAR_JUEGO);
		Animaciones.JuegoAnimacion();
		
		//seteamos la lista de letras donde adivinaremos
		for (int i=0; i<PalabraSecreta.length(); i++) {
			LetrasAdivinadas[i] = '_';
		}
		
		
		//loop principal
		while(intentos<INTENTOS_MAXIMOS) {
			Audio.AbrirAudio();
			
			//checamos en que intento esta nuestro jugador,para mostrar cuantas vidas le quedan
			if(intentos > 2) {
	        	Utilidades.CargarFrame("Screens/MonoPrimeraSeñal.txt");
	        }
			
			if(intentos > 4) {
	        	Utilidades.CargarFrame("Screens/MonoSegundaSeñal.txt");
	        }
			
			if(intentos > 6) {
	        	Utilidades.CargarFrame("Screens/MonoTerceraSeñal.txt");
	        }
			
			//preguntamos y adquirimos la letra que el usuario nos de
			System.out.println("Palabra: " + String.valueOf(LetrasAdivinadas));
			System.out.print("Ingrese una letra: ");
			Respuesta = scanner.next().charAt(0);	
			LetraFueAdivinada = false;
				
			//checamos si la letra que nos dio pertenece a alguna letra de la palabra
			for(int i=0; i<PalabraSecreta.length(); i++) {
				if(PalabraSecreta.charAt(i) == Respuesta) {
					LetrasAdivinadas[i] = Respuesta;
					LetraFueAdivinada = true;
				}
			}	
			
			//aumentamos el numero de intentos y regañamos al usuario si se equivoco en su letra
			//Contraer validación
			if (LetraFueAdivinada == false) {
		        intentos++;
		        System.out.println("¡Letra incorrecta! Intento " + intentos + "/" + INTENTOS_MAXIMOS);
	        }
			
			//felicitamos al usuario una vez que logro adivinar toda la palabra
			if (String.valueOf(LetrasAdivinadas).equals(PalabraSecreta)) {
		        System.out.println("¡Felicidades! Has adivinado la palabra: " + PalabraSecreta);
		        System.out.println("presiona cualquier tecla para continunar");
		        intentos = INTENTOS_MAXIMOS + 1;
		        scanner.nextLine();
		        Audio.PararAudio();
		        Audio.ReproducirAudioLoop(Audio.CANCION_VICTORIA);
		        Utilidades.CargarFrame("Screens/Victoria.txt");
		        scanner.next();
		    }
			
			
			//checamos si la alguna letra fue adivinada o no,para reproducir el audio adecuado
			if(LetraFueAdivinada) {
				Audio.PararAudio();
				Audio.ReproducirAudioLoop(Audio.CANCION_BUENA_LETRA);
			} else {
				Audio.PararAudio();
				Audio.ReproducirAudioLoop(Audio.CANCION_MALA_LETRA);
			}
		}
				
		//regañamos al usuario si vemos que todas sus oportunidades se ahn acabado
		if(intentos == INTENTOS_MAXIMOS) {
			Utilidades.CargarFrame("Screens/MonoCuartaSeñal.txt");
			System.out.println("Perdiste,la palabra es: " + PalabraSecreta);
			System.out.println("presiona cualquier tecla para continunar");
			scanner.nextLine();
			Audio.PararAudio();
			Audio.ReproducirAudioLoop(Audio.CANCION_MUERTE);
			Animaciones.MuerteAnimacion();
			scanner.next();
			Audio.PararAudio();		
		}	
	}
	
}
