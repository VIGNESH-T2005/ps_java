package num_bas_pblm;

public class harshad_number {
	public static void harshad(int n) {
		int rem,sum=0,temp=n;
		while(n>0) {
			rem=n%10;
			sum+=rem;
			n/=10;
		}
		if(temp%sum==0)
			System.out.println("harshad");
		else
			System.out.println("not harshad");
	}
	public static void main(String[] args) {
		harshad(19);
	}
}