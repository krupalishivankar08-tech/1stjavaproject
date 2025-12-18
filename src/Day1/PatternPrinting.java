/**
 * 
 */
package Day1;

/**
 * 
 */
public class PatternPrinting {
	public static void main(String[]args) {
		for(int i=1;i<=5;i++) {
			System.out.println("*");
		}
		
		//creating *****pattern by using *
		for(int i=1;i<=5;i++) {
			System.out.print("*");
		    }
		//creating***** 5 times in one row pattern by using *
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
		    System.out.println();
			}
		// removing 3 rows by using single * 
		for(int i =1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(" ");
			}		
			System.out.println("*");
			}
		long a=10;
		long b=2147483648L;
		System.out.println(a);
		System.out.print(b);
	}
 }
