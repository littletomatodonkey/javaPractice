package gui.gry;

import java.applet.Applet;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import test.gry.stringTest;

public class PanelTest extends Applet {

	static MyPanel panel1, panel2;
	static JButton button;
	
	public void init() {
		panel1 = new MyPanel("OK", "Cancel", "panel 1");
		panel2 = new MyPanel("OK", "Cancel", "panel 2");
		button = new JButton("not in any panel");
		add( panel1 );
		add( panel2 );
		add( button );
		setSize(300, 200);
	}

}
class MyPanel extends JPanel {
	JButton b1, b2;
	JLabel label;
	public MyPanel(String s1, String s2, String s3) {
		b1 = new JButton(s1);
		b2 = new JButton(s2);
		label = new JLabel(s3);
		add(b1);
		add(b2);
		add(label);
		setVisible(true);
	}
}