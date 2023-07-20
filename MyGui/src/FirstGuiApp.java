import java.awt.*;

class MyGui{
	Frame f;
	Button b1,b2;
	Label l;
	TextField t;
	MyGui(){
		f=new Frame();
		f.setLayout(null);
		f.setTitle("Mera Pehla Frame");
		f.setSize(400,300);
		//f.setBackground(Color.YELLOW);
		f.setBackground(new Color(109, 205, 237));
		f.setLocationRelativeTo(null);
		
		b1=new Button("OK");
		b1.setBackground(Color.CYAN);
		b1.setForeground(Color.BLUE);
		b1.setBounds(60,80,50,40);
		f.add(b1);
		
		b2=new Button("HI");
		b2.setBackground(Color.CYAN);
		b2.setForeground(Color.BLUE);
		b2.setBounds(120,80,50,40);
		f.add(b2);
		
		l=new Label("hello INCAPP");
		l.setBounds(60,140,120,20);
		f.add(l);
		
		t=new TextField();
		t.setForeground(Color.RED);
		t.setBounds(60,180,120,40);
		f.add(t);
		
		f.setVisible(true);
	}
}
public class FirstGuiApp {

	public static void main(String[] args) {
		MyGui g1=new MyGui();
	}
}
