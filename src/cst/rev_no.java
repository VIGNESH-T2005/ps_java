package cst;

public class rev_no {
	void rev(int n) {
		int rev=0;
		while(n>0) {//12345 1234
			int rem=n%10;//5 4
			rev=rev*10+rem;
			n=n/10;//1234
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		rev_no sn=new rev_no();
		sn.rev(12345);

	}

}
