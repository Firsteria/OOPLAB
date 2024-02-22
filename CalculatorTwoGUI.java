
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorTwoGUI implements ActionListener{
    private JFrame fr;
    private JPanel p;
    private JPanel p2;
    private JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn10, bn11, bn12, bn13, bn14, bn15, bn16;
    private JTextField txt;
    private double total1 = 0.0, total2 = 0.0;
    private char op;
    
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
        
        bn1.addActionListener(this);
        bn2.addActionListener(this);
        bn3.addActionListener(this);
        bn4.addActionListener(this);
        bn5.addActionListener(this);
        bn6.addActionListener(this);
        bn7.addActionListener(this);
        bn8.addActionListener(this);
        bn9.addActionListener(this);
        bn10.addActionListener(this);
        bn11.addActionListener(this);
        bn12.addActionListener(this);
        bn13.addActionListener(this);
        bn14.addActionListener(this);
        bn15.addActionListener(this);
        bn16.addActionListener(this);
     
        
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
    @Override
    public void actionPerformed(ActionEvent ae){
        Object source = ae.getSource();
        if(source instanceof JButton){
            JButton clickedButton = (JButton) source;
            String buttonText = clickedButton.getText();
            switch(buttonText){
                case"+":
                case"-":
                case"x":
                case"/":
                    op = buttonText.charAt(0);
                    total1 = Double.parseDouble(txt.getText());
                    txt.setText("");
                break;
                case"c":
                    txt.setText("");
                    total1 = 0.0;
                    total2 = 0.0;
                break;
                case"=":
                    total2 = Double.parseDouble(txt.getText());
                    switch(op){
                        case'+':
                            txt.setText(String.valueOf(total1 + total2));
                        break;
                        case'-':
                            txt.setText(String.valueOf(total1 - total2));
                        break;
                        case'x':
                            txt.setText(String.valueOf(total1 * total2));
                        break;
                        case'/':
                            if(total2 != 0){
                            txt.setText(String.valueOf(total1 / total2));
                            }
                            else{
                                System.out.println("Error : divide by zero");
                            }
                        break;
                    }
                    break;
                default:
                    String currentText = txt.getText();
                    if(currentText.equals("0")){
                        txt.setText(buttonText);
                        
                    }
                    else{
                        txt.setText(currentText + buttonText);
                    }
                    break;
            }
        }
        
    }
}
