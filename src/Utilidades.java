import java.io.FileReader;
import java.io.IOException;

public class Utilidades {
	//ESTA la limpia
	public static void limpiarPantalla() {
		// Esta también.
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void CargarFrame(String Frame) {
		try {
			FileReader reader;
			reader = new FileReader(Frame);
			int data = reader.read();
			while (data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
		}
		catch (IOException e) {
		}	
	}
}
