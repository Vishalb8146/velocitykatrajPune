package logical_programming;

import java.util.Scanner;

public class MultiplicationWithoutOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i<=num2; i++) {
			sum=sum+num1;
		}
		System.out.println(sum);
		

	}

}
