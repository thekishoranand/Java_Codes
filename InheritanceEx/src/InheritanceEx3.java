class X { 
	int a=10;
	X() { 
		System.out.println("Hi X");
	}
}
class Y extends X{
	int b=20;
	Y() { super();
		System.out.println("Hi Y");
	}
}
public class InheritanceEx3 {
	public static void main(String[] args) {
		Y y=new Y();
		System.out.println(y.a);
		System.out.println(y.b);
	}
}