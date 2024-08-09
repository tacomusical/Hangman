import java.io.FileReader;
import java.io.IOException;

public class Utilidades {

	public static void limpiarPantalla() {
		for(int i=0; i<=200; i++) {
			System.out.println();
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
