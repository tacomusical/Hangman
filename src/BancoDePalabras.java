import java.util.Scanner;

public class BancoDePalabras {
	private static final String FACIL = "1";
	private static final Object MEDIO = "2";
	private static final Object DIFICIL = "3";
	
	Scanner scanner;
	
	BancoDePalabras(){
		// Declarar las listas de palabaras como miembros de una iglesia privados de la clase.
		// Inicializar el valor de dicchas listas en el constructor.
		scanner = new Scanner(System.in);
		
	}

	public String[] EscogerBancoDePalabras(String Escoger) {
		String[] PalabrasRetornar = null;
		
		String[] listaPalabrasFacil = {
			    "agua", "amor", "ara�a", "arco", "avion", "bala", "barco", "bola", "cama", "casa",
			    "cielo", "cola", "dama", "delfin", "dios", "duna", "espada", "flor", "gato", "gota",
			    "hoja", "huevo", "iglu", "isla", "lago", "luna", "luz", "moto", "nieve", "nube",
			    "onda", "paso", "pato", "pelo", "pez", "piedra", "pino", "puma", "pu�o", "rama",
			    "roca", "rosa", "seda", "soga", "sol", "tela", "tren", "tuna", "uno", "uva",
			    "vino", "agua", "amor", "ara�a", "arco", "avion", "bala", "barco", "bola", "cama",
			    "casa", "cielo", "cola", "dama", "delfin", "dios", "duna", "espada", "flor", "gato",
			    "gota", "hoja", "huevo", "iglu", "isla", "lago", "luna", "luz", "moto", "nieve",
			    "nube", "onda", "paso", "pato", "pelo", "pez", "piedra", "pino", "puma", "pu�o",
			    "rama", "roca", "rosa", "seda", "soga", "sol", "tela", "tren", "tuna", "uno",
			    "uva", "vino"
		};
		
		String[] listaPalabrasMedio = {
			    "computadora", "proyecto", "relojero", "estudiante", "elefante", "camioneta", "monta�a", "chocolate", "luminoso", "biblioteca",
			    "escalera", "violencia", "maquinaria", "guitarra", "tel�fono", "cultura", "comida", "sociedad", "arquitecto", "construcci�n",
			    "preparaci�n", "informaci�n", "aventura", "explorador", "sorprendente", "creatividad", "independencia", "fotograf�a", "imaginaci�n", "computadora",
			    "tecnolog�a", "desarrollo", "universidad", "inteligencia", "investigaci�n", "programaci�n", "plataforma", "marketing", "inspiraci�n", "celebraci�n",
			    "organizaci�n", "prosperidad", "tradicional", "instituci�n", "naturaleza", "extraterrestre", "intergal�ctico", "matem�ticas", "continental", "continente",
			    "anticuado", "importante", "inform�tico", "descubrimiento", "cient�fico", "filosof�a", "complicado", "contrase�a", "establecimiento", "experimento",
			    "festividad", "generosidad", "institucional", "laboratorio", "libertad", "naturaleza", "observatorio", "organizaci�n", "satisfacci�n", "tecnol�gico",
			    "transformaci�n", "trascendental", "verdaderamente", "congratulaciones", "incomunicaci�n", "independencia", "infinitamente", "microsc�pico", "organizaci�n", "responsabilidad",
			    "supernatural", "desarrollador", "extraordinario", "independiente", "informaci�n", "inteligentemente", "microbiolog�a", "revolucionario", "trascendental", "inconformidad",
			    "fundamental", "polarizaci�n", "racionalidad", "responsabilidad", "simult�neamente", "solucionador", "tecnol�gicamente", "unidimensional", "utilizaci�n", "desarrollador"
		};
		
		String[] listaPalabrasDificil = {
			    "bicicletas", "computadora", "elefante", "experimento", "imaginacion", "independencia", "inteligencia", "investigacion", "laboratorio", "libertad",
			    "microbiologia", "organizacion", "responsabilidad", "supernatural", "trascendental", "inconformidad", "fundamental", "polarizacion", "racionalidad", "responsabilidad",
			    "simultaneamente", "solucionador", "tecnologicamente", "unidimensional", "utilizacion", "desarrollador", "extraordinario", "independiente", "inteligentemente", "microscopico",
			    "organizacion", "responsabilidad", "supernatural", "trascendental", "inconformidad", "fundamental", "polarizacion", "racionalidad", "responsabilidad", "simultaneamente",
			    "solucionador", "tecnologicamente", "unidimensional", "utilizacion", "desarrollador", "extraordinario", "independiente", "inteligentemente", "microscopico", "organizacion",
			    "responsabilidad", "supernatural", "trascendental", "inconformidad", "fundamental", "polarizacion", "racionalidad", "responsabilidad", "simultaneamente", "solucionador",
			    "tecnologicamente", "unidimensional", "utilizacion", "desarrollador", "extraordinario", "independiente", "inteligentemente", "microscopico", "organizacion", "responsabilidad",
			    "supernatural", "trascendental", "inconformidad", "fundamental", "polarizacion", "racionalidad", "responsabilidad", "simultaneamente", "solucionador", "tecnologicamente", 
			    "unidimensional", "utilizacion", "desarrollador", "extraordinario", "independiente", "inteligentemente", "microscopico", "organizacion", "responsabilidad", "supernatural", 
			    "trascendental", "inconformidad", "fundamental", "polarizacion", "racionalidad", "responsabilidad", "simultaneamente", "solucionador", "tecnologicamente", "unidimensional", 
			    "utilizacion"
		};
		
		PalabrasRetornar = listaPalabrasFacil;
		
		if(Escoger.equals(FACIL)) {
			PalabrasRetornar = listaPalabrasFacil;
		}
		
		if(Escoger.equals(MEDIO)) {
			PalabrasRetornar = listaPalabrasMedio;
		}
		
		if(Escoger.equals(DIFICIL)) {
			PalabrasRetornar = listaPalabrasDificil;
		}
		return PalabrasRetornar;
	}
	
}
