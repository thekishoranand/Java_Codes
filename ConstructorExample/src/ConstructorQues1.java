class B{
	int x;
	String y;
	void show() {
		System.out.println(x+" "+y);
	}
	B(){
		System.out.println("Object Created");
		x=10;
		y="yoyo";
	}
	static {
		System.out.println("Hello B");
	}
}
public class ConstructorQues1 {
	public static void main(String[] args) {
		System.out.println("Hello Main");
		B b1=new B();
		B b2=new B();
		b1.show();
		b2.show();
	}
}
