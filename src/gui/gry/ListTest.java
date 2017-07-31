package gui.gry;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import test.gry.stringTest;

public class ListTest extends Applet {
	ListWnd win = new ListWnd( "example" );
}


class ListWnd extends JFrame implements ListSelectionListener {
	
	JList list1, list2;
	JTextArea text;
	String nums[] = {"1", "2", "3", "4"};
	String words[] = {"one", "two", "three", "four"};
	
	
	public ListWnd( String s ) {
		super(s);
		Container con = getContentPane();
		con.setBackground(Color.BLUE);
		con.setLayout(new GridLayout(2, 2));
		con.setSize(200, 500);
		list1 = new JList( nums );
		list1.setVisibleRowCount(3);
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list1.addListSelectionListener(this);
        list2 = new JList(words);
        list2.setVisibleRowCount(2);
        list2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        list2.addListSelectionListener(this);
        con.add(list1);
        con.add(list2);
        text= new JTextArea(10,20);
        con.add(text);
        this.setVisible(true);
        this.pack();
	}
	

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(e.getSource()==list1){
            text.setText(null);
            Object listValue = ((JList) e.getSource()).getSelectedValue();
            String seleName = listValue.toString();
            for(int i=0;i<nums.length;i++)
                if(nums[i].equals(seleName)){
                    text.append(seleName+ "chosen\n");
                }
        }
        else if(e.getSource()==list2){
            text.setText(null);
            int tempList[] =list2.getSelectedIndices();
            for(int i=0;i<tempList.length;i++)
                text.append(words[tempList[i]] + "chosen\n");
         }
	}
	
}