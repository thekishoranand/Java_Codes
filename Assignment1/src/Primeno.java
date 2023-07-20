
public class Primeno {

	public static void main(String[] args) {
		int n=15 ,temp =0;
		for(int i=2;i<=n-1;i++)
		{
		if(n%i==0) 
		{
			temp = temp+1;
		}
	}
		{
		if(temp==0)
		{
			System.out.println(" a prime no");
		}
		else {
			
		System.out.println("not Prime no");
			}
		}
}
}



