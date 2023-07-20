class A{
	int x;
	static String y;
	 void show() {
		System.out.println(x+" "+y);
	}
}
public class StaticVariableQues1 {
	public static void main(String[] args) {
		A a=new A();
		a.x=90; a.y="ram";
		A a2=new A();
		a2.x=40; a2.y="yoyo";
		a.show();
		a2.show();
	}
}
