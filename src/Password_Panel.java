import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Password_Panel extends JPanel {
	
	public static JTextField passwordfield;
	public static JTextField confirmfield;
	
	public static JButton submitButton;
	
	private JLabel password = new JLabel("Password");

	public Password_Panel()
	{
		setLayout(null);
		
		password.setBounds(getX() + 170,getY() + 80, 200,20);
		
		passwordfield = new JTextField();
		passwordfield.setBounds(getX() + 100,getY() + 100, 200,20);
		passwordfield.setFocusable(false);
		passwordfield.setBorder(Borders.blackline);
		passwordfield.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				passwordfield.setFocusable(true);

			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordfield.setFocusable(true);
				passwordfield.setBorder(Borders.blackline);

			}
		});
		
	
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				passwordfield.setFocusable(false);
				
			}
		});
		
		submitButton = new JButton("Submit");
		submitButton.setBounds(getX() + 155 , getY() + 130, 100,30);
		submitButton.addActionListener(new passwordListener());
		
		add(submitButton);
		add(password);
		add(passwordfield);
	}
}
