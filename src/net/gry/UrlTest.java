package net.gry;

import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class UrlTest {

	public static void main(String[] args) {
		new DownNetFile();
	}
}

class DownNetFile extends JFrame implements ActionListener{
    JTextField infield = new JTextField(30);
    JTextArea showArea = new JTextArea();
    JButton b = new JButton("download");
    JPanel p = new JPanel();
    DownNetFile(){
        super("read network text file application");
        Container con = this.getContentPane();
        p.add(infield);p.add(b);
        JScrollPane jsp = new JScrollPane(showArea);
        b.addActionListener(this);
        con.add(p,"North");
        con.add(jsp,"Center");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        readByURL(infield.getText());
    }
    public void readByURL(String urlName){
        try{
            URL url = new URL(urlName);
            URLConnection tc = url.openConnection();
            tc.connect();
            InputStreamReader in = new InputStreamReader(tc.getInputStream());
            BufferedReader dis = new BufferedReader(in);//采用缓冲式输入
            String inline;
            while((inline = dis.readLine())!=null){
                showArea.append(inline + "\n");
            }
            dis.close();
        }catch(MalformedURLException e){
            e.printStackTrace();
       }
        catch(IOException e) {
        	e.printStackTrace();
        }
    }
}