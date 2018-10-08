
public class gcd {
	
	public static int gcd(int n, int m){
		
		if (m == n)
			return m;
		else if (m > n)
			return gcd(m-n, n);
		else
			return gcd(m, n-m);
	}
	
	public static void main(String[] args){
		
		System.out.println(gcd(20,30));
	}

}
