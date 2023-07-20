import java.awt.*;

class MeraGui extends Frame{
	Button b1,b2;
	Label l;
	TextField t;
	MeraGui(){
		setLayout(null);
		setTitle("Mera Pehla Frame");
		setSize(400,300);
		//setBackground(Color.YELLOW);
		setBackground(new Color(109, 205, 237));
		setLocationRelativeTo(null);
		
		b1=new Button("OK");
		b1.setBackground(Color.CYAN);
		b1.setForeground(Color.BLUE);
		b1.setBounds(60,80,50,40);
		add(b1);
		
		b2=new Button("HI");
		b2.setBackground(Color.CYAN);
		b2.setForeground(Color.BLUE);
		b2.setBounds(120,80,50,40);
		add(b2);
		
		l=new Label("hello INCAPP");
		l.setBounds(60,140,120,20);
		add(l);
		
		t=new TextField();
		t.setForeground(Color.RED);
		t.setBounds(60,180,120,40);
		add(t);
	}
}
public class FirstGuiAppUsingInheritance {

	public static void main(String[] args) {
		MeraGui g1=new MeraGui();
		g1.setVisible(true);
	}
}
