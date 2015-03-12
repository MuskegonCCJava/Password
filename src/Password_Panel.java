import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Password_Panel extends JPanel {
	
	private static final Color color = Color.gray;
	public static JTextField passwordfield;
	public static JTextField confirmfield;
	
	public static JButton submitButton;
	
	public static JLabel password = new JLabel("Password");
	static JLabel errorMessage = new JLabel();
	
	private String passwordHint = "Password";
	
	private errorMessages error = new errorMessages();

	public Password_Panel()
	{
		setLayout(null);
		setBackground(Color.decode("#FFCC99"));
		
		password.setBounds(getX() + 170,getY() + 80, 200,20);
		
		passwordfield = new JTextField();
		passwordfield.setUI(new HintField(passwordHint, color));
		passwordfield.setBounds(getX() + 100,getY() + 100, 200,20);
		passwordfield.setEnabled(false);
		passwordfield.setBorder(Borders.blackline);
		passwordfield.addMouseListener(new mouseListener());
				
		confirmfield = new JTextField();
		confirmfield.setUI(new HintField("Confirm", color));
		confirmfield.setEnabled(false);
		confirmfield.setBounds(getX() + 100,getY() + 130, 200,20);
		confirmfield.setBorder(Borders.blackline);
		confirmfield.addMouseListener(new mouseListener());
	
		submitButton = new JButton("Submit");
		submitButton.setBounds(getX() + 155 , getY() + 180, 100,30);
		submitButton.addActionListener(new passwordListener());
		
		errorMessage.setBounds(90,35, 400,80);
		errorMessage.setForeground(Color.red);
		errorMessage.setVisible(false);
		
		add(errorMessage);
		add(submitButton);
		add(password);
		add(passwordfield);
		add(confirmfield);
		
		this.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e)
			{
				if(passwordfield.getText() == "Password" || passwordfield.getText().isEmpty() )
				{
					passwordfield.setEnabled(false);

				}
				else if(!(passwordfield.getText() == "Password" || passwordfield.getText().isEmpty() ))
				{
					passwordfield.setFocusable(false);
				}
				
				if(confirmfield.getText() == "Confirm" || confirmfield.getText().isEmpty())
				{
					confirmfield.setEnabled(false);
				}
				else if(!(confirmfield.getText() == "Confirm" || confirmfield.getText().isEmpty() ))
				{
					confirmfield.setFocusable(false);
				}
					

			}
		});
	
	}

	
}
