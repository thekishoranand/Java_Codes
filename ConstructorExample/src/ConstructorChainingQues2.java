class Y{
	String a;
	int b;
	void show() {
		System.out.println(a+" "+b);
	}
	Y(){
		System.out.println("Hi Y");
	}
 	Y(String x){
		this();
		System.out.println("OK Y");
		a=x;
	}
	Y(String x,int y){
		//this();
		this("JKDHFHJDH");
		System.out.println("Hello Y");
		a=x;
		b=y;
	}
}
public class ConstructorChainingQues2 {
	public static void main(String[] args) {
		Y y1=new Y("XYZ",10);
		y1.show();
	}
}
