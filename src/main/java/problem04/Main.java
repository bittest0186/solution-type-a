package problem04;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Random rnd = new Random();
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();

		for(int j=0;j<2;j++) {
			for(int i=0;i<3;i++) {
				if(j==0) {
					A.add(rnd.nextInt(9)+1);
				}else {
					B.add(rnd.nextInt(9)+1);
				}
			}
		}
		
		//출력
		for(int j=0;j<2;j++) {
			for(int i=0;i<3;i++) {
				if(j==0) {
					System.out.print(A.get(i));
				}else {
					System.out.print(B.get(i));
				}
			}
		}
		
		
		
	}
}