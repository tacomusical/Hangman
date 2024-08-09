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
			    "agua", "amor", "araña", "arco", "avion", "bala", "barco", "bola", "cama", "casa",
			    "cielo", "cola", "dama", "delfin", "dios", "duna", "espada", "flor", "gato", "gota",
			    "hoja", "huevo", "iglu", "isla", "lago", "luna", "luz", "moto", "nieve", "nube",
			    "onda", "paso", "pato", "pelo", "pez", "piedra", "pino", "puma", "puño", "rama",
			    "roca", "rosa", "seda", "soga", "sol", "tela", "tren", "tuna", "uno", "uva",
			    "vino", "agua", "amor", "araña", "arco", "avion", "bala", "barco", "bola", "cama",
			    "casa", "cielo", "cola", "dama", "delfin", "dios", "duna", "espada", "flor", "gato",
			    "gota", "hoja", "huevo", "iglu", "isla", "lago", "luna", "luz", "moto", "nieve",
			    "nube", "onda", "paso", "pato", "pelo", "pez", "piedra", "pino", "puma", "puño",
			    "rama", "roca", "rosa", "seda", "soga", "sol", "tela", "tren", "tuna", "uno",
			    "uva", "vino"
		};
		
		String[] listaPalabrasMedio = {
			    "computadora", "proyecto", "relojero", "estudiante", "elefante", "camioneta", "montaña", "chocolate", "luminoso", "biblioteca",
			    "escalera", "violencia", "maquinaria", "guitarra", "teléfono", "cultura", "comida", "sociedad", "arquitecto", "construcción",
			    "preparación", "información", "aventura", "explorador", "sorprendente", "creatividad", "independencia", "fotografía", "imaginación", "computadora",
			    "tecnología", "desarrollo", "universidad", "inteligencia", "investigación", "programación", "plataforma", "marketing", "inspiración", "celebración",
			    "organización", "prosperidad", "tradicional", "institución", "naturaleza", "extraterrestre", "intergaláctico", "matemáticas", "continental", "continente",
			    "anticuado", "importante", "informático", "descubrimiento", "científico", "filosofía", "complicado", "contraseña", "establecimiento", "experimento",
			    "festividad", "generosidad", "institucional", "laboratorio", "libertad", "naturaleza", "observatorio", "organización", "satisfacción", "tecnológico",
			    "transformación", "trascendental", "verdaderamente", "congratulaciones", "incomunicación", "independencia", "infinitamente", "microscópico", "organización", "responsabilidad",
			    "supernatural", "desarrollador", "extraordinario", "independiente", "información", "inteligentemente", "microbiología", "revolucionario", "trascendental", "inconformidad",
			    "fundamental", "polarización", "racionalidad", "responsabilidad", "simultáneamente", "solucionador", "tecnológicamente", "unidimensional", "utilización", "desarrollador"
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
