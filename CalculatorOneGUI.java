import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel p;
    private JPanel p2;
    private JTextField tf1, tf2, tf3;
    private JButton bn1, bn2, bn3, bn4;
    
    public CalculatorOneGUI(){
        fr =  new JFrame("CalculatorOneGUI");
        p = new JPanel();
        p2 = new JPanel();
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        bn1 = new JButton("plus");
        bn2 = new JButton("minus");
        bn3 = new JButton("divide");
        bn4 = new JButton("multiply");
        
        p.setLayout(new GridLayout(4,1));
        p2.setLayout(new FlowLayout());
        p2.add(bn1); p2.add(bn2); p2.add(bn3); p2.add(bn4);
        p.add(tf1); p.add(tf2); p.add(p2); p.add(tf3); fr.add(p);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}
