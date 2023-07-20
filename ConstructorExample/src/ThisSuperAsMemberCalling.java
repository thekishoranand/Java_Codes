class J{
	int x=10;
	void print() {
		System.out.println("Hello J");
	}
}
class K extends J{
	int y=20;
	int x=40;
	void m1() {
		int z=30;
		int x=50;
		System.out.println(x);//50
		System.out.println(this.x);//40
		System.out.println(super.x);//10
		System.out.println(y);//20
		System.out.println(z);//30
		print();//Hello B
		super.print();//Hello A
	}
	void m2() {
		System.out.println(x);//40
		System.out.println(y);//20
		//System.out.println(z);//error
	}
	void print() {
		System.out.println("Hello K");
	}
}
public class ThisSuperAsMemberCalling {
	public static void main(String[] args) {
		K k = new K();
		k.m1();
		System.out.println(k.x);//40
		//System.out.println(b.super.x);//error
		System.out.println(k.y);//20
		//System.out.println(b.z);//error
	}
}
