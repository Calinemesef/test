package org.example.nemes;

import javax.swing.*;
import java.awt.*;

public class MainWindow {
    private JFrame frame;

    public MainWindow() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Main Window");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setTitle("Swing Demo Application");
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(5, 5)); // default layout
 
        frame.add(new JButton("Click NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("Click WEST"), BorderLayout.WEST);
        frame.add(new JButton("Click EAST"), BorderLayout.EAST);
        frame.add(new JButton("Click SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("Click CENTER"), BorderLayout.CENTER);
    }

    public void show() {
        frame.setVisible(true);
    }
}
