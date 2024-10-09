import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing02 extends JFrame implements ActionListener
{
    JRadioButton eng, doc;
    ButtonGroup bg;
    JTextField jtf;
    JCheckBox bcd, ccb, acb;
    JTextArea jta;
    Swing02 ()
    {
        eng = new JRadioButton ("Engineer");
        doc = new JRadioButton ("Doctor");
        bg = new ButtonGroup ();
        bg.add (eng);
        bg.add (doc);
        jtf = new JTextField (20);
        bcd = new JCheckBox ("Bike");
        ccb = new JCheckBox ("Car");
        acb = new JCheckBox ("Aeroplane");
        jta = new JTextArea (3, 20);
        Container c = this.getContentPane ();
        c.setLayout (new FlowLayout ());
        
        // Registering the listeners with the components
        eng.addActionListener (this);
        doc.addActionListener (this);
        bcd.addActionListener (this);
        ccb.addActionListener (this);
        acb.addActionListener (this);
        c.add (eng);
        c.add (doc);
        c.add (jtf);
        c.add (bcd);
        c.add (ccb);
        c.add (acb);
        c.add (jta);
        this.setVisible (true);
        this.setSize (500, 500);
        this.setTitle ("Selection Example");
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed (ActionEvent ae)
    {
        if (ae.getSource () == eng)
        {
         jtf.setText ("You are an Engineer");
        }
        if (ae.getSource () == doc)
        {
         jtf.setText ("You are an Doctor");
        }
        String str = " ";
        if (bcd.isSelected ())
        {
         str += "Bike\n";
        }
        if (ccb.isSelected ())
        {
         str += "Car\n";
        }
        if (acb.isSelected ())
        {
         str += "Aeroplane\n";
        }
        jta.setText (str);
    }
    public static void main (String[]args)
    {
        new Swing02 ();
    }
}