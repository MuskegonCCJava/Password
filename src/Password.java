import java.awt.EventQueue;

import javax.swing.JFrame;


public class Password extends  JFrame{
	
	public static int width = 400;
	public static int height = 400;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Password frame = new Password();
				frame.setVisible(true);
				
			}
		});

	}
	
	public Password()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width, height);
		setLocationRelativeTo(null);
	}

}
