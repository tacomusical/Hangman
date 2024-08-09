
public class Salir {
	Animaciones Animaciones;
	ControlDeAudio Audio;
	
	Salir(){
		Animaciones = new Animaciones();
		Audio = new ControlDeAudio();
	}
	
	public void CerrarPrograma() {
		Animaciones.CerrarAnimacion();
		//Audio.ReproducirTemaMenu("NoReproducir");
	}
	
}
