class Person{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Person(String n,int a){
		System.out.println("Person created");
		name=n;
		age=a;
	}
}
public class ConstructorExample2 {
	public static void main(String[] args) {
		Person a=new Person("Ram",15);
		Person b=new Person("Tina",23);
		Person c=new Person("Kapil",56);
		a.show();
		b.show();
		c.show();
	}
}
