package euler;
//design a program which tells the lcm of first n integers;
public class e5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0;
		long t;  //2520 is The smallest divisible by each and every number between 1 tom 10;
	System.out.println("programme initiated....");
			for(t=2520;r!=20;t++)
				{ 
				   r=0;int m=0;
				  for(int d=3;d<=20&&m==0;d++)
				  {   if(d==4||d==5||d==10)
					  continue;
					 
				      else if(t%d==0)
					  r++;
	                  
					  else
					   break;
					 
				  }
               	}
			System.out.println("The smallest divisible by each and every number between 1 tom 20 is "+t);

	}

}
