class AA{
	private int x=10;
	void m1() {
		System.out.println("Hello A");
	}
	void showX() {
		System.out.println(x);
	}
}
class BB extends AA{
	int y=20;
	void m2() {
		System.out.println("Hello B");
		//System.out.println(x);//ERROR
		showX();
	}
}
public class InheritanceEx2 {
	public static void main(String[] args) {
		AA a= new AA();
		//System.out.println(a.x);//ERROR
		a.showX();
		a.m1();
		BB b = new BB();
		//System.out.println(b.x);//ERROR
		b.showX();
		b.m1();
		System.out.println(b.y);
		b.m2();
	}
}