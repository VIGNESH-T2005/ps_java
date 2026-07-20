package num_bas_pblm;

public class power_2_3 {
	public static void power(int n) {
		int temp=n;	
		if(n%2==0 ||n%3==0) {
			while(n%2==0) {
				n/=2;
				if(n==1)
					System.out.println("power of 2");
			}
			n=temp;
			while(n%3==0) {
				n/=3;
				if(n==1) {
					System.out.println("power of 3");
				}
			
			}
		}
		else
			System.out.println("not power of 2 or 3");
	}
	public static void main(String[] args) {
		power(81);

	}

}
