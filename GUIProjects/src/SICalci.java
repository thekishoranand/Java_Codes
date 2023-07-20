import java.awt.*;
 
class GUI{
	Frame f;
	Button b1;
	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3;
	Panel p1,p2;
	GUI(){
	f=new Frame();
	f.setBackground(Color.GRAY);
	f.setSize(500,600);
	f.setLayout(null);
	f.setTitle("S.I. Calculator");
	
	p1 = new Panel();
	p1.setLayout(null); 
	p1.setBackground(Color.PINK);
	p1.setBounds(60,80,300,350);
	f.add(p1);
	 
	l1 = new Label ("Principle :");
	l1.setBounds(10,10,100,80);
	l1.setForeground(Color.BLACK);
	p1.add(l1);
	
	t1 = new TextField();
	t1.setBackground(Color.WHITE);
	t1.setBounds(50,40,140,20);
	p1.add(t1);
	
	
	l2 = new Label ("Rate :");
	l2.setBounds(15,50,100,90);
	l2.setForeground(Color.BLACK);
	p1.add(l2);
	
	t2 = new TextField();
	t2.setBackground(Color.WHITE);
	t2.setBounds(48,82,140,20);
	p1.add(t2);
	
	l3 = new Label ("Time :");
	l3.setBounds(20,100,110,90);
	l3.setForeground(Color.BLACK);
	p1.add(l3);
	
	t3 = new TextField();
	t3.setBackground(Color.WHITE);
	t3.setBounds(80,140,140,22);
	p1.add(t3);
	
	b1=new Button("FIND");
    b1.setBounds(110,220,40,30);
    p1.add(b1);
	
    
    p2 = new Panel();
    p2.setLayout(null); 
    p2.setBackground(Color.GREEN);
    p2.setBounds(60,450,300,100);
	f.add(p2);
	
	l4 = new Label ("SIMPLE INTEREST :");
	l4.setBounds(20,30,120,20);
	l4.setForeground(Color.BLACK);
	p2.add(l4);
	
	l5 = new Label ("-----------");
	l5.setBounds(150,30,120,20);
	l5.setForeground(Color.BLACK);
	p2.add(l5);
	
	  
	f.setVisible(true);
	
	}
}
public class SICalci
{
	public static void main(String[] args) {
		GUI g = new GUI();
		
	}
}
