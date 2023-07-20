class TV{
	String serialNo;
	int screenSize;
	static String CNAME;
	void show() {
		System.out.println(serialNo+" "+screenSize+" "+CNAME);
	}
	void input(String n,int s) {
		serialNo=n;
		screenSize=s;
	}
	static {
		CNAME="LG";
		System.out.println("TV construction process starting");
	}
}
public class StaticBlockExample {
	public static void main(String[] args) {
		TV a=new TV();
		TV b=new TV();
		TV c=new TV();
		a.input("4s654d4", 42);
		b.input("676ghfgh56", 32);
		c.input("54gh56654", 52);
		a.show();
		b.show();
		c.show();
	}
}
//Sabse pehle static block chalega to usme kuch v ho wo pehle print hoga