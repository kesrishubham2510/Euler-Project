package euler;

public class e7 {
public static void main(String []args)
{
	long a,b=0,c,pr[]=new long[10001];
	  
	System.out.println("Programme Initiated");
	for(a=2;b!=10001;a++)
	{  
			boolean d=checkPrime(a);
	         if(d==true)
     	       {
     	    	//   System.out.println(a);
     	    	pr[(int)b]=a;
     	       	b++;
     	    	
     	       }    	    
		}
	//System.out.println();
	System.out.println(pr[10000]);
	/*for(int t=0;t<1001;t++)
		{
		System.out.println(pr[t]);
		}*/
}

private static boolean checkPrime(long c) {
	// TODO Auto-generated method stub
	
	 int d=0,e;
	 
	 for(e=2;e<c;e++)
	 {
		 if(c%e==0)
			 { d++;
               break;  
			 }
	 }
	
	if(d!=0)
	return false;
	else
		return true;
}
}
