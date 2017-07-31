package gui.gry;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardTest extends Applet implements KeyListener {
	int cnt = 0;
	Button button = new Button();
	TextArea text =new TextArea(5, 20);
	
	public void init() {
		button.addKeyListener(this);
		add(button);
		add(text);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		char t = e.getKeyChar();
		if( t>=KeyEvent.VK_A && t<=KeyEvent.VK_Z ) {
			text.append(t+ " ");
			cnt++;
			if( cnt % 10 == 0 )
				text.append("\n");
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}
}
