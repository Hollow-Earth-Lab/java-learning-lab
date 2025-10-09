package ru.javacourse;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Starter
{

    public static void main(String[] args) {
        JFrame fr = new JFrame();
        JButton btn1 = new JButton("12345");
        fr.add(btn1, BorderLayout.NORTH);
        JButton btn2 = new JButton("54321");
        fr.add(btn2, BorderLayout.SOUTH);
        fr.setTitle("Заголовок!");
        fr.setBounds(100, 100, 800, 600);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
                
        /*
        SimpleObject so1 = new SimpleObject();
        SimpleObject so2 = new SimpleObject();
        
        so1.x = 99;
        so1.y = 99;
        
        so2.x = 77;
        
        so1.moveX(10);
        so1.moveY(110);
        
        System.out.println(so1.x);
        System.out.println(so1.y);
        */
    }
    
}
