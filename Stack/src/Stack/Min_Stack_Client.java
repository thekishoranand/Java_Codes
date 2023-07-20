package Stack;

public class Min_Stack_Client {

	public static void main(String[] args) throws Exception {
		Min_Stack ms = new Min_Stack();
		ms.push(10);
		ms.push(20);
		ms.push(30);
		ms.push(40);
		ms.push(50);
		ms.push(9);
	   System.out.println(ms.min());
	   System.out.println(ms.pop());
	   System.out.println(ms.pop());
	   System.out.println(ms.min());
	
		

	}

}
