class M {  //class M extends Object{
	int a=10;
	M(int x) { this();
		System.out.println("Hi X");
		a=x;
	}
	M() { super();
		System.out.println("Hello X");
	}
}
class N extends M{
	int b=20;
	N() { super(7);
		System.out.println("Hello Y");
	}
	N(int y) { this();
		System.out.println("Hi Y");
		b=y;
	}
}
public class InheritanceEx5 {
	public static void main(String[] args) {
		N n=new N(8);
		System.out.println(n.a);
		System.out.println(n.b);
	}
}