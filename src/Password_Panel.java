import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Password_Panel extends JPanel {
	
	public static JTextField passwordfield;
	public static JTextField confirmfield;
	
	private JLabel password = new JLabel("Password");

	public Password_Panel()
	{
		setLayout(null);
		
		password.setBounds(getX() + 170,getY() + 80, 200,20);
		
		passwordfield = new JTextField();
		passwordfield.setText("Password");
		passwordfield.setBounds(getX() + 100,getY() + 100, 200,20);
		passwordfield.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		add(password);
		add(passwordfield);
	}
}
