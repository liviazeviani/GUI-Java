package chat;

import javax.swing.*;

public class ChatUI {
    private JFrame frame;
    private JScrollPane scrollPane;
    private JTextArea chatText;
    private  JTextField entryText;

    public ChatUI(String title){
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
