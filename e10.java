package euler;

public class e10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Program initiated");
		int a;
		long b=0;
     for(a=2;a<2000000;a++)
     {
    	 boolean r=checkPrime(a);
    	 if(r)
    	 {
    		  b=b+a;
     	 }
     }
	
	System.out.println("The sum of the primes is "+c);	

	}

	private static boolean checkPrime(int a) {
		// TODO Auto-generated method stub
		int i,d=0;
		for(i=2;i<=Math.sqrt(a);i++)
		{
			if(a%i==0)
			{  
				d++;break;
			}
		}
		if(d!=0)
		return false;
		else
			return true;
	}

}
