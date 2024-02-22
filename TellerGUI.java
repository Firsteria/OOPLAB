
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TellerGUI implements ActionListener{
    private JFrame fr;
    private JPanel p, p1, p2, p3, p4;
    private JTextField txt1, txt2;
    private JLabel l1, l2;
    private JButton bn1, bn2, bn3;
    private Account acc;
    
    public TellerGUI(){
    fr = new JFrame();
    p = new JPanel();
    p1 = new JPanel();
    p2 = new JPanel();
    p3 = new JPanel();
    p4 = new JPanel();
    l1 = new JLabel("Balance");
    l2 = new JLabel("Amount");
    txt1 = new JTextField("0.0");
    txt2 = new JTextField();
    bn1 = new JButton("Deposit");
    bn2 = new JButton("Withdraw");
    bn3 = new JButton("Exit");
    acc = new Account();
    
    bn1.addActionListener(this);
    bn2.addActionListener(this);
    bn3.addActionListener(this);
    
    p.setLayout(new GridLayout(4, 1));
    p1.setLayout(new GridLayout(1,2));
    p2.setLayout(new GridLayout(1,2));
    p3.setLayout(new FlowLayout());
    p1.add(l1); p1.add(txt1);
    p2.add(l2); p2.add(txt2);
    p3.add(bn1); p3.add(bn2); p3.add(bn3);
    p.add(p1); p.add(p2); p.add(p3); p.add(p4); fr.add(p);
    txt1.setEditable(false);
    
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fr.pack();
    fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ev) {
        Object source = ev.getSource();
        if (source instanceof JButton){
            JButton clickedButton = (JButton) source;
            String buttonText = clickedButton.getText();
            switch(buttonText){
                case "Deposit":
                    double dp = Double.parseDouble(txt2.getText());
                    acc.deposit(dp);
                    txt1.setText(""+acc.getBalance());
                    break;
                case "Withdraw":
                    double wd = Double.parseDouble(txt2.getText());
                    acc.withdraw(wd);
                    txt1.setText(""+acc.getBalance());
                    break;
                case "Exit":
                    System.exit(0);
                    break;
            }
        }
    }
}
        
        
        

