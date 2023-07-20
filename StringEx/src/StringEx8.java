
public class StringEx8 {

	public static void main(String[] args) {
		String s="nitin";
		
		for(int x=0;x<s.length();x++){
            for(int j=0;j<=x;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
	}

}
