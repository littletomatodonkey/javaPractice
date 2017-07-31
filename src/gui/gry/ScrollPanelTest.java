package gui.gry;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ScrollPanelTest extends Applet {
	MyWindow myWindow;
	public void init() {
		myWindow = new MyWindow(400, 300);
	}
}

class MyWindow extends JFrame {
	public MyWindow(int w, int h) {
		setTitle("panel example");
		Container container = getContentPane();
		container.setPreferredSize(new Dimension(w, h));
		container.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6, 6));
		for(int i=0;i<6;i++)
		{
			panel.add(new JLabel());
            for(int j=1;j<=2;j++){
                panel.add(new JButton("°´Å¥"+(2*i+j)));
                panel.add(new JLabel("±êÇ©"+(2*i+j)));
            }
            panel.add(new JLabel());
		}
		
		panel.setBackground(Color.blue);
        panel.setPreferredSize(new Dimension(w+60,h+60));
        JScrollPane ScrollPane=new JScrollPane(panel);
        ScrollPane.setPreferredSize(new Dimension(w-60,h-60));
        add(ScrollPane,BorderLayout.CENTER);
        setVisible(true); pack();
	}
}

class ScrollPane extends JScrollPane{
    public ScrollPane(Component p){
        super(p);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    }
}
