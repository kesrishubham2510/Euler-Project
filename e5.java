package euler
public class e5 {

	public static void main(String[] args) {
		long n=20;
		System.out.println(lcm(n));
	}
	public static long lcm(long n)
	{
		long ans=1;
		for(int i=1;i<=n;i++)
		{
			ans=(ans*i)/(gcd(ans,i));			
		}
		return ans;
       }
       
       public static long gcd(long a,long b)
        {  
	long rem;
	while(b!=0)
	{
             rem=a%b;
	     a=b;
	     b=rem;     
       }
             return a;
}
}
