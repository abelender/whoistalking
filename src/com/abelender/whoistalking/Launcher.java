package com.abelender.whoistalking;

import javax.swing.*;
import java.awt.*;

public class Launcher {
    public static void main(String[] args){
        JFrame frame = new JFrame("Who Is Talking");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);

        JPanel panel = new JPanel(new FlowLayout());

        JButton buttonStart = new JButton("Iniciar");
        JButton buttonStop = new JButton("Detener");
        JButton buttonClean = new JButton("Limpiar");
        JTextArea output = new JTextArea(10, 30);
            output.setEditable(false);

        panel.add(buttonStart);
        panel.add(buttonStop);
        panel.add(buttonClean);
        panel.add(output);

        frame.add(panel);
        frame.setVisible(true);
    }
}
