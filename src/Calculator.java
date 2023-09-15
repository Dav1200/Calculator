import tk.pratanumandal.expr4j.ExpressionEvaluator;

import javax.swing.*;
import java.awt.*;
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


        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText()+"0");
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText()+"1");
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText()+"4");
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText()+"7");
            }
        });
        bdot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText()+".");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText()+"2");
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText()+"5");
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText()+"8");
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText()+"3");
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText()+"6");
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText()+"9");
            }
        });
        bplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText()+"+");
            }
        });
        bequals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {


                String expr = question.getText().toString();
                ExpressionEvaluator exprEval = new ExpressionEvaluator();
                double result = exprEval.evaluate(expr);
                displayAnswer.setText(String.valueOf(result));
                }
                catch (Exception a ){
                    System.out.println("Invalid Expression");
                    JOptionPane.showMessageDialog(mainPanel, "Invalid Expression ");
                    question.setText("");
                    displayAnswer.setText("");
                }




            }
        });
        bminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText()+"-");
            }
        });
        btimes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText()+"*");
            }
        });
        bdivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText()+"/");
            }
        });
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                question.setText("");
                displayAnswer.setText("");
            }
        });
        backspaceb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                question.setText(question.getText().substring(0,question.getText().length()-1));
            }
        });
    }

    public static void main(String[] args) {
        Calculator a = new Calculator();

    }
}
