package euler;

public class pythagoreanTrie9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Program initiated");
		int g;
		double  a=0,b=0,c=0;
		for(a=3;a<=1000;a++)   //pythagorean triplets starts with 3;
		{
			for(b=a+1;b<=1000;b++)
			{
			   c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
				   if((a*a+b*b==c*c)&&(a+b+c==1000)&&(a<b&&b<c))
				   {	System.out.println("a= "+a+" b= "+b+" c= "+c);
				        System.exit(0); //after getting the value the program itself is called to termination with this code.
				   }			
			}
			  			
		}
		System.out.println();		
	}
}
