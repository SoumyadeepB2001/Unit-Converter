import java.util.*;
import java.awt.event.*;
import javax.swing.*; 
class converter extends JFrame implements KeyListener, ActionListener
{    
    JFrame f=new JFrame("Length Converter");
    JButton b;
    JTextField t;
    JTextField tt;
    JComboBox cb,cb2;
    converter()
    {
        JLabel lb0=new JLabel("LENGTH CONVERTER");
        t = new JTextField(30);
        tt = new JTextField(30);
        tt.setEditable(false);   
        String units[]={"Miles","Kilometers","Meters","Yards","Feet","Inches","Centimeters"};        
        cb=new JComboBox(units);    
        cb2=new JComboBox(units);
        b=new JButton("CONVERT");
        lb0.setBounds(400,20,1000,30); 
        t.setBounds(200,70,200,30);
        t.addKeyListener(this);
        tt.setBounds(650,70,200,30);
        b.setBounds(400,130,100,30); 
        b.addActionListener(this);
        cb.setBounds(50,70,90,30);    
        cb2.setBounds(500,70,90,30);   
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(cb);        
        f.add(cb2);        
        f.add(lb0);f.add(t);
        f.add(b);f.add(tt);
        f.setSize(910,300);
        f.setResizable(false);
        f.setLayout(null);    
        f.setVisible(true); 
    }
    @Override
    public void keyTyped(KeyEvent evt)
    {
        if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')|| evt.getKeyChar()=='\b'|| evt.getKeyChar()=='.') {
               t.setEditable(true);
            } else {
               t.setEditable(false);
            }
    }
    @Override
    public void keyPressed(KeyEvent evt){
    }
    @Override
    public void keyReleased(KeyEvent evt){
    }
    public void actionPerformed(ActionEvent e){    
       String s=t.getText();
       if(!s.equals(""))
       {
       double answer=0;
       double c=Double.parseDouble(s);
       String combo1 = (String)cb.getItemAt(cb.getSelectedIndex()); 
       String combo2 = (String)cb2.getItemAt(cb2.getSelectedIndex());
       
       if(combo1.equals("Kilometers"))
       {
           if(combo2.equals("Miles"))
                answer=c/1.609;
           if(combo2.equals("Yards"))
                answer=c*1093.61;
           if(combo2.equals("Feet"))
                answer=c*3280.84;
           if(combo2.equals("Inches"))
                answer=c*39370.1;
           if(combo2.equals("Kilometers"))
                answer=c;
           if(combo2.equals("Meters"))
                answer=c*1000;
           if(combo2.equals("Centimeters"))
                answer=c*100000;
       }   
       
       if(combo1.equals("Meters"))
       {
           if(combo2.equals("Miles"))
                answer=c/1609;
           if(combo2.equals("Yards"))
                answer=c*1.09361;
           if(combo2.equals("Feet"))
                answer=c*3.28084;
           if(combo2.equals("Inches"))
                answer=c*39.3701;
           if(combo2.equals("Kilometers"))
                answer=c/1000;
           if(combo2.equals("Meters"))
                answer=c;
           if(combo2.equals("Centimeters"))
                answer=c*100;
        }  
        
       if(combo1.equals("Centimeters"))
       {
           if(combo2.equals("Miles"))
                answer=c/160934;
           if(combo2.equals("Yards"))
                answer=c/91.44;
           if(combo2.equals("Feet"))
                answer=c/30.48;
           if(combo2.equals("Inches"))
                answer=c/2.54;
           if(combo2.equals("Kilometers"))
                answer=c/100000;
           if(combo2.equals("Meters"))
                answer=c/100;
           if(combo2.equals("Centimeters"))
                answer=c;
       }
       
       if(combo1.equals("Miles"))
       {
           if(combo2.equals("Miles"))
                answer=c;
           if(combo2.equals("Yards"))
                answer=c*1760;
           if(combo2.equals("Feet"))
                answer=c*5280;
           if(combo2.equals("Inches"))
                answer=c*63360;
           if(combo2.equals("Kilometers"))
                answer=c*1.60934;
           if(combo2.equals("Meters"))
                answer=c*1609.33999997549;
           if(combo2.equals("Centimeters"))
                answer=c*160934;
       }
       
       if(combo1.equals("Inches"))
       {
           if(combo2.equals("Miles"))
                answer=c/63360;
           if(combo2.equals("Yards"))
                answer=c/36;
           if(combo2.equals("Feet"))
                answer=c/12;
           if(combo2.equals("Inches"))
                answer=c;
           if(combo2.equals("Kilometers"))
                answer=c/39370;
           if(combo2.equals("Meters"))
                answer=c/39.37;
           if(combo2.equals("Centimeters"))
                answer=c*2.54;
       }
       
       if(combo1.equals("Yards"))
       {
           if(combo2.equals("Miles"))
                answer=c/1760;
           if(combo2.equals("Yards"))
                answer=c;
           if(combo2.equals("Feet"))
                answer=c*3;
           if(combo2.equals("Inches"))
                answer=c*36;
           if(combo2.equals("Kilometers"))
                answer=c/1094;
           if(combo2.equals("Meters"))
                answer=c/1.094;
           if(combo2.equals("Centimeters"))
                answer=c*91.44;
       }
       
       if(combo1.equals("Feet"))
       {
           if(combo2.equals("Miles"))
                answer=c/5280;
           if(combo2.equals("Yards"))
                answer=c/3;
           if(combo2.equals("Feet"))
                answer=c;
           if(combo2.equals("Inches"))
                answer=c*12;
           if(combo2.equals("Kilometers"))
                answer=c/3281;
           if(combo2.equals("Meters"))
                answer=c/3.281;
           if(combo2.equals("Centimeters"))
                answer=c*30.48;
       }
       s=Double.toString(answer);
       tt.setText(s);
    }
    else
        JOptionPane.showMessageDialog(null,"Enter a value to convert");
    }
    public static void main(String args[])
    {
       new converter();
    }
}