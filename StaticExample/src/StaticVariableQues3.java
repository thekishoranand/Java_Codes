class C{
	static int x=1;
	int y=3;
	 void show() {
		System.out.println(x+" "+y);
		x++;
		y++;
	}
}
public class StaticVariableQues3 {
	public static void main(String[] args) {
		C c1=new C();
		C c2=new C();
		c1.x=7; c1.y=8;
		c2.x=5; c2.y=4;
		c1.show();
		c2.show();
		System.out.println(C.x);
	}

}
