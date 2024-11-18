import java.util.*;
import java.awt.*;
import javax.swing.*;
public class Rough{
    public static void main(String[] args){
        JFrame frame=new JFrame("WhatsApp");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(380,600);
        frame.setLayout(null);
        JPanel p1=new JPanel();
        p1.setBackground(new Color(7,94,84));
        p1.setBounds(0,0,380,60);
        p1.setLayout(null);
        //frame.add(p1);
        ImageIcon image = new ImageIcon(("3.png"));
        
        JLabel back=new JLabel(image);
        back.setIcon(image);
        back.setBounds(5,5,25,25);
        back.setForeground(Color.red);
        back.setLayout(null);
        p1.add(back);
        frame.add(p1);
        JPanel p2=new JPanel();
        p2.setBounds(0,60,380,480);
        p2.setBackground(Color.LIGHT_GRAY);
        frame.add(p2);
        JTextField t1=new JTextField("Write here...");
        t1.setBounds(0,540,300,30);
        t1.setBackground(Color.WHITE);
        t1.setForeground(Color.MAGENTA);
        t1.setLayout(null);
        frame.add(t1);
        
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        //frame.setLocation(160,30);
        //frame.setSize(380,600);
        //frame.setResizable(false);
        frame.setVisible(true);
        
    }
}
        