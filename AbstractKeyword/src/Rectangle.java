
class Rectangle extends A implements Shape{
	private double ar;
	public void findArea() {
		ar=9*7.1;
	}
	public void printArea() {
		System.out.println("Rectangle's Area: "+ar);
		A a= new A();
		a.show();
	}
}
