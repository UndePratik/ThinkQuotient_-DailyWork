package Exercise;

import java.util.Scanner;

public class vote {
		public static boolean eligibleForVoting(int vote) {
			if(vote>18) {
				//System.out.println(" Person is eligible");
				return true;
			}else {
				//System.out.println(" Person is not eligible");
				return false;
			}
			
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int vote = sc.nextInt();
			
			System.out.println(eligibleForVoting(vote));
			//eligibleForVoting(vote);


	}

}
