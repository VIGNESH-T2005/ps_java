package cst;

public class palindrome_no {
	void pall(int n) {//1234 123
		int temp=n,rev=0;
		while(n>0) {
		int rem=n%10;//4 3
		rev=rev*10+rem;
		n=n/10;//123
		}
		if(rev==temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}   
	}

	public static void main(String[] args) {  
		palindrome_no sn=new palindrome_no();
		sn.pall(1212);
	}

}
