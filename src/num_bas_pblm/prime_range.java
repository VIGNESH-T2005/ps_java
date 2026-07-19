package num_bas_pblm;

public class prime_range {
	public static void prime(int a,int b) {
		int start=a,n=b,count=0;
		for(int i =start;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			if(i%j==0)
				count++;
			}
			if(count==2) {
				System.out.println(i);
			}
			count=0;
		}
	}

	public static void main(String[] args) {
		prime(10,30);
	}

}
