package quiz_app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(20, 30, 700, 30);
        heading.setFont(new Font("Baskerville Old Face", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 25, 700, 350);
        rules.setFont(new Font("Arial", Font.PLAIN, 16));
        rules.setText(
                "<html>"+
                        "1. Answer point to point" + "<br><br>" +
                        "2. All the questions are compulsory" + "<br><br>" +
                        "3. Each question has a time limit" + "<br><br>" +
                        "4. Each correct answer earns a set number of points (e.g., 10 points)" + "<br><br>" +
                        "5. Once an answer has been submitted, it cannot be changed. Participants must lock in their answers before time is up." + "<br><br>" +
                "<html>"
        );
        add(rules);

        back = new JButton("Back");
        back.setBounds(250, 400, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(400, 400, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        setSize(800, 550);
        setLocation(300, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}

