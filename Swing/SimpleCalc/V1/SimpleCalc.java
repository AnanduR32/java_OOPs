import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Event;
public class SimpleCalc implements ActionListener{
    JTextField t1,t2,t3;
    JButton b1,b2;
    JLabel l1,l2,l3;
    SimpleCalc(){
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        l1=new JLabel("Number 1 : ");
        l2=new JLabel("Number 2 : ");
        l3=new JLabel("Result : ");
        b1=new JButton("Add");
        b2=new JButton("Sub");
        JFrame f=new JFrame("Simple Calculator");
        JPanel p=new JPanel();
        GridLayout grid=new GridLayout(4,2);
        p.setLayout(grid);
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(b1);
        p.add(b2);
        p.add(l3);
        p.add(t3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        f.setContentPane(p);
        f.setSize(400,500);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        int n1,n2,result;
        n1=Integer.parseInt(t1.getText());
        n2=Integer.parseInt(t2.getText());
        if(ae.getSource()==b1){
            result=n1+n2;
        }
        else{
            result=n1-n2;
        }
        t3.setText(String.valueOf(result));
    }
    public static void main(String[] args){
        new SimpleCalc();
    }
}