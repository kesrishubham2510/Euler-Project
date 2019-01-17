import java.util.*;

public class P3 {

	public static void main(String[] args ) 	{

	    long numm = 600851475143L;

		long newnumm = numm;

		long largestFact = 0;

		int counter = 2;

		while (counter * counter <= newnumm) {

		    if (newnumm % counter == 0) {

		        newnumm = newnumm / counter;

		        largestFact = counter;

		    } else {

		        counter++;

		    }

		}

		if (newnumm > largestFact) { 

		    largestFact = newnumm;

		}

		System.out.print(largestFact);

	}

}
