class X{
	String a;
	int b;
	void show() {
		System.out.println(a+" "+b);
	}
	X(){
		System.out.println("Hi X");
		a="yoyo";
		b=60;
	}
	X(String x,int y){
		this();
		System.out.println("Hello X");
		show();
		a=x;
		b=y;
	}
}
public class ConstructorChainingQues1 {
	public static void main(String[] args) {
		X x1=new X("XYZ",10);
		X x2=new X();
		x1.show();
		x2.show();
	}
}
