package gui.gry;

import java.applet.Applet;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.*;

public class AddNumberTest extends Applet implements ActionListener {
	
	JTextArea textA;
	JTextField textF;
	JButton btn1, btn2;
	
	public void init() {
		setSize(250, 150);
		textA = new JTextArea("", 5, 10);
		textA.setBackground(Color.CYAN);
		
		textF = new JTextField("", 10);
		textF.setBackground(Color.pink);
		
		btn1 = new JButton( "Add" );
		btn2 = new JButton("restart");
		textF.setEditable(false);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		add( textA );
		add( textF );
		add( btn1 );
		add( btn2 );
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == btn1 )
		{
			String string = textA.getText();
			StringTokenizer tokenizer = new StringTokenizer( string );
			
			int n = tokenizer.countTokens(), sum = 0, i;
			System.out.println( tokenizer.countTokens() );
			for(i=0;i<n;i++)
			{
				String temp = tokenizer.nextToken();
				sum += Integer.parseInt(temp);
			}
			textF.setText("" + sum);
		}
		else if( e.getSource() == btn2 )
		{
			textA.setText(null);
			textF.setText(null);
		}
	}
}
