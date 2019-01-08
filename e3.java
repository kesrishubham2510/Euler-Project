package euler;
import java.math.BigInteger;
import java.util.Scanner;
public class e3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("programme initiated.....");
   //Scanner s=new Scanner(System.in);
   // BigInteger a,b,c;
    //a=s.nextBigInteger();
   double a=600851475143.0,b,c=0;
   for(b=2;b<a;b++)
    {
    	if(a%b==0)
    	{
    		boolean r=checkPrime(b);
    		  if(r)
    		  {
    			  c=b;
    			  System.out.println(c);
    		  }
    	}
    }
	}
	public static boolean checkPrime(double t)
	{
		long u,x=0;
		for(u=2;u<=Math.sqrt(t);u++)
		{
			if(t%u==0)
				{   
				    x++;
				    break;
	         	}
			}
	   if(x==0)
		   return true;
	   else
		   return false;
          		
}  
}
