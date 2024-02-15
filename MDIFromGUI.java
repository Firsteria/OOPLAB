import java.awt.*;
import javax.swing.*;
public class MDIFromGUI extends JFrame{
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem mi1, mi2, mi3, ms2, ms3;
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;
    
    public MDIFromGUI (){
         try {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    fr = new JFrame("SubMenuItem Demo");
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mb = new JMenuBar();
    m1 = new JMenu("File");
    m2 = new JMenu("Edit");
    m3 = new JMenu("View");
    ms1 = new JMenu("New");
    mi1 = new JMenuItem("Open");
    mi2 = new JMenuItem("Save");
    mi3 = new JMenuItem("Exit");
    ms2 = new JMenuItem("Window");
    ms3 = new JMenuItem("Message");
    desktopPane = new JDesktopPane();
    frame1 = new JInternalFrame("Appliction01", true, true, true, true);
    frame2 = new JInternalFrame("Appliction02", true, true, true, true);
    frame3 = new JInternalFrame("Appliction03", true, true, true, true);
    
    fr.setJMenuBar(mb);
    mb.add(m1); mb.add(m2); mb.add(m3);
    m1.add(ms1); 
    m1.add(mi1);
    m1.addSeparator();
    m1.add(mi2);
    m1.addSeparator();
    m1.add(mi3);
    ms1.add(ms2);
    ms1.addSeparator();
    ms1.add(ms3);
    desktopPane.add(frame1);
    desktopPane.add(frame2);
    desktopPane.add(frame3);
    
    frame1.pack();
    frame1.setVisible(true);
    frame2.pack();
    frame2.setVisible(true);
    frame3.pack();
    frame3.setVisible(true);
    
    fr.add(desktopPane, BorderLayout.CENTER);
    fr.setMinimumSize(new Dimension(300, 300));
    fr.pack();
    fr.setVisible(true);
    fr.setExtendedState(this.MAXIMIZED_BOTH);
    
    
    }
}
