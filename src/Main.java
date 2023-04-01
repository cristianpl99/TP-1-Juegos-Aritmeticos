import javax.swing.UIManager;


import tp.igu.Inicio;

public class Main {

	public static void main(String[] args) {
		try {
			
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		 } catch(Exception e){
	            System.out.println(e);
	        }
		Inicio inicio = new Inicio();
		inicio.setResizable(false);
		inicio.setVisible(true);
		inicio.setLocationRelativeTo(null);
	}
}
