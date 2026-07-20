package num_bas_pblm;

public class happy_number {
    public static void happy(int n) {
    	int rem,sqr,result=0;
    	while(n!=1 && n!=4) {//19
    		result=0;
    		while(n>0) {
    		rem=n%10;//9
    		sqr=rem*rem;//81
    		result+=sqr;//81+1
    		n/=10;
    		}	
    		n=result;

    	}	
    	if(n==1)
    		System.out.println("happy");
    	else
    		System.out.println("sad");
    }
	public static void main(String[] args) {
		happy(19);
	}

}
