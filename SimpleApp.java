package OtherAPIs;

import javax.swing.*;

public class SimpleApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        JLabel label = new JLabel("Hello, Java SE!", SwingConstants.CENTER);
        frame.getContentPane().add(label);
        frame.setVisible(true);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
    }
}