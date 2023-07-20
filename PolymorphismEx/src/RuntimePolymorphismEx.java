class AA{
	void m1() {
		System.out.println("Hello A");
	}
}
class BB extends AA{
	void m1() {
		System.out.println("Hello B");
	}
}
class CC extends AA{
	void m1() {
		System.out.println("Hello C");
	}
}
public class RuntimePolymorphismEx {
	public static void main(String[] args) {
		AA a=new AA();
		a.m1();
		a=new BB();
		a.m1();
		a=new CC();
		a.m1();
	}	
}
