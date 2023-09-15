import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;

public class Calculator extends JFrame {
    private JPanel mainPanel;
    private JButton b0;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton bplus;
    private JButton bminus;
    private JButton btimes;
    private JButton bdivide;
    private JButton backspaceb;
    private JButton ACButton;
    private JButton bdot;
    private JButton bequals;
    private JLabel displayAnswer;
    private JPanel displayQuestion;
    private JLabel question;

    Calculator() {

        this.setContentPane(this.mainPanel);
        this.setSize(600,400);
        this.setVisible(true);
displayAnswer.setText("123123123");
question.setText("123123123");

        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText()+"0");
            }
        });
    }

    public static void main(String[] args) {
        Calculator a = new Calculator();

    }
}
