import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zhengkevin on 4/9/17.
 */
public class TwoNumbersCalculator extends JFrame {

    JPanel p;
    JTextField tf_first;
    JTextField tf_second;
    JTextField tf_result;
    JComboBox cb;
    JButton bt;


    public static void main(String[] args) {
        TwoNumbersCalculator tnc = new TwoNumbersCalculator();
    }

    TwoNumbersCalculator() {

        p = new JPanel();
        tf_first = new JTextField(5);
        tf_second = new JTextField(5);
        tf_result = new JTextField(5);

        bt = new JButton("=");

        String[] operator = {"+", "-", "*", "/"};
        cb = new JComboBox(operator);

        p.add(tf_first);
        p.add(cb);
        p.add(tf_second);
        p.add(bt);
        p.add(tf_result);

        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double tf1;
                double tf2;
                double result;
                String r = "";

                if (tf_first.getText() == "") {
                    tf1 = 0;
                } else {
                    tf1 = Double.parseDouble(tf_first.getText());
                }
                if (tf_second.getText() == "") {
                    tf2 = 0;
                } else {
                    tf2 = Double.parseDouble(tf_second.getText());
                }

                if (cb.getSelectedItem() == "+") {
                    result = tf1 + tf2;
                    if (result == (int) result) {
                        r += (int) result;
                    } else {
                        r += String.format("%.4f",result);
                    }
                }
                if (cb.getSelectedItem() == "-") {
                    result = tf1 - tf2;
                    if (result == (int) result) {
                        r += (int) result;
                    } else {
                        r += String.format("%.4f",result);
                    }
                }
                if (cb.getSelectedItem() == "*") {
                    result = tf1 * tf2;
                    if (result == (int) result) {
                        r += (int) result;
                    } else {
                        r += String.format("%.4f",result);
                    }
                }
                if (cb.getSelectedItem() == "/") {
                    if (tf2 == 0) {
                        System.out.println("Second number must not equal to 0");
                    } else {
                        result = tf1 / tf2;
                        if (result == (int) result) {
                            r += (int) result;
                        } else {
                            r += String.format("%.4f",result);
                        }
                    }
                }
                tf_result.setText(r);
            }
        });
        getContentPane().add(p);
        setVisible(true);
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
