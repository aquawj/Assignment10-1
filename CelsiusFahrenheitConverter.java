import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by zhengkevin on 4/9/17.
 */
public class CelsiusFahrenheitConverter extends JFrame {

    JPanel p;
    JTextField tf;
    JButton b;

    public static void main(String[] args) {
        CelsiusFahrenheitConverter c = new CelsiusFahrenheitConverter();
    }

    CelsiusFahrenheitConverter() {

        p = new JPanel();
        tf = new JTextField(10);
        b = new JButton("Convert");

        p.add(tf);
        p.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double c = Double.parseDouble(tf.getText().substring(0, tf.getText().indexOf(" ")));
                double r;

                if (tf.getText().contains("Celsius")) {

                    String temp = "";
                    r = c * 1.8 + 32;
                    if (r == (int) r) {
                        temp += (int) r;
                    } else {
                        temp += String.format("%.2f", r);
                    }
                    temp += " Fahrenheit";
                    tf.setText(temp);
                } else if (tf.getText().contains("Fahrenheit")) {

                    String temp = "";
                    r = (c - 32) / 1.8;
                    if (r == (int) r) {
                        temp += (int) r;
                    } else {
                        temp += String.format("%.2f", r);
                    }
                    temp += " Celsius";
                    tf.setText(temp);
                }
            }
        });
        getContentPane().add(p);
        setVisible(true);
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
