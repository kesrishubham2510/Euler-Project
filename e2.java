package euler;

public class e2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double a=0,b=1,s=0,d=0;
	     //   System.out.print(a+" "+b+" ");
	        for(long f=0;d<=4000000;f++)
	        {
	        	d=a+b;
	          	boolean r=checkEven(d);
	        	if(r)
	        	{  	
	        		s=s+d;
	           	}
	        	a=b;
	        	b=d;
	        }
	        System.out.println(s);
		}

	private static boolean checkEven(double d) {
		// TODO Auto-generated method stub
		if(d%2==0)
			return true;
		else
		return false;
	}
}
