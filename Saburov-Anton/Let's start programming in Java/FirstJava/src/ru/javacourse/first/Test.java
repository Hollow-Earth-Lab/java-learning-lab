package ru.javacourse.first;

import javax.swing.JFrame;

public class Test
{
    public static void main(String[] args){
        System.out.println("Hello World!");
        
        for(int m = 0; m < 10; m++){
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setBounds((m+1)*20, (m+1)*20, 200, 200);
            f.setVisible(true);
        }
    }
            
}
