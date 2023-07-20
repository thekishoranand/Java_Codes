class Addition{
	void add(int a,int b) {
		int r=a+b;
		System.out.println("Sum: "+r);
	}
	String add(String a,String b) {
		String r=a+b;
		return r;
	}
	void add(double a,double b) {
		double r=a+b;
		System.out.println("Add: "+r);
	}
}
public class PolymorphismEx {
	public static void main(String[] args) {
		Addition a = new Addition();
		a.add(45, 90);
		String r=a.add("Hi", "INCAPP");
		System.out.println("Concatination: "+r);
		a.add(4.5, 7.3);
	}	
}
