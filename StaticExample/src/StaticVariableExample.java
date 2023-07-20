class Employee{
	String name;
	int salary;
	static String cname="ABC";
	static String country="INDIA";
	void show() {
		System.out.println(name+" "+salary+" "+cname+" "+country);
	}
	void input(String n,int s) {
		name=n;
		salary=s;
	}
}
public class StaticVariableExample {
	public static void main(String[] args) {
		Employee a=new Employee();
		Employee b=new Employee();
		Employee c=new Employee();
		a.input("Ram Kumar", 78000);
		b.input("Tina Sharma", 67000);
		c.input("JK Gupta", 98000);
		a.show();
		b.show();
		c.show();
		//Employee.salary=120000;
		a.salary=120000;
		Employee.cname="XYZ";
		a.cname="XYZ";
		a.show();
		b.show();
		c.show();
	}
}

