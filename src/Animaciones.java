import java.util.Timer;
import java.util.TimerTask;

public class Animaciones {

	Timer timer;
	
	Animaciones(){
		timer = new Timer();
	}
	
	public void CerrarAnimacion() {
		timer.cancel();
	}
	
	//Creamos Frame Para Ser LLamado N Veces
	public TimerTask Frame(String NombreFrame) {
		TimerTask Frame = new TimerTask() {
			public void run() {
				Utilidades.limpiarPantalla();
				Utilidades.CargarFrame(NombreFrame);
			}
		};
		return Frame;
	}
	
	public void MenuAnimacion() {
		timer.schedule(Frame("animations/menu_animations/Frame 1.txt"), 1000);
		timer.schedule(Frame("animations/menu_animations/Frame 2.txt"), 1200);
		timer.schedule(Frame("animations/menu_animations/Frame 3.txt"), 1400);
		timer.schedule(Frame("animations/menu_animations/Frame 4.txt"), 1600);
		timer.schedule(Frame("animations/menu_animations/Frame 5.txt"), 2000);
		timer.schedule(Frame("animations/menu_animations/Frame 6.txt"), 2200);
		timer.schedule(Frame("animations/menu_animations/Frame 7.txt"), 2400);
		timer.schedule(Frame("animations/menu_animations/Frame 8.txt"), 2600);
	}
	
	public void JuegoAnimacion() {
		timer.schedule(Frame("animations/game_animations/Frame 1.txt"), 01);
		timer.schedule(Frame("animations/game_animations/Frame 0.txt"), 05);
		timer.schedule(Frame("animations/game_animations/Frame 1.txt"), 10);
		timer.schedule(Frame("animations/game_animations/Frame 0.txt"), 15);
		timer.schedule(Frame("animations/game_animations/Frame 2.txt"), 20);
		timer.schedule(Frame("animations/game_animations/Frame 0.txt"), 25);
		timer.schedule(Frame("animations/game_animations/Frame 2.txt"), 30);
		timer.schedule(Frame("animations/game_animations/Frame 0.txt"), 35);
		timer.schedule(Frame("animations/game_animations/Frame 2.txt"), 40);
	}
	
	public void MuerteAnimacion() {
		timer.schedule(Frame("animations/dead_animation/Frame 1.txt"), 1020);
		timer.schedule(Frame("animations/dead_animation/Frame 2.txt"), 1025);
		timer.schedule(Frame("animations/dead_animation/Frame 3.txt"), 1030);
		timer.schedule(Frame("animations/dead_animation/Frame 4.txt"), 1035);
		timer.schedule(Frame("animations/dead_animation/Frame 5.txt"), 1040);
		timer.schedule(Frame("animations/dead_animation/Frame 6.txt"), 1045);
		timer.schedule(Frame("animations/dead_animation/Frame 7.txt"), 1050);
		timer.schedule(Frame("animations/dead_animation/Frame 8.txt"), 1055);
		timer.schedule(Frame("animations/dead_animation/Frame 9.txt"), 1060);
		timer.schedule(Frame("animations/dead_animation/Frame 10.txt"), 1065);
		timer.schedule(Frame("animations/dead_animation/Frame 11.txt"), 1100);
		timer.schedule(Frame("animations/dead_animation/Frame 12.txt"), 1120);
		timer.schedule(Frame("animations/dead_animation/Frame 13.txt"), 1140);
		timer.schedule(Frame("animations/dead_animation/Frame 14.txt"), 1160);
		timer.schedule(Frame("animations/dead_animation/Frame 15.txt"), 1180);
		timer.schedule(Frame("animations/dead_animation/Frame 16.txt"), 1200);
	}
}
