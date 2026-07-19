package num_bas_pblm;

public class perfect_number {
	public static void perfect(int n) {
		int sum=0;
		for (int i = 1; i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n)
			System.out.println("perfect number");
		else
			System.out.println("not perfect");
		
		
	}

	public static void main(String[] args) {
		perfect(6);

	}

}
