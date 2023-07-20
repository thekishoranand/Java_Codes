
public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		Toh(3, "T1", "T2", "T3");

	}
// t1 = src, t2 = destination, t3 = helper
	public static void Toh(int n, String t1, String t2, String t3) {
		if (n == 0) {
			return;
		}

		Toh(n - 1, t1, t3, t2);
		System.out.println(n + "th disc move from" + t1 + " to " + t2);
		Toh(n - 1, t3, t2, t1);
	}

}
