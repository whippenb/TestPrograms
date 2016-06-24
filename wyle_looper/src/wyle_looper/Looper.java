package wyle_looper;

import java.util.Scanner;

public class Looper {
		/*
		 for (int i = 1; i <= 5; i++) { for (int j = 1; j <= (5 - i); j++) {

		System.out.print(".");

		} for (int k = 1; k <= i; k++) {

		System.out.print(i);

		}

		System.out.println();

		}
		 */
		
	public void Recursion (int i, int n, int current){ //Since I knew I'd have to think about it as 'n' instead of 5, I went straight for recursion
		if(current<=n-i){
			System.out.print(".");
			this.Recursion(i, n, current+1);
		}else{
			System.out.print(i);
			if(current==n){
				System.out.println("");
				return;
			}
			this.Recursion(i, n, current+1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Looper lp = new Looper();
		System.out.println("Enter an Integer");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++){
			lp.Recursion(i, n, 1);
		}
		//This was the best answer I could think of since everything else I could think of would get stupidly long for larger numbers
	}

}
