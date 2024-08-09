import java.util.Scanner;

public class SalaDeJugar {
	private static final String GANAR = "1";
	private static final String PERDER = "2";
	
	Scanner scanner;
	
	SalaDeJugar(){
		scanner = new Scanner(System.in);
	}
	
	public void IniciarSalaDeJugar() {
		Boolean JugadorPerdio = false;
		String Respuesta = "hola";
		
		while(JugadorPerdio == false) {
			Utilidades.limpiarPantalla();
			
			System.out.println("Bueno dias,esta es la sala de Jugar");
			System.out.println("Lamentablemente,aun no esta terminado el juego");
			System.out.println("Supongamos que esta listo :D");
			System.out.println("Dugame,usted gano o perdio?");
			System.out.println("1.Gane wiiiiiiiiii :D");
			System.out.println("2.oh no hermano perdi D:");
			
			Respuesta = scanner.nextLine();
			
			if (Respuesta.equals(GANAR)) {
				Utilidades.limpiarPantalla();
				
				System.out.println("Excelente au au auuuuuuuuuuu");
				System.out.println("Usted volvera a jugar");
				System.out.println("Presione cualquier tecla para continuar");
				scanner.nextLine();
			}
			
			if (Respuesta.equals(PERDER)) {
				Utilidades.limpiarPantalla();
				
				System.out.println("Chales,voy a tener que regresarte chavalo");
				System.out.println("Presione cualquier tecla para continuar");
				JugadorPerdio = true;
				scanner.nextLine();
			}
		}
	}
}
