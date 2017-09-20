import java.math.BigInteger;
import java.util.Arrays;

public class math {

	public static void main(String[] args) {

		
		String test = "2017.08.02 17:45"; 
		
		System.out.println(test.replaceAll("\\.", "").replaceAll("\\:", "").replaceAll(" ", ""));
	
	}

}
