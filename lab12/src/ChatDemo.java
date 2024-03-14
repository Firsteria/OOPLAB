import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;
public class ChatDemo implements ActionListener, WindowListener {
    private JFrame fr;
    private JButton bt1, bt2;
    private JPanel p;
    private JTextArea ta1;
    private JTextField txt;
    private String text;
    
    public ChatDemo(){
    fr = new JFrame();
    bt1 = new JButton("Submit");
    bt2 = new JButton("Reset");
    p = new JPanel();
    ta1 = new JTextArea(20, 45);
    txt = new JTextField(45);
    
    fr.addWindowListener(this);
    bt1.addActionListener(this);
    bt2.addActionListener(this);
    
    p.setLayout(new FlowLayout());
    fr.setResizable(false);
    fr.setSize(480, 480);
    ta1.setEditable(false);
    p.add(ta1);
    p.add(txt);
    p.add(bt1);
    p.add(bt2);
    fr.add(p);
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(bt1)){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            
            text = ta1.getText();
            ta1.setText(text + dtf.format(LocalDateTime.now()) + " : " + txt.getText() + "\n");
            txt.setText("");
        }
        else if(ae.getSource().equals(bt2)){
            ta1.setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        File f = new File("datachat.dat");
        if(f.exists()){
            try {FileInputStream fin = new FileInputStream("datachat.dat");
                 ObjectInputStream in = new ObjectInputStream(fin);   
                 ta1.setText((String)in.readObject());   
                    }
            catch(IOException i){
                i.printStackTrace();
            }
            catch(ClassNotFoundException c){
                c.printStackTrace();
            }                    
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try{
            FileOutputStream fout = new FileOutputStream("datachat.dat");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            oout.writeObject(ta1.getText());
        }
        catch(IOException i){
            i.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    
    }

    @Override
    public void windowActivated(WindowEvent e) {
       
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        
    }
}