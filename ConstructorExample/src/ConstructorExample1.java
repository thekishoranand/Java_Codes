class Animal{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Animal(){
		System.out.println("Animal created");
		name="Dog";
		age=12;
	}
}
public class ConstructorExample1 {
	public static void main(String[] args) {
		Animal a=new Animal();
		Animal b=new Animal();
		Animal c=new Animal();
		a.show();
		b.show();
		c.show();
	}
}
