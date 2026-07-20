package num_bas_pblm;

public class armstrong_number {
	public static void armstrong(int n) {
		int count=0,temp=n,rem,sum=1,result=0;
		while(n>0) {//153
			n/=10;
			count++;
		}
		//System.out.println(count);
		n=temp;
		while(n>0) {
			rem=n%10;
			for(int i=0;i<count;i++) {
				sum*=rem;
			}
			result+=sum;
			sum=1;
			n/=10;
			}
		if(result==temp) {
			System.out.println("armstrong no");
		}
		else
			System.out.println("not armstrong");
	}

	public static void main(String[] args) {
		armstrong(153);
	}

}
