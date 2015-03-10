import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class passwordListener implements ActionListener {

	Client_Password_Service service = new Client_Password_Service();
	private static final String passwordValidation = 
           "((?=.*\\d)(?=.*[a-zA-Z]).{6,10})";
	
	// (?=.*\\d) # must contains one digit from 0-9
	// I changed to (?=.*[a-zA-Z-0-9]) will check for any letter and number 0-9
	// ?= –> means apply the assertion condition, meaningless by itself, always work with other combination
	
	private Pattern pattern;
	private Matcher match; 
	
	private String passwordString;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String password = Password_Panel.passwordfield.getText();
		service.setPassword(password);
		
		passwordString = service.getPassword();
		
		validate(passwordString);
		
		if(validate(passwordString) == true)
		{
			Password_Panel.passwordfield.setBorder(Borders.blackline);
		}
		else if (validate(passwordString) == false)
		{
			Password_Panel.passwordfield.setBorder(Borders.redline);
		}
		
		
	}
	
	public passwordListener() {
		pattern = Pattern.compile(passwordValidation);
	}
	
	public boolean validate(final String password){
		 
		  match = pattern.matcher(passwordString); // Will match the string against the pattern 
		  return match.matches(); // This is a boolean 

	  }
	
}
