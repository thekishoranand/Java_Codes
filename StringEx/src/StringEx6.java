
public class StringEx6 {

	public static void main(String[] args) {
		//StringBuilder s="Hi";//error
		
		//StringBuilder or StringBuffer classes create mutable String.

		//StringBuffer s=new StringBuffer("Hi Incapp");//java-1(methods synchronised)
		StringBuilder s=new StringBuilder("Hi Incapp");//java-5(methods NOT synchronised)
        System.out.println(s);
		s.append("rahul");
		System.out.println(s);
		s.append(12);
		System.out.println(s);
		s.insert(2, "incapp");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.replace(2,8,"india");
		System.out.println(s);
		s.delete(2,8);
		System.out.println(s);
		
        //conversion from String -> StringBuilder and StringBuilder -> String
        String a="I love my INDIA";//immutable string
        StringBuilder b=new StringBuilder(a);//mutable string
        String c=b.toString();//immutable string
	}

}
