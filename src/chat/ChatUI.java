package chat;

import javax.swing.*;
import java.awt.*;

public class ChatUI {
    private JFrame frame;
    private JScrollPane scrollPane;
    private JTextArea chatText;
    private  JTextField entryText;

    public ChatUI(String title){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame = new JFrame(title);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                chatText = new JTextArea();
                chatText.setEditable(false);
                scrollPane = new JScrollPane(chatText);
                frame.add(scrollPane, BorderLayout.CENTER);

                entryText = new JTextField();
                frame.add(entryText,BorderLayout.PAGE_END);

                frame.setBounds(20, 20, 300, 300);
                frame.setVisible(true);
            }
        });

    }
}
