import javax.swing.border.Border;


public class errorMessages {
	
	private String errorMessage;
	
	public errorMessages(boolean passwordFieldValidation){
		
		if(passwordFieldValidation == false)
		{
			errorMessage = "<html><center>You must have at least 6 - 10<br>characters and one digit and one letter</center></html>";
		}
		
	}

	public errorMessages(boolean passwordFieldValidation, boolean confirmEquals) {
		
		if(passwordFieldValidation == true && confirmEquals == false)
		{ 
			errorMessage = "<html><center>Your passwords do not match please<br>enter in the correct message</center></html>";
		}
	}
	
	public errorMessages(boolean passwordFieldValidation, boolean empty, Border border) {
		
		if(passwordFieldValidation == true && empty == true && border.equals(Borders.redline))
		{
			errorMessage = "<html><center>Please enter in your password in the confirm field</center></html>";
		}
	}
	
	public errorMessages() {
		
	}


	public String getErrorMessage() {
		
		return errorMessage;
	}

}
