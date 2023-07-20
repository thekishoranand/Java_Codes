
public class WrapperClassEx {

	public static void main(String[] args) {
		Integer b=new Integer(10);//boxing
		int x=b.intValue();//unboxing
		System.out.println(x);
		
		Integer i=10;//auto-boxing
		int j=i;//auto-unboxing
	}

}
