class Bird{
	String name;
	int age;
	void show() {
		System.out.println(name+" "+age);
	}
	Bird(String n,int a){
		System.out.println("Bird created with parameter");
		name=n;
		age=a;
	}
	Bird(){
		System.out.println("Bird created without parameter");
	}
}
public class ConstructorExample3 {
	public static void main(String[] args) {
		Bird a=new Bird("jjfjj",7);
		Bird b=new Bird();
		Bird c=new Bird("iouio",4);
		a.show();
		b.show();
		c.show();
	}
}
