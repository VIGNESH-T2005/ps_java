package cst;

public class posneg {
	public void pn(int n) {
		if(n<0)
			System.out.println("Negative");
		else if(n>0)
			System.out.println("Positive");
		else
			System.out.println("Zero");
	}

	public static void main(String[] args) {
		posneg obj =new posneg();
		obj.pn(00);
	}
}
