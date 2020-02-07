/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lolavaziz
 */
public class Frame1 extends JFrame implements ActionListener {

    JFrame frame = new JFrame("GUI"); 
   
    JPanel panel = new JPanel();
    JButton b1 = new JButton("NewMember"),
            b2 = new JButton("Search Donor"), b3 = new JButton("Sell Blood"),
            b4 = new JButton("Search Buyer"), b5 = new JButton("No. of Blood Packets available"),
            b6 = new JButton("Exit");
    

    public Frame1() {
        setTitle("Welcome to RedBlood!");
        
        Container pane = getContentPane();
        pane.setLayout(new FlowLayout());
        setBounds(500, 500, 450, 360);
        getContentPane().setBackground(new java.awt.Color(207, 52, 53));
        pane.add(b1);
        b1.setPreferredSize(new Dimension(400, 50));
        pane.add(b2);
        b2.setPreferredSize(new Dimension(400, 50));
        pane.add(b3);
        b3.setPreferredSize(new Dimension(400, 50));
        pane.add(b4);
        b4.setPreferredSize(new Dimension(400, 50));
        pane.add(b5);
        b5.setPreferredSize(new Dimension(400, 50));
        pane.add(b6);
        b6.addActionListener(this);
        b6.setPreferredSize(new Dimension(150, 50));
    
       

    }

    public static void main(String[] args) {
        Frame1 f = new Frame1();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       this.dispose();
    }

}
