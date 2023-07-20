 class Employ{

	 String name;
	 int salary;
	 String  cname;
	 public void input(String n,int s,String c)
	 
	 {
		 name = n;
		 salary = s;
		 cname = c;
		 System.out.println("name,salary and cname");
	 }
		 
	public void show()
	{
	System.out.println(name+" "+salary+ " "+cname);	
	}
}		
public class OopEx4
{
public static void main(String[] args)
{
	Employ a = new Employ();
	Employ b = new Employ();
	Employ c= new Employ();
	a.input("Yoyo",12000,"Bollywood");
	b.input("Ram CHaran",300000,"Goldmines");
	c.input("Teja Bhai",200000,"Manish South");
	a.show();
	b.show();
	c.show();
}
}



