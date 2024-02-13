import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel p;
    private JPanel p2;
    private JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn10, bn11, bn12, bn13, bn14, bn15, bn16;
    private JTextField txt;
    
    public CalculatorTwoGUI(){
        fr = new JFrame();
        p = new JPanel();
        p2 = new JPanel();
        bn1 = new JButton("7");
        bn2 = new JButton("8");
        bn3 = new JButton("9");
        bn4 = new JButton("+");
        bn5 = new JButton("4");
        bn6 = new JButton("5");
        bn7 = new JButton("6");
        bn8 = new JButton("-");
        bn9 = new JButton("1");
        bn10 = new JButton("2");
        bn11 = new JButton("3");
        bn12 = new JButton("x");
        bn13 = new JButton("0");
        bn14 = new JButton("c");
        bn15 = new JButton("=");
        bn16 = new JButton("/");
        txt = new JTextField();
        
        p.setLayout(new BorderLayout());
        p2.setLayout(new GridLayout(4, 4));
        p2.add(bn1); p2.add(bn2); p2.add(bn3); p2.add(bn4);
        p2.add(bn5); p2.add(bn6); p2.add(bn7); p2.add(bn8);
        p2.add(bn9); p2.add(bn10); p2.add(bn11); p2.add(bn12);
        p2.add(bn13); p2.add(bn14); p2.add(bn15); p2.add(bn16);
        p.add(txt, BorderLayout.NORTH);
        p.add(p2);
        fr.add(p);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        
    }
}
