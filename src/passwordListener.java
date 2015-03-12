//	passwordListener.java by Kyle Wolff and Brandon VanderMey on 3/12/2015

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;



public class passwordListener implements ActionListener {

	Client_Password_Service service = new Client_Password_Service();
	private static final String passwordValidation = "((?=.*\\d)(?=.*[a-zA-Z]).{6,10})";
	
	// Regex
	// (?=.*\\d) # must contains one digit from 0-9
	// I changed to (?=.*[a-zA-Z-0-9]) will check for any letter and number 0-9
	// ?= –> means apply the assertion condition, meaningless by itself, always work with other combination
	
	private Pattern pattern;
	private Matcher match; 
	
	private String passwordString;
	private String confirmString;
			
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == Password_Panel.submitButton)
			{
		
				String password = Password_Panel.passwordfield.getText();
				service.setPassword(password); 
				
				passwordString = service.getPassword();
				
				validate(passwordString);
				
				String confirmPassword = Password_Panel.confirmfield.getText();
				service.setConfirmpassword(confirmPassword);
				
				confirmString = service.getConfirmpassword();
				
				if(validate(passwordString) == true)
					{
						Password_Panel.password.setBounds(170, 80, 200, 20);
						Password_Panel.passwordfield.setBorder(Borders.blackline);
					 	Password_Panel.errorMessage.setVisible(false);

					}
				else if (validate(passwordString) == false || passwordString.isEmpty())
					{
					 	errorMessages errorMessages = new errorMessages(validate(passwordString));
					 	Password_Panel.errorMessage.setText(errorMessages.getErrorMessage());
					 	Password_Panel.errorMessage.setVisible(true);
						Password_Panel.password.setBounds(170, 25, 200,20);
						Password_Panel.errorMessage.setBounds(90,35, 400,80);
						Password_Panel.passwordfield.setBorder(Borders.redline);
					}
				
				if(confirmString.isEmpty())
					{
						// Do nothing 
						Password_Panel.confirmfield.setBorder(Borders.blackline);
						
						if(validate(passwordString) == true)
						{
							Password_Panel.confirmfield.setBorder(Borders.redline);
							errorMessages errorMessages = new errorMessages(validate(passwordString),confirmString.isEmpty(),Password_Panel.confirmfield.getBorder() );
							Password_Panel.errorMessage.setText(errorMessages.getErrorMessage());
							Password_Panel.password.setBounds(170, 45, 200,20);
						 	Password_Panel.errorMessage.setVisible(true);
						 	Password_Panel.errorMessage.setBounds(60,35, 400,80);
						}

					}
				else if(!confirmString.equals(passwordString))
					{
						Password_Panel.confirmfield.setBorder(Borders.redline);
						errorMessages errorMessages = new errorMessages(validate(passwordString), confirmString.equals(passwordString));
						Password_Panel.errorMessage.setText(errorMessages.getErrorMessage());
					 	Password_Panel.errorMessage.setVisible(true);
					 	Password_Panel.password.setBounds(170, 25, 200,20);
						Password_Panel.errorMessage.setBounds(90,35, 400,80);

					}
				else if(confirmString.equals(passwordString))
					{
						Password_Panel.confirmfield.setBorder(Borders.blackline);
					}
				
				if(passwordString.equals(confirmString) && (!passwordString.isEmpty()))
					{
						JOptionPane.showMessageDialog(null,"<html><center>Passwords Match</center></html>","Passed", JOptionPane.INFORMATION_MESSAGE);
					}
				
				}
			}
	
	public passwordListener() {
		pattern = Pattern.compile(passwordValidation);
	}
	
	public boolean validate(final String password){
		 
		  match = pattern.matcher(password); // Will match the string against the pattern 
		  return match.matches(); // This is a boolean 

	  }
	
}
