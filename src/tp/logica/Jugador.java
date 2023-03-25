package tp.logica;

public class Jugador {
	private String nombre;
	private int puntaje;
	private String nivel;

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
		this.nivel = nivel;
	}

	public String getNivel() {
		return nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPuntaje() {
		return puntaje;
	}

}
