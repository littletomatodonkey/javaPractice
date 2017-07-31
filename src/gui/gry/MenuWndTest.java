package gui.gry;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MenuWndTest extends Applet implements ActionListener {
	MenuWnd wnd;
	JButton button;
	boolean flag;
	
	public void init(){
        button = new JButton("open wnd");
        flag =true;
        wnd = new MenuWnd("wnd",100,100);
        button.addActionListener(this);
        add(button);
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button){
            if(flag){
                wnd.setVisible(true);
                flag = false;
                button.setText("close wnd");
            }
            else{
               wnd.setVisible(false);
               flag = true;
               button.setText("open wnd");
            }
        }
	}
	
}

class MenuWnd extends JFrame implements ActionListener {
	public static JTextField text;
	private void addItem( JMenu menu, String name, ActionListener l ) {
		JMenuItem item = new JMenuItem(name);
		item.setActionCommand(name);
        item.addActionListener(l);
        menu.add(item);
	}
	
	public MenuWnd(String s, int w, int h) {
		setTitle(s);
        Container con = this.getContentPane();
        con.setLayout(new BorderLayout());
        this.setLocation(100,100);
        this.setSize(w,h);
        JMenu menu1 = new JMenu("sports");
        addItem(menu1," running",this);
        addItem(menu1," skipping",this);
        addItem(menu1,"ball",this);
        JMenu menu2 = new JMenu("entertainment");
        addItem(menu2,"sing",this);
        addItem(menu2,"dance",this);
        addItem(menu2,"games",this);
        JMenuBar menubar = new JMenuBar();
        text = new JTextField();
        menubar.add(menu1);
        menubar.add(menu2);
        setJMenuBar(menubar);
        con.add(text,BorderLayout.NORTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		text.setText(e.getActionCommand() + " chosen.");
	}
}