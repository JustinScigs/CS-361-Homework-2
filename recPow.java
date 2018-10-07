
public class recPow {
	
	public static int recPow(int n){
		
		if (n == 0)
			return 1;
		else
			return 2 * recPow(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=0; i<=30; i++)
			System.out.println(i+": " + recPow(i));
	}

}
