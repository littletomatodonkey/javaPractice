package gui.gry;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.beans.PropertyChangeListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ComboText {
	public static void main( String args[] ) {
		ComboBoxDemo demo = new ComboBoxDemo();
	}
}

class ComboBoxDemo extends JFrame implements ActionListener, ItemListener {

	public static final int Width = 350;
	public static final int Height = 150;
	String proList[] = {"soccer", "basketball", "volleyball"};
	JTextField text;
	JComboBox cb;
	
	public ComboBoxDemo() {
		setSize(Width, Height);
		setTitle("test");
		Container con = getContentPane();
		con.setBackground(Color.BLUE);
		con.setLayout(new  FlowLayout());
		cb = new JComboBox(proList);
		cb.addActionListener(this);
		cb.addItemListener(this);
		cb.setEditable(true);
		con.add(cb);
		text = new JTextField(20);
		con.add(text);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == cb )
		{
			text.setText( cb.getSelectedItem().toString() );
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if( e.getSource() == cb )
		{
			text.setText( cb.getSelectedItem().toString() );
		}
	}
	
}
