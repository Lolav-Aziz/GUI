/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author lolavaziz
 */
public class Frame2 extends JFrame implements ActionListener {

    JFrame Frame;
    JPanel Panel;
    JTextField a, b, c, d, e, f, g;
    Font font = new Font("Times", Font.BOLD,24);
    JLabel h, i, j, k, l, m, n,w;
    Container pane;
    JComboBox box;
    JComboBox bo;

    JRadioButton j1;
    JRadioButton j2;
    ButtonGroup g1;

    JButton x = new JButton("Cancel"), z = new JButton("Submit");

    public Frame2() {

        setTitle("Hello!");
        Container Pane = getContentPane();
        Pane.setLayout(null);
        setBounds(300, 90, 900, 600);
        getContentPane().setBackground(new java.awt.Color(207, 52, 53));
        a = new JTextField(10);
        b = new JTextField(10);
        c = new JTextField(10);
        d = new JTextField(10);
        e = new JTextField(10);
        f = new JTextField(10);
        g = new JTextField(10);
        w= new JLabel("Welcome New Member!");
        w.setFont(font);
        h = new JLabel("Member Full Name");
        i = new JLabel("Age");
        j = new JLabel("Gender");
        k = new JLabel("Bloodtype");
        l = new JLabel("Phone Number");
        m = new JLabel("Address");
        n = new JLabel("Email");

        box = new JComboBox();
        box.addItem("A+");
        box.addItem("A-");
        box.addItem("B+");
        box.addItem("B-");
        box.addItem("O+");
        box.addItem("O-");
        box.addItem("AB+");
        box.addItem("AB-");


        j1 = new JRadioButton();
        j2 = new JRadioButton();
        g1 = new ButtonGroup();
        j1.setText("Male");
        j2.setText("Female");

        
        w.setSize(270, 20);
        w.setLocation(350, 40);
        Pane.add(w);
        h.setSize(130, 20);
        h.setLocation(100, 100);
        Pane.add(h);
        a.setSize(190, 20);
        a.setLocation(230, 100);
        Pane.add(a);
        i.setSize(100, 20);
        i.setLocation(100, 150);
        Pane.add(i);
        b.setSize(150, 20);
        b.setLocation(200, 150);
        Pane.add(b);
        j.setSize(100, 20);
        j.setLocation(100, 200);
        Pane.add(j);
        j1.setSize(75, 20);
        j1.setLocation(200, 200);
        Pane.add(j1);
        j2.setSize(80, 20);
        j2.setLocation(290, 200);
        Pane.add(j2);
        k.setSize(80, 20);
        k.setLocation(100, 250);
        Pane.add(k);
        box.setSize(80, 20);
        box.setLocation(200, 250);
        Pane.add(box);
        l.setSize(130, 20);
        l.setLocation(100, 300);
        Pane.add(l);
        c.setSize(180, 20);
        c.setLocation(200, 300);
        Pane.add(c);
        m.setSize(150, 20);
        m.setLocation(100, 350);
        Pane.add(m);
        d.setSize(250, 75);
        d.setLocation(200, 350);
        Pane.add(d);
        n.setSize(250, 20);
        n.setLocation(100, 435);
        Pane.add(n);
        e.setSize(190, 20);
        e.setLocation(200, 435);
        Pane.add(e);

        x.setSize(100, 20);
        x.setLocation(380, 500);
        x.addActionListener(this);
        Pane.add(x);

        z.setSize(100, 20);
        z.setLocation(499, 500);
        z.addActionListener(this);

        Pane.add(z);

    }

    public void actionPerformed(ActionEvent event) {

        String o = (a.getText());
        String p = (b.getText());
        String q = (c.getText());
        String r = (d.getText());
        String n = (e.getText());

        box.getSelectedIndex();


        String qual = " ";
 
        if (j1.isSelected()) {

            qual = "Male";
          
        } else if (j1.isSelected()) {

            qual = "Female";
     
        } else {

            qual = "NO Button selected";
        }
        
       this.dispose();
    }

    public static void main(String[] args) {
        Frame2 f = new Frame2();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

 
}
