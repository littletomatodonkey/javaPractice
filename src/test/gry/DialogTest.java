package test.gry;

import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DialogTest extends Applet {
	MyDialogWnd dialog;
	DialogWnd wnd;
	public void init() {
		wnd = new DialogWnd("dialog wnd");
	}
}

class DialogWnd extends JFrame implements ActionListener{
    private JButton button1,button2;
    private static int flg=0;
    private static JTextField text1,text2;
    DialogWnd(String s){
        super(s);
        Container con = this.getContentPane();
        con.setLayout(new GridLayout(2,2));
        this.setSize(200,100);
        this.setLocation(100,100);
        button1 = new JButton("choose fruit");
        button2 = new JButton("choose food");
        button1.addActionListener(this);
        button2.addActionListener(this);
        text1 = new JTextField(20);
        text2 = new JTextField(20);
        con.add(button1);
        con.add(button2);
        con.add(text1);
        con.add(text2);
        this.setVisible(true);
        this.pack();
    }
    public static void returnName(String s){
        if(flg ==1)
            text1.setText("fruit : "+s);
        else if(flg == 2)
            text2.setText("food : "+s);
    }
    public void actionPerformed(ActionEvent e){
    	MyDialogWnd dialog;
        if(e.getSource()==button1){
            dialog = new MyDialogWnd(this,"fruit");
            dialog.setVisible(true);
            flg =1;
        }
        else if(e.getSource()==button2){
            dialog =new MyDialogWnd(this,"food");
            dialog.setVisible(true);
            flg=2;
        }
    }
}

class MyDialogWnd extends JDialog implements ActionListener{
    JLabel title;
    JTextField text;
    JButton done;
    public MyDialogWnd(JFrame F,String s){
        super(F,s,true);
        Container con = this.getContentPane();
        title = new JLabel("input"+s+"name");
        text = new JTextField(10);
        text.setEditable(true);
        con.setLayout(new FlowLayout());
        con.setSize(200,100);
        setModal(false);
        done = new JButton("确定");
        done.addActionListener(this);
        con.setVisible(true);
        this.pack();
    }
    public void actionPerformed(ActionEvent e){
    	DialogWnd.returnName(text.getText());
        setVisible(false);
        dispose();
    }
}