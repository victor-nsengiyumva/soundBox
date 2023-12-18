
import java.awt.event.*;
import javax.swing.*;

public class SimpleGui2 implements ActionListener {
    private JButton button;

    public static void main(String[] args) {
        SimpleGui2 gui = new SimpleGui2();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Click me");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,30);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        button.setText("Ive been clicked");
    }
}
