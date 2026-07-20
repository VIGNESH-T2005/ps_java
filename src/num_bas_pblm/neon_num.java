package num_bas_pblm;
public class neon_num {
	public static void neon(int n) {
		int temp=n,result=0,rem=0,sqr;
		sqr=n*n;
		while(sqr>0) {
			rem=sqr%10;
			result+=rem;
			sqr/=10;
		}
		if(result==temp) {
			System.out.println("neon");
		}
		else
			System.out.println("not neon");
	}
	public static void main(String[] args) {
		neon(9);
	}
}
