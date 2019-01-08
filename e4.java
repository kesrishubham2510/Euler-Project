package euler;

public class e4 {

	public static void main(String[] args) {
		
		System.out.println("The largest pallindrome is ");
     int g=0;
     long a,b,c,z;
     long []p=new long[812000];
     for(a=100;a<1000;a++)
     {                                                       
    	for(b=999;b>=100;b--)
    	 {c=a*b;
    	 boolean d=checkPallindrome(c);
    	 if(d==true)
    	 {
    		p[g]=c;
    		g++;
    	 }
    	 }
     }
    System.out.println();
     z=max(p);
     System.out.println("The maximum pallindrome is "+z);
     
	}

	private static long max(long[] p) {
		
		long max=(long) 0;
		for(int f=0;f<p.length-1;f++)
		{
			if(p[f]>max)
				max=p[f];
			else 
				max=max;
						
		}
		return max;
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
