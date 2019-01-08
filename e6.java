package euler;

public class e6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		System.out.println("programme initiated...");
		double s1=0,s2=0,s3=0;
		for(a=1;a<=100;a++)
		{
			s1=s1+a;
			s2=s2+a*a;
			}
		s3=Math.pow(s1, 2)-s2;
		//System.out.println(s1+"  "+s1*s1+ " "+s2);
       System.out.println(s1*s1-s2);
	}

}
