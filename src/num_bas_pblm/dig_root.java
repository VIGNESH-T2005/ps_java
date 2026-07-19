package num_bas_pblm;

public class dig_root {
	public static void dig(int n) {
		int sum=0,rem;
		while(n/10!=0) {//1234 10 
			while(n>0) {//1234
				rem=n%10;//4 
				sum+=rem;//0+4+3+2+1 =10
				n=n/10;	//123 12 1 0	
			}
				n=sum;//10
				rem=0;//0
				sum=0;//0
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		dig_root sn = new dig_root();
		sn.dig(2019);
	}

}
