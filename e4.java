package euler;

public class e4 {

	public static void main(String[] args) {     
     long a,g=0,b,c,z;
        for(a=100;a<1000;a++)
     {                                                       
    	for(b=999;b>=100;b--)
    	 {c=a*b;
    	 boolean d=checkPallindrome(c);
    	 if(d==true)
    	 {   if(c>g)
    		g=c;
    	 }
    	 }
     }
     System.out.println("The maximum pallindrome is "+g);
     	}
	private static boolean checkPallindrome(long c) {
		
		long e=(long)0,t,k=c;
		
		while(c>0)
		{
			t=c%10;
			e=10*e+t;
			c=c/10;
		}
		if(k==e)
			return true;
		else
			return false;
	}
}
