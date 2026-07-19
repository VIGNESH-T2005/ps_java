package cst;

public class multitables {
	void multitab(int n){
		for(int i=1;i<11;i++) {
			System.out.println(n+" "+'x'+" "+i+" "+"="+" "+ n*i);
		}
	}

	public static void main(String[] args) {
		multitables sn = new multitables();
		sn.multitab(5);
	}

}
