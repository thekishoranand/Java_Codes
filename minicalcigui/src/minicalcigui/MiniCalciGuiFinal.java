package minicalcigui;
import java.awt.*;
import java.awt.event.*;
class Gui extends Frame{
    Button b1,b2,b3,b4,b5;
    Label l1,l2,l3,l4;
    TextField t1,t2;
    Panel p;
    class A implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                String s1=t1.getText();
                String s2=t2.getText();
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                int n=n1+n2;
                l4.setText(n+"");
                //or  
                //l4.setText(String.valueOf(n));
            }catch(Exception ex){
                l4.setText("Invalid Data");
            }
        }
    }
    class B implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                String s1=t1.getText();
                String s2=t2.getText();
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                int n=n1-n2;
                l4.setText(n+"");
            }catch(Exception ex){
                l4.setText("Invalid Data");
            }
        }
    }
    class C implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                String s1=t1.getText();
                String s2=t2.getText();
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                int n=n1*n2;
                l4.setText(n+"");
            }catch(Exception ex){
                l4.setText("Invalid Data");
            }
        }
    }
    class D implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                String s1=t1.getText();
                String s2=t2.getText();
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                int n=n1/n2;
                l4.setText(n+"");
            }catch(Exception ex){
                l4.setText("Invalid Data");
            }
        }
    }
    class E implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                String s1=t1.getText();
                String s2=t2.getText();
                int n1=Integer.parseInt(s1);
                int n2=Integer.parseInt(s2);
                int n=n1%n2;
                l4.setText(n+"");
            }catch(Exception ex){
                l4.setText("Invalid Data");
            }
        }
    }
    Gui(){
        setBackground(Color.GREEN);
        setSize(400,300);
        setLocationRelativeTo(null);
        setLayout(null);
        setTitle("Mini Calci");
        
        p=new Panel();
        p.setLayout(null);
        p.setBackground(Color.GRAY);
        p.setBounds(50,70,320,170);
        add(p);
        
        l1=new Label("Enter 1st No:");
        l1.setBounds(30,30,120,20);
        l1.setForeground(Color.WHITE);
        p.add(l1);
        t1=new TextField();
        t1.setForeground(Color.RED);
        t1.setBounds(160,30,100,20);
        p.add(t1);
        l2=new Label("Enter 2nd No:");
        l2.setBounds(30,70,120,20);
        l2.setForeground(Color.WHITE);
        p.add(l2);
        t2=new TextField();
        t2.setForeground(Color.RED);
        t2.setBounds(160,70,100,20);
        p.add(t2);
        b1=new Button("+");
        b1.addActionListener(new A());
        b1.setBounds(30,110,50,40);
        p.add(b1);
        b2=new Button("-");
        b2.addActionListener(new B());
        b2.setBounds(85,110,50,40);
        p.add(b2);
        b3=new Button("*");
        b3.addActionListener(new C());
        b3.setBounds(140,110,50,40);
        p.add(b3);
        b4=new Button("/");
        b4.addActionListener(new D());
        b4.setBounds(195,110,50,40);
        p.add(b4);
        b5=new Button("%");
        b5.addActionListener(new E());
        b5.setBounds(250,110,50,40);
        p.add(b5);
        
        l3=new Label("Answer: ");
        l3.setBounds(50,250,100,20);
        add(l3);
        l4=new Label("---------------");
        l4.setForeground(Color.RED);
        l4.setBounds(160,250,200,20);
        add(l4);
    }
}
public class MiniCalciGuiFinal {
    public static void main(String[] args) {
    	Gui g=new Gui();
        g.setVisible(true);
    }
}
