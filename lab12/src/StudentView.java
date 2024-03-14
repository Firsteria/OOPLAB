import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class StudentView implements ActionListener, WindowListener, WindowFocusListener{
    private JFrame fr;
    private JPanel p1, p2, p3;
    private JLabel la1, la2, la3;
    private JTextField tf1, tf2, tf3;
    private JButton btn1, btn2;
    private Student s;
    public StudentView(){
        s = new Student();
        fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        la1 = new JLabel("ID:");
        la2 = new JLabel("Name:");
        la3 = new JLabel("Money:");
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf3.setEditable(false);
        
        fr.addWindowFocusListener(this);
        fr.addWindowListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        
        p1.setLayout(new GridLayout(2,1));
        p2.setLayout(new GridLayout(3, 2));
        p3.setLayout(new FlowLayout());
        p2.add(la1);
        p2.add(tf1);
        p2.add(la2);
        p2.add(tf2);
        p2.add(la3);
        p2.add(tf3);
        p3.add(btn1);
        p3.add(btn2);
        p1.add(p2);
        p1.add(p3);
        fr.add(p1);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(false);
        fr.setSize(300, 150);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(btn1)){
            s.setID(Integer.parseInt(tf1.getText()));
            s.setName(tf2.getText());
            s.setMoney(s.getMoney() + 100);
            tf3.setText("" + s.getMoney());
        }
        else if(ae.getSource().equals(btn2)){
            s.setMoney(s.getMoney() - 100);
            tf3.setText("" + s.getMoney());
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try {File file = new File("StudentM.dat");
        if(file.exists()){
            FileInputStream fin = new FileInputStream("StudentM.dat");
            ObjectInputStream oin = new ObjectInputStream(fin);
            s = (Student)oin.readObject();
            tf1.setText("" + s.getID());
            tf2.setText("" + s.getName());
            tf3.setText("" + s.getMoney());
        }
        }
            catch (IOException i) {
                i.printStackTrace();
            } catch (ClassNotFoundException c) {
                c.printStackTrace();
            } catch (NullPointerException n) {
                n.printStackTrace();
            }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fout = new FileOutputStream("StudentM.dat"); 
                ObjectOutputStream oout = new ObjectOutputStream(fout)) {

            oout.writeObject(s);
            System.out.println("Close");
        } catch (IOException i) {
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

    @Override
    public void windowGainedFocus(WindowEvent e) {
        
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        
    }
    
}
