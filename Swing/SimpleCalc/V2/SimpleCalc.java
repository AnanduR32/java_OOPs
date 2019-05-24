//importing all necessary packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Event;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//creating class with ActionListener interface implemented
public class SimpleCalc implements ActionListener{
    //declaring all the components and the variables
    JTextField t1,t2,t3;
    //o[] contains combobox items
    String o[]={"Add","Mul","Sub","Div"};
    JComboBox cb;
    JButton b;
    JLabel l1,l2,l3;
    //constructor of the class SimpleCalc
    SimpleCalc(){
        //object/components initialized
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        l1=new JLabel("Number 1 : ");
        l2=new JLabel("Number 2 : ");
        l3=new JLabel("Result : ");
        cb=new JComboBox(o);
        b=new JButton("Calculate");
        JFrame f=new JFrame("Simple Calculator");
        JPanel p=new JPanel();
        //creating a 4 x 2 grid style layout object
        GridLayout grid=new GridLayout(4,2);
        //setting the grid layout to the panel 'p'
        p.setLayout(grid);
        //adding components to the panel
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(cb);
        p.add(b);
        p.add(l3);
        p.add(t3);
        //registering the button as an EventListener
        b.addActionListener(this);
        //adding panel to the frame
        f.setContentPane(p);
        //setting dimensions of the frame
        f.setSize(400,500);
        //making frame visible
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        int n1,n2,result;
        n1=Integer.parseInt(t1.getText());
        n2=Integer.parseInt(t2.getText());
        int ch=cb.getSelectedIndex();
        if(ch==0){
            result=n1+n2;
        }
        else if(ch==1){
            result=n1*n2;
        }
        else if(ch==2){
            result=n1-n2;
        }
        else{
            result=n1/n2;
        }
        t3.setText(String.valueOf(result));
    }
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    public static void main(String[] args){
        //run program
        new SimpleCalc();
    }
}
