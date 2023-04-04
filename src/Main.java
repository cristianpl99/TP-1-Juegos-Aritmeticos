import javax.swing.UIManager;


import tp.igu.StartScreen;

public class Main {

	public static void main(String[] args) {
		try {
			
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		 } catch(Exception e){
	            System.out.println(e);
	        }
		StartScreen launch = new StartScreen();
		launch.setResizable(false);
		launch.setVisible(true);
		launch.setLocationRelativeTo(null);
	}
}
