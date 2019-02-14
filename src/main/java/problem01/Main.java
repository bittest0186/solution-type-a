package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		
		int count = 0;
		int res = 0;
		
		if(number>=1) {
			res = number%10;
			if(res == 3 || res == 6 || res == 9) {
				count++;
			}
			res = number/10;
			if(res == 3 || res == 6 || res == 9) {
				count++;
			}
		}
		
		number = count;
		
		return number;
	}
}