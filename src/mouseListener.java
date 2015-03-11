import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;




public class mouseListener implements MouseListener {
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Object source = e.getSource();
		
		if(source == Password_Panel.passwordfield)
		{
			Password_Panel.passwordfield.setEnabled(true);
			Password_Panel.passwordfield.setFocusable(true);
			
		}
		else if(source == Password_Panel.confirmfield)
		{
			Password_Panel.confirmfield.setEnabled(true);
			Password_Panel.confirmfield.setFocusable(true);

		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
