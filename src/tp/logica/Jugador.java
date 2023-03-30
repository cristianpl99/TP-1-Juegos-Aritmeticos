package tp.logica;

public class Jugador {
	private String nombre;
	private int puntaje;
	private String nivelElegido;

	public Jugador(String nombre, int puntaje, String nivel) {
		this.nombre = nombre;
		//pensar si esta bien el bonus de puntaje
		if (nivel.equals("intermedio")) {
			puntaje = puntaje * 2;	
		}
		if (nivel.equals("experto")) {
			puntaje = puntaje * 3;	
		}
		this.puntaje = puntaje;
		this.nivelElegido = nivel;
	}

	public String getNivelElegido() {
		return nivelElegido;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPuntaje() {
		return puntaje;
	}

}
