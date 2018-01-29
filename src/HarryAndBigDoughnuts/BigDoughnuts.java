package HarryAndBigDoughnuts;

import java.util.Scanner;

public class BigDoughnuts {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t,c,k,w;
		
		t=sc.nextInt();
		while(t!=0) {
			
			c=sc.nextInt();
			k=sc.nextInt();
			w=sc.nextInt();
			
			if(c*w <= k) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
				
		}
	}

}
