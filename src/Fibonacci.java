
public class Fibonacci {

	public static void main(String args[]){
		int a, b, ans, iterations;
		a = 0; 
		b = 1;
		iterations = 10;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 0; i < iterations; i++){
			ans = a + b;
			System.out.println(ans);
			
			a = b;
			b = ans;
		}
	}
	
}
