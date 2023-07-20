class B{
	static int x=9;
	String y;
	 void show() {
		 x++;
		System.out.println(x+" "+y);
	}
}
public class StaticVariableQues2 {
	public static void main(String[] args) {
		B b1=new B();
		B b2=new B();
		b1.x=7; b2.y="xyz";
		b1.show();
		b2.show();
	}
}

