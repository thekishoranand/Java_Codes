class Person{
	int age;
	String name;
}
class Student extends Person{
	int roll;
	void doStudy() {
		System.out.println("Student do Study");
	}
}
class Employee extends Person{
	int salary;
	void doJob() {                                          
		System.out.println("Employee do Job");
	}
}
public class InheritanceHierarchial {
	public static void main(String[] args) {
		Student s=new Student();
		s.name="Rahul"; 
		s.age=85;
		s.roll=101;
		System.out.println(s.name+s.age+s.roll);
		s.doStudy();
		Employee e=new Employee();
		e.name="YoYo Gupta";
		e.age=56;
		e.salary=1000000;
		System.out.println(e.name+e.age+e.salary);
		e.doJob();
	}
}
