import java.util.Scanner;

public class DeretBilanganFibonacci {
	public static void main (String[]args) {
		int i, fn, fn1, fn2, n;
		Scanner scanl = new Scanner (System.in);
		System.out.print ("Jumlah Bilangan Fibonacci :");
		n = scanl.nextInt ();

		fn2=1;
		fn1=0;
		fn=0;

		for (i=1; i<=n; i++) {
			System.out.print (" "+fn);
			fn= fn1+fn2;
			fn2= fn1;
			fn1= fn;

		}
	}
}
