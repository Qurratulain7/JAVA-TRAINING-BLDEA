package Trainingcodes;
/**
 * 
 */
import java.util.Scanner;
/**
 * @author Najmunnisa K
 *
 */
public class program2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n= sc.nextInt();
		int count=1;
		for(int i=1; i<=n ;i++) {
		for(int j=1; j<=n; j++) {
		System.out.print(count+" ");	
		count++;
		}
		System.out.println("");
			

	}

}}
