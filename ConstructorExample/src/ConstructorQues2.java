class A{
	static int x;
	String y;
	void show() {
		System.out.println(x+" "+y);
	}
	A(){
		System.out.println("Object Created");
		x++;
	}
}
public class ConstructorQues2 {
	public static void main(String[] args) {
		System.out.println("Hello Main");
		A a1=new A();
		A a2=new A();
		a1.show();
		a2.show();
	}
}
