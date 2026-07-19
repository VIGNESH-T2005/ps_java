package num_bas_pblm;

public class prime_num {
 public static void prime(int n) {
	 int count=0;
	 for(int i=1;i<=n;i++) {
		 if(n%i==0)
			 count++;
	 }
	 if(count==2)
		 System.out.println("Prime");
	 else
		 System.out.println("not prime");
 }
	public static void main(String[] args) {
		prime(129);
	}

}
