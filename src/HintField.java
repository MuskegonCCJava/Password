//	HintField.java by Kyle Wolff and Brandon VanderMey on 3/12/2015

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicTextFieldUI;
import javax.swing.text.JTextComponent;


public class HintField extends BasicTextFieldUI implements FocusListener{

	private String password;
	private Color color;
	
	public HintField(String password, Color color) {
		
		this.password = password;
		this.color = color;
		
	}
	
	private void repaint()
	{
		if (getComponent() != null) {
            getComponent().repaint();
        }
	}
	
	@Override
    protected void paintSafely(Graphics g) {
        // Render the default text field UI
        super.paintSafely(g);
        // Render the hint text
        JTextComponent component = getComponent();
        if (component.getText().length() == 0 && !component.hasFocus()) {
            g.setColor(color);
            int padding = (component.getHeight() - component.getFont().getSize()) / 3;
            int inset = 3;
            g.drawString(password, inset, component.getHeight() - padding - inset);
        }
    }
	
	@Override
	public void focusGained(FocusEvent e) {
		repaint();
	}

	@Override
	public void focusLost(FocusEvent e) {
		repaint();
		
	}
	 @Override
	    public void installListeners() {
	        super.installListeners();
	        getComponent().addFocusListener(this);
	    }
	 
	    @Override
	    public void uninstallListeners() {
	        super.uninstallListeners();
	        getComponent().removeFocusListener(this);
	    }
	
}
