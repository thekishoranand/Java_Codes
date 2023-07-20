class XX { 
	int a=10;
	XX(int x) { 
		System.out.println("Hi X");
		a=x;
	}
	XX() { 
		System.out.println("Hello X");
	}
}
class YY extends XX{
	int b=20;
	YY() { 
		super(8);
		//super();
		System.out.println("Hi Y");
	}
}
public class InheritanceEx4 {
	public static void main(String[] args) {
		YY y=new YY();
		System.out.println(y.a);
		System.out.println(y.b);
	}
}