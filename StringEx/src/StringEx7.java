import java.util.StringTokenizer;

public class StringEx7 {

	public static void main(String[] args) {
		String s="I love my INDIA. I am Rahul Chauhan. I live in NOIDA.";
		
        StringTokenizer st = new StringTokenizer(s," ");
        //StringTokenizer st = new StringTokenizer(s,"Rahul");
        int c=st.countTokens();
        System.out.println(c);
        
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
        
//		for(int x=1;x<=c;x++){
//                System.out.println(st.nextToken());
//        }
        
//        while(st.hasMoreTokens()) {
//	            System.out.println(st.nextToken());
//	    }
		
		//using split method
        String n[]=s.split(" "); 
		//String n[]=s.split("Rahul"); 
        for(String x:n)
            System.out.println(x);
	}

}
