import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;


public class Borders {
	
static Border blackline = BorderFactory.createLineBorder(Color.black);
static Border redline = BorderFactory.createLineBorder(Color.RED, 2);
static Border lightwhiteline = BorderFactory.createLineBorder(Color.WHITE);
static Border raisedetched = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
static Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
static Border raisedbevel = BorderFactory.createRaisedBevelBorder();
static Border loweredbevel = BorderFactory.createLoweredBevelBorder();
static Border empty = BorderFactory.createEmptyBorder();
	
}
