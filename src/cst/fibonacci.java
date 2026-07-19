package cst;

public class fibonacci {
	void fibo(int n) {
		int a=-1,b=1,c=0;
		for(int i=1;i<=n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}

	public static void main(String[] args) {
		fibonacci sn =new fibonacci();
		sn.fibo(7);
	}

}
