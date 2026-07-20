package num_bas_pblm;

public class strong_number {
	public static void strong(int n) {
		int rem=0,res=0,temp=n;
		while(n>0) {
			rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			res+=fact;
			System.out.println(fact);
			n/=10;
		}
		if(temp==res) {
			System.out.println("strong no");
		}
		else
			System.out.println("not strong");
	}

	public static void main(String[] args) {
		strong(145);
	}

}
