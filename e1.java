package euler;
import java.util.Scanner;
public class e1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e=0;
		for(int i=0;i<1000;i++)
		{
			if(i%3==0||i%5==0)
				e=e+i;
		}
		System.out.println("sum of the multiples is "+e);
	}

}
