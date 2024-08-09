import java.util.Timer;
import java.util.TimerTask;

public class Animaciones {

	Timer timer;
	
	Animaciones(){
		timer = new Timer();
	}
	//Nesesitamos cerrar el timer al final del programa
	public void CerrarAnimacion() {
		timer.cancel();
	}
	
	public void Menu() {
		TimerTask FrameUno = new TimerTask() {
			public void run() {
				Utilidades.limpiarPantalla();
				Utilidades.CargarFrame("Frame 1.txt");
			}
		};
		
		TimerTask FrameDos = new TimerTask() {
			public void run() {
				Utilidades.limpiarPantalla();
				Utilidades.CargarFrame("Frame 2.txt");
			}
		};
		
		TimerTask FrameTres = new TimerTask() {
			public void run() {
				Utilidades.limpiarPantalla();
				Utilidades.CargarFrame("Frame 3.txt");
			}
		};
		
		TimerTask FrameCuatro = new TimerTask() {
			public void run() {
				Utilidades.limpiarPantalla();
				Utilidades.CargarFrame("Frame 4.txt");
			}
		};
		
		TimerTask FrameCinco = new TimerTask() {
			public void run() {
				Utilidades.limpiarPantalla();
				Utilidades.CargarFrame("Frame 5.txt");
			}
		};
		
		TimerTask FrameSeis = new TimerTask() {
			public void run() {
				Utilidades.limpiarPantalla();
				Utilidades.CargarFrame("Frame 6.txt");
			}
		};
		
		TimerTask FrameSiete = new TimerTask() {
			public void run() {
				Utilidades.limpiarPantalla();
				Utilidades.CargarFrame("Frame 7.txt");
			}
		};
		
		timer.schedule(FrameUno, 1000);
		timer.schedule(FrameDos, 1500);
		timer.schedule(FrameTres, 2000);
		timer.schedule(FrameCuatro, 2500);
		timer.schedule(FrameCinco, 3000);
		timer.schedule(FrameSeis, 3500);
		timer.schedule(FrameSiete, 4000);
	}
}
