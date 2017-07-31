package gui.gry;

import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLRecoverableException;

import javax.swing.JTextField;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TextboxTest extends Applet {
	static JTextField text1, text2;
	Sqr s = new Sqr(  );
	public void init() {
		text1 = new JTextField(10);
		text2 = new JTextField(15);
		add( text1 );
		add( text2 );
		text1.addActionListener(s);
	}
}

class Sqr implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == TextboxTest.text1 )
		{
			long n = Long.parseLong(TextboxTest.text1.getText());
			TextboxTest.text2.setText(String.valueOf(n*n));
		}
	}
	
}


