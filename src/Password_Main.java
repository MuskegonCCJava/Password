import java.awt.EventQueue;

import javax.swing.JFrame;


public class Password_Main extends  JFrame{
	
	public static int width = 400;
	public static int height = 400;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Password_Main frame = new Password_Main();
				frame.setVisible(true);
				// added a comment for demonstration
				
			}
		});

	}
	
	public Password_Main()
	{
		Password_Panel panel = new Password_Panel();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width, height);
		setLocationRelativeTo(null);
		
		add(panel);
		
	}

}
