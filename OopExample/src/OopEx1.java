class Employee{

	 String name;
	 int salary;
	 String cname;
}
public class OopEx1
{
public static void main(String[] args)
{
Employee a=	new Employee();
Employee b=	new Employee();
Employee c=	new Employee();
a.name = "Ram Kumar";
a.salary= 12000;
a.cname = "TCS";
b.name = "Shiv";
b.salary= 12000;
b.cname="Amaz";
c.name="Shiva";
c.salary=12300;
c.cname="Vestige";
System.out.println(a.name +" "+a.salary+ " "+a.cname);
System.out.println(b.name +" "+b.salary+ " "+b.cname);
System.out.println(c.name +" "+c.salary+ " "+c.cname);
}

}



