class A{
	int x;
	String y;
	void show() {
		System.out.println(x+" "+y);
	}
	A(){
		System.out.println("Hi A");
	}
	A(String a,int b){
		this();
		System.out.println("OK A");
		x=b;
		y=a;
	}
	{
		System.out.println("This is the Initialize Block");
	}
}
public class InitializeBlockEx1 {

	public static void main(String[] args) {
		A a1=new A();
		A a2=new A("jj",10);
		System.out.println("This is the Main Block");
	}
}
