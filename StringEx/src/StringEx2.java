
public class StringEx2 {

	public static void main(String[] args) {
		String s1=new String("rahul");
		String s2="rahul";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toUpperCase());
		//char a[]="rahul";//error
		
		//String is by default Immutable(Not Modifiable)
		String s="Rahul Chauhan";
		System.out.println(s);
		String s3=s.toUpperCase();
		System.out.println(s3);
		System.out.println(s);
	}

}
