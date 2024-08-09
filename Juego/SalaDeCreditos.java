import java.util.Scanner;

public class SalaDeCreditos {
	Scanner scanner;
	
	SalaDeCreditos(){
		scanner = new Scanner(System.in);
	}
	
	public void IniciarSalaDeCreditos() {
		Utilidades.limpiarPantalla();
		System.out.println("Estos son los creditos au au auuuu");
		scanner.nextLine();
	}
	
}
