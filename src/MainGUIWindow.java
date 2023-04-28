import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainGUIWindow extends JFrame implements ActionListener, KeyListener {
    private JPanel mainPanel;
    private JTextArea textArea1;
    private JButton button1;
    private JButton button2;
    private JTextField textField1;
    private JLabel label1;

    public MainGUIWindow() {
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("My GUI!");
        setSize(300,400);
        setLocation(450,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        button1.addActionListener(this);
        button2.addActionListener(this);
        textField1.addActionListener(this);
        textField1.addKeyListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton button) {
            String text = button.getText();
            if (text.equals("Send")) {
                textArea1.append(textField1.getText());
            } else {
                textArea1.append("Good timeeessss~~~");
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar(); // also takes shift and such but "char" does not inlcued any but letters
                                   // maybe find out keycode to convert to string obj?
        textArea1.append("Key Pressed!\n " + key + "\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}
