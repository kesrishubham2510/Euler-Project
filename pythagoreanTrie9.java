package euler;

public class pythagoreanTrie9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Program initiated");
		int g;
		double  a=0,b=0,c=0;
		for(a=0;a<=1000;a++)
		{
			for(b=0;b<=1000;b++)
			{
				for(c=0;c<=1000;c++)
				{
				   	if((a*a+b*b==c*c)&&(a+b+c==1000)&&(a<b&&b<c))
				   		System.out.println("a= "+a+" b= "+b+" c= "+c);
				}
				   			
			}
			  			
		}
		System.out.println();	
		
		
	}

}
