
class Circle extends A implements Shape{
	private double ar;
	public void findArea() {
		ar=3.14*5*5;
	}
	public void printArea() {
		System.out.println("Circle's Area: "+ar);
		A a= new A()	;	
		a.show();
	}
}
