//ABSTRACTION 
class Emplo{

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
public class OopEx2
{
public static void main(String[] args)
{
	Emplo a = new Emplo();
	Emplo b = new Emplo();
	Emplo c= new Emplo();
	a.input("Yoyo",12000,"Bollywood");
	b.input("Ram Charan",300000,"Goldmines");
	c.input("Teja Bhai",200000,"Manish South");
	a.show();
	b.show();
	c.show();
}
}