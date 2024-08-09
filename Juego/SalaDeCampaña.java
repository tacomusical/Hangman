import java.util.Scanner;

public class SalaDeCampaña {
	private static final String NIVEL_1 = "1";
	private static final String NIVEL_2 = "2";
	private static final String NIVEL_3 = "3";
	private static final String NIVEL_4 = "4";
	private static final String NIVEL_5 = "5";
	
	Scanner scanner;
	
	SalaDeCampaña(){
		scanner = new Scanner(System.in);
	}
	
	public void IniciarSalaDeCampaña() {
		String Respuesta = "0";
		
		Utilidades.limpiarPantalla();
		
		System.out.println("Buenos dias a la campaña,por favor escoga el nivel que quiere jugar");
		System.out.println("1.nivel 1");
		System.out.println("2.nivel 2");
		System.out.println("3.nivel 3");
		System.out.println("4.nivel 4");
		System.out.println("5.nivel 5");
			
		Respuesta = scanner.nextLine();
			
		switch(Respuesta) {
		case NIVEL_1:
			System.out.println("Estas jugando el nivel 1");
			System.out.println("Dime,lograste ganar?");
			System.out.println("1.Gane¡¡¡¡¡¡¡¡¡¡¡");
			System.out.println("2.N-NO LOGRE CHAMBEAR");
			scanner.nextLine();
			Utilidades.limpiarPantalla();
			System.out.println("No Importa si gano o perdio,Usted debera volver al menu principal");
			scanner.nextLine();
		break;
			
		case NIVEL_2:
			System.out.println("Estas jugando el nivel 2");
			System.out.println("Dime,lograste ganar?");
			System.out.println("1.Gane¡¡¡¡¡¡¡¡¡¡¡");
			System.out.println("2.N-NO LOGRE CHAMBEAR");
			scanner.nextLine();
			Utilidades.limpiarPantalla();
			System.out.println("No Importa si gano o perdio,Usted debera volver al menu principal");
			scanner.nextLine();
		break;
			
		case NIVEL_3:
			System.out.println("Estas jugando el nivel 3");
			System.out.println("Dime,lograste ganar?");
			System.out.println("1.Gane¡¡¡¡¡¡¡¡¡¡¡");
			System.out.println("2.N-NO LOGRE CHAMBEAR");
			scanner.nextLine();
			Utilidades.limpiarPantalla();
			System.out.println("No Importa si gano o perdio,Usted debera volver al menu principal");
			scanner.nextLine();
		break;
		
		case NIVEL_4:
			System.out.println("Estas jugando el nivel 4");
			System.out.println("Dime,lograste ganar?");
			System.out.println("1.Gane¡¡¡¡¡¡¡¡¡¡¡");
			System.out.println("2.N-NO LOGRE CHAMBEAR");
			scanner.nextLine();
			Utilidades.limpiarPantalla();
			System.out.println("No Importa si gano o perdio,Usted debera volver al menu principal");
			scanner.nextLine();
		break;
		
		case NIVEL_5:
			System.out.println("Estas jugando el nivel 5");
			System.out.println("Dime,lograste ganar?");
			System.out.println("1.Gane¡¡¡¡¡¡¡¡¡¡¡");
			System.out.println("2.N-NO LOGRE CHAMBEAR");
			scanner.nextLine();
			Utilidades.limpiarPantalla();
			System.out.println("No Importa si gano o perdio,Usted debera volver al menu principal");
			scanner.nextLine();
		break;
		}
	}
}
