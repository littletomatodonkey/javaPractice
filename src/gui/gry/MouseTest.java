package gui.gry;

import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseTest extends Applet {
	MouseWnd wnd = new MouseWnd("mouse test");
}

class MouseWnd extends JFrame implements MouseListener{
    JTextArea text;
    MyPanelTest panel;
    int x,y,r =10;
    int mouseFlg=0;
    static String mouseStates[]={"pressed","released","entered","left","double clicked"};
    public MouseWnd(String s){
        super(s);
        Container con = this.getContentPane();
        con.setLayout(new GridLayout(2,1));
        this.setSize(200,300);
        this.setLocation(100,100);
        panel = new MyPanelTest();
        con.add(panel);
        text = new JTextArea(10,20);
        text.setBackground(Color.white);
        con.add(text);
        addMouseListener(this);
        this.setVisible(true);
        this.pack();
    }
    public void paint(Graphics g){
        r = r+4;
        if(r>80){
            r=10;
        }
        text.append(mouseStates[mouseFlg]+", pos : " +x+","+y+"\n");
        panel.print(r);
    }
    public void mousePressed(MouseEvent e){
        x = e.getX();
        y = e.getY();
        mouseFlg = 0;
        repaint();
    }
    public void mouseRelease(MouseEvent e){
        x = e.getX();
        y = e.getY();
        mouseFlg = 1;
        repaint();
    }
    public void mouseEntered(MouseEvent e){
        x = e.getX();
        y = e.getY();
        mouseFlg = 2;
        repaint();
    }
    public void mouseExited(MouseEvent e){
        x = e.getX();
        y = e.getY();
        mouseFlg = 3;
        repaint();
    }
    public void mouseClicked(MouseEvent e){
        if(e.getClickCount()==2){
            x = e.getX();
            y = e.getY();
            mouseFlg = 4;
            repaint();
        }
        else{}
    }
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

class MyPanelTest extends JPanel{
    public void print(int r){
        Graphics g = getGraphics();
        g.clearRect(0,0,this.getWidth(),this.getHeight());
        g.setColor(Color.red);
        g.fillOval(10,10,r,r);
    }
}