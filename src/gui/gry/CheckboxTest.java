package gui.gry;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckboxTest extends Applet {
	public void init() {
		CbWnd wnd = new CbWnd("test");
	}
}


class CbWnd extends JFrame implements ItemListener {
	Panel1 panel1;
    Panel2 panel2;
    JLabel label1,label2;
    JTextArea text1,text2;
    static String fName[] = {"HP","IBM","DELL"};
    static double priTbl[][]={{1.20,1.15,1.10},{1.70,1.65,1.60},{1.65,1.60,1.58}};
    static int production = -1;
    
    public CbWnd(String s) {
    	super(s);
        Container con = this.getContentPane();
        con.setLayout(new GridLayout(3,2));
        this.setLocation(100,100);
        this.setSize(400,100);
        panel1 = new Panel1();panel2 = new Panel2();
        label1 = new JLabel("prodct intorduction",JLabel.CENTER);
        label2 = new JLabel("product price",JLabel.CENTER);
        text1 = new JTextArea();text2 = new JTextArea();
        con.add(label1);con.add(label2);con.add(panel1);
        con.add(panel2);con.add(text1);con.add(text2);
        panel1.box1.addItemListener(this);
        panel1.box2.addItemListener(this);
        panel1.box3.addItemListener(this);
        panel2.box1.addItemListener(this);
        panel2.box2.addItemListener(this);
        panel2.box3.addItemListener(this);
        this.setVisible(true);
        this.pack();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getItemSelectable()==panel1.box1){
            production =0;
            text1.setText(fName[0]+"company production");text2.setText("");
        }
        else if(e.getItemSelectable()==panel1.box2){
            production =1;
            text1.setText(fName[1]+"company production");text2.setText("");
        }
        else if(e.getItemSelectable()==panel1.box3){
            production =2;
            text1.setText(fName[2]+"company production");text2.setText("");
        }
        else{
            if(production ==-1) return;
            if(e.getItemSelectable()==panel2.box1){
                text2.setText(""+priTbl[production][0]+"w yuan");
            }
            else if(e.getItemSelectable()==panel2.box2){
                text2.setText(""+priTbl[production][1]+"w yuan");
            }
            else if(e.getItemSelectable()==panel2.box3){
                text2.setText(""+priTbl[production][2]+"w yuan");
            }
        }
	}
}

class Panel1 extends JPanel{
    JRadioButton box1,box2,box3;
    ButtonGroup g;
    Panel1(){
        setLayout(new GridLayout(1,3));
        g = new ButtonGroup();
        box1 = new JRadioButton(CbWnd.fName[0]+"PC", false);
        box2 = new JRadioButton(CbWnd.fName[1]+"PC", false);
        box3 = new JRadioButton(CbWnd.fName[2]+"PC", false);
        g.add(box1);g.add(box2);g.add(box3);
        add(box1);add(box2);add(box3);
        add(new JLabel("PC sel 1 in 3") );
    }
}

class Panel2 extends JPanel{
    JCheckBox box1,box2,box3;
    ButtonGroup g;
    Panel2(){
        setLayout(new GridLayout(1,3));
        g = new ButtonGroup();
        box1 = new JCheckBox("buy 1");
        box2 = new JCheckBox("buy 2");
        box3 = new JCheckBox("buy 3 ");
        g.add(box1);g.add(box2);g.add(box3);
        add(box1);add(box2);add(box3);
        add(new JLabel("choose 1-3"));
    }
}