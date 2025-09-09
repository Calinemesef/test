package org.example.nemes;

import javax.swing.*;

public class MainWindow {
    private JFrame window;

    public MainWindow() {
        initialize();
    }

    private void initialize() {
        window = new JFrame("Main Window");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(400, 300);
        window.setTitle("Swing Demo Application");
        window.setLocationRelativeTo(null);
    }

    public void show() {
        window.setVisible(true);
    }
}
