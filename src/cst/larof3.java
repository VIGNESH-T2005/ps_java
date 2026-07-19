package cst;

public class larof3 {
	public void lar(int a,int b,int c) {
		if(a>b&&b>c)
			System.out.println(a);
		else if(b>c)
			System.out.println(b);
		else
			System.out.println(c);
	}

	public static void main(String[] args) {
		larof3 obj=new larof3();
		obj.lar(0,8,9);
	}

}
