package cst;

public class factorial {
	void fact(int n) {
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		factorial sn=new factorial();
		sn.fact(5);
	}

}
