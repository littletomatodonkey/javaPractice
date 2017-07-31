package gui.gry;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BtnListenerTest {

	public static void main(String[] args) {
		ButtonListener buttonListener = new ButtonListener();
		buttonListener.setVisible(true);
	}

}

class ButtonListener extends JFrame implements ActionListener {
	public static final int Width = 250;
	public static final int Height = 250;
	
	public ButtonListener() {
		setSize(Width, Height);
		setTitle("Button click listener");
		Container container = getContentPane();
		container.setBackground(Color.BLUE);
		container.setLayout(new FlowLayout());
		JButton redBtn = new  JButton( "Red" );
		redBtn.addActionListener(this);
		container.add( redBtn );
		JButton greenBtn = new JButton("Green");
		greenBtn.addActionListener(this);
		container.add(greenBtn);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Container container = getContentPane();
		if( e.getActionCommand().equals("Red") )
		{
			container.setBackground(Color.RED);
		}
		else if( e.getActionCommand().equals("Green") )
		{
			container.setBackground(Color.GREEN);
		}
	}
	
}