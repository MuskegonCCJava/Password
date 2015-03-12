import java.awt.EventQueue;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Password_Main extends  JFrame{
	
	public static int width = 400;
	public static int height = 400;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				Password_Main frame = new Password_Main();
				frame.setVisible(true);
				
			}
		});

	}
	
	public Password_Main()
	{
		Date todaysDate = new Date();
		JOptionPane.showMessageDialog(null, ("Password program by Kyle Wolff and Brandon Vandermey " + todaysDate),"Date", JOptionPane.PLAIN_MESSAGE);
		
		
		Password_Panel panel = new Password_Panel();
		
		getRootPane().setDefaultButton(Password_Panel.submitButton);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width, height);
		setLocationRelativeTo(null);
		setResizable(false);
		
		add(panel);
		
	}

}
