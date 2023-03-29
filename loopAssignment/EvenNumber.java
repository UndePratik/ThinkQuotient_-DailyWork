package com.loop;

public class EvenNumber {

	public static void main(String[] args) {
		int count=0;
		for(int i=1; i<=50; i++) {
			if(i%2 == 0) {
				System.out.print(i+" ");
				count++;
			}
			/*count++;
			if(count%2==0) {
				System.out.print(i+" ");
			}*/
		}

	}

}
