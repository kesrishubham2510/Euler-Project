package euler;
//design a program which tells the lcm of first n integers;
public class e5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0;
		long t;  //2520 is The smallest divisible by each and every number between 1 tom 10;
	 System.out.println("programme initiated....");
			for(t=2521;r!=19;t++)
				{ 
				   
				  for(int d=2;d<=20;d++)
				  {    
				       if(t%d==0)
					  r++;
	                  
					  else
					  {        r=0;
						  break;
				          }
				  }
               	}
			System.out.println("The smallest divisible by each and every number between 1 tom 20 is "+(t-1));

	}

}
