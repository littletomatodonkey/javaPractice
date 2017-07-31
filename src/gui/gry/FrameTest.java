package gui.gry;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame( "my first frame" );
		jFrame.setSize(720, 480);
		JButton button = new JButton("first button");
		jFrame.getContentPane().add(button);
		jFrame.setVisible(true);
		
		MyWnd wnd = new MyWnd("2nd", new JButton("2nd btn") , Color.red, 300, 150);
		wnd.setVisible(true);
	}

}

class MyWnd extends JFrame {
	public MyWnd( String name, JButton button, Color c, int w, int h ) {
		super();
		setTitle(name);
		setSize(w, h);
		Container container = getContentPane();
		container.add(button);
		container.setBackground(c);
//		setBackground(c);
	}
}