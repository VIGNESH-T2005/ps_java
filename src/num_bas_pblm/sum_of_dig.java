package num_bas_pblm;

public class sum_of_dig {
	void sumdig(int n) {
		int sum=0;
		while(n>0) {//1234
			int rem=n%10;//4 3 2 1
			sum+=rem;//4+3
			n=n/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		sum_of_dig sn= new sum_of_dig();
		sn.sumdig(12345);

	}

}
