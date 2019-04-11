import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FilledFrame extends JFrame
{
   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 200;
   private JButton button1;
   private JButton button2;
   private JLabel text;
   private JPanel panel;
   
   public FilledFrame()
   {
      button1 = new JButton("Hello");
      button2 = new JButton("Good bye");
      panel = new JPanel();
      text = new JLabel();
      ClickListener listener = new ClickListener();
      panel.add(button1);
      panel.add(text);
      panel.add(button2);
      button1.addActionListener(listener);
      button2.addActionListener(listener);
      add(panel);
   }
   
   class ClickListener implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {
          JButton button = ( JButton ) event.getSource ( );
          if ( button == button1 ) {
         	 text.setText( "Saved!" );
          } else if ( button == button2 ) {
         	 text.setText( "Cancelled" );
          }
      }
   }
   
   public static void main(String[] a)
   {
      FilledFrame frame = new FilledFrame();
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setVisible(true);
   }
}