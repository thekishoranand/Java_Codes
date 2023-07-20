class Dog{
	String name;
	int age;
	static String COLOR="White";
	void show() {
		System.out.println(name+" "+age+" "+COLOR);
	}
	void input(String n,int a) {
		name=n;
		age=a;
	}
	static void colorPrint() {
		System.out.println(COLOR);
		//System.out.println(name);//error
	}
	static void colorPut(String c) {
		COLOR=c;
	}
}
public class StaticMethodExample {
	public static void main(String[] args) {
		Dog.colorPrint();
		Dog a=new Dog();
		Dog b=new Dog();
		Dog c=new Dog();
		a.input("Tommy", 10);
		b.input("Ponty", 6);
		c.input("Jumbo", 8);
		a.show();
		b.show();
		c.show();
		a.colorPrint();
		Dog.colorPut("Black");
		Dog.colorPrint();
		a.show();
		b.show();
		c.show();
	}
}
