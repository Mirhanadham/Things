package project;


import javax.swing.*;

import javax.swing.JFrame;


public class GUI extends JFrame {

    public GUI() {
        JFrame home = new JFrame("Home");

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JButton adminButton = new JButton("Admin");


        JButton userButton = new JButton("Customer");

        JButton storeOwnerButton = new JButton("Store Owner");


        home.setSize(600, 500);
        adminButton.setBounds(50, 100, 50, 100);

    }


}
