class Triangle extends A implements Shape{
	private double ar;
	public void findArea() {
		ar=8.2*4.1/2;
	}
	public void printArea() {
		System.out.println("Triangle's Area: "+ar);
		A a = new A();
		a.show();
		}
}
