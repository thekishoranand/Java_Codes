public class ArraysEx8 {
	public static void main(String[] args) {
//		int a[]= {3,5,7,8};
//		int b[]= {5,8,3};
//		int c[]= {1,24,5,6,73};
		
		//int[]a[]=new int[][] {{3,5,7,8},{5,8,3},{1,24,5,6,73}};//allowed
		//int[][]a=new int[][] {{3,5,7,8},{5,8,3},{1,24,5,6,73}};//allowed
		//int a[][]=new int[][] {{3,5,7,8},{5,8,3},{1,24,5,6,73}};//allowed
		int[][]a={{3,5,7,8},{5,8,3},{1,24,5,6,73}};
		
		for(int x=0;x<a.length;x++) {
			for(int y=0;y<a[x].length;y++) {
				System.out.print(a[x][y]+" ");
			}
			System.out.println();
		}
		
		for(int x=0;x<a.length;x++) {
			for(int y:a[x]) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		for(int x[]:a) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}
