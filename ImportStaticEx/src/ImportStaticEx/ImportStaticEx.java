package ImportStaticEx;
//import static p1.A.y;
//import static p1.A.m2;
import static p1.A.*;
import p1.A;

import java.awt.Frame;

//import java.lang.*;//by default import
public class ImportStaticEx {
	public static void main(String[] args) {
		System.out.println(y);
		m2();
		A a=new A();
		System.out.println(a.x);
		a.m1();
		
		Frame f=new Frame();
		f.setVisible(true);
	}
}
