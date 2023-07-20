
public class WrapperClassEx1 {
	public static void main(String[] args)
	{
		String x = "25";
		int y = Integer.parseInt(x);
		double z = Double.parseDouble(x);
		{
			System.out.println(y);
			System.out.println(z);
		}
		
	}

}
