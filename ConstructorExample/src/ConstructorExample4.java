class Trainer{
	String name;
	int age;
	String category;
	int exp;
	int salary;
	String phone;
	void show() {
		System.out.println(name+" "+age+" "+category+" "+exp+" "+salary+" "+phone);
	}
	Trainer(){
		System.out.println("Hi Trainer");
	}
	Trainer(String n,int a,String c){
		System.out.println("Hello Trainer");
		name=n;
		age=a;
		category=c;
	}
	Trainer(String n,int a,String c,int e,int s,String p){
		this(n,a,c);
		exp=e;
		salary=s;
		phone=p;
	}
}
public class ConstructorExample4 {
	public static void main(String[] args) {
		Trainer t1=new Trainer();
		Trainer t2=new Trainer("Ram Kumar",22,"IT Trainer");
		Trainer t3=new Trainer("JJ Sharma",56,"GYM Trainer",20,500000,"9876598765");
		t1.show();
		t2.show();
		t3.show();
	}
}
