class MyClass{
	static int x=1;
	int y=3;
	 void show() {
		System.out.println(x+" "+y);
	}
	 static {
		 System.out.println("Hi MyClass");
	 }
	 static {
		 System.out.println("Hello MyClass");
	 }
}
public class StaticQues4 {
	public static void main(String[] args) {
		System.out.println("Hi Main");
		MyClass m1=new MyClass();
		MyClass m2=new MyClass();
		m1.show();
		m2.show();
	}
	 static {
		 System.out.println("Hello INCAPP");
	 }
}

