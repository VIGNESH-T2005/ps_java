package cst;
public class leapyear {
	void leap(int n) {
		if(n<=0||n%4!=0)
			System.out.println("not a leap year");
		else if(n%100==0) {
			if(n%400==0)
				System.out.println("leap year");
			else
				System.out.println("not leap year");
		}
		else {
			System.out.println("leap year");  
		}	
	}
	public static void main(String[] args) {
		leapyear sn=new leapyear();
		sn.leap(2000);
	}
}
