class Employeeee{

	 String name;
	 int salary;
	 String  cname;
	 public void input() {
		 System.out.println("name,salary and cname");
	 }
		 
	public void show()
	{
	System.out.println(name+" "+salary+ " "+cname);	
	}
}		
public class OopEx3
{
public static void main(String[] args)
{
	Employeeee a = new Employeeee();
	Employeeee b = new Employeeee();
	Employeeee c= new Employeeee();
	a.input();
	b.input();
	c.input();
	a.show();
	b.show();
	c.show();
}
}



