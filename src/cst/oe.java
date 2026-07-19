package cst;
public class oe {
	public String oddeven(int n) {
		String o="odd";
		String e="even";	
		if(n%2==0)
			return e;
		else
			return o;
	}
	public static void main(String[] args) {
		oe onj= new oe();
		String s=onj.oddeven(98);
		System.out.println(s);

	}
}
