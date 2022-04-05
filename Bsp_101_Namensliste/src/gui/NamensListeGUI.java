package gui;

import javax.swing.*;

public class NamensListeGUI {
    private JPanel jpMain;
    private JPanel jpName;
    private JPanel jpListContents;
    private JButton btInsert;
    private JButton btDelete;
    private JTextField tfName;
    private JTextField tfNameList;
    private JTextField tfPosition;
    private JButton button1;
    private JButton vButton;
    private JLabel lbName;
    private JLabel lbPositions;


    public static void main(String[] args) {
        JFrame frame = new JFrame("NamensListeGUI");
        frame.setContentPane(new NamensListeGUI().jpMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
