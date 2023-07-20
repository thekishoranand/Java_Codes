class AA {
	final void m1() {
		System.out.println("Hello A");
	}
	void m2() {
		System.out.println("Hi A");
	}
}
class BB extends AA {
//	void m1() {
//		System.out.println("fgfgjfgjf tj rthrth");
//	}
	void m2() {
		System.out.println("thrthytjytjyt rtj ytjyt");
	}
}
public class FinalMethodEx {
	public static void main(String[] args) {
		AA a=new BB();
		a.m1();
		a.m2();
	}
}
