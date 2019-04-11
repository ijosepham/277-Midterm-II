import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ExitButtonListener {
	public void actionPerformed ( ActionEvent source ) {
		Component comp = ( Component ) source.getSource ( );
		JFrame frame = ( JFrame ) SwingUtilities.getRoot ( comp );
		frame.setVisible ( false );
	}
}
