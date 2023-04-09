package tp.logic;

public class Player {
	private String name;
	private int score;
	private String level;
	
	//contructor utilizado para la creacion de un jugador nuevo que debe calcularse su puntaje
	public Player(String nombre, int puntaje, String nivel) {
		this.name = nombre;
		if (nivel.equals("intermedio")) {
			puntaje = puntaje * 2;	
		}
		if (nivel.equals("experto")) {
			puntaje = puntaje * 3;	
		}
		this.score = puntaje;
		this.level = nivel;
	}
	//contructor utilizado para el recupero y ordenamiento de los jugadores guardados que ya tienen
	//su puntaje calculado anteriormente
	public Player() {
	}

	public String getLevel() {
		return level;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setLevel(String level) {
		this.level = level;
	}

}
