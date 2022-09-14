import java.util.Scanner;
import java.util.regex.Pattern;

public class regExp {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        
	        String domain = "^01(?:0|1|[6-9])[.-]?(\\d{3}|\\d{4})[.-]?(\\d{4})$";
//	        String user = sc.nextLine();
	        String user = "010111122222";
//07µµ8284
	        boolean regex = Pattern.matches(domain, user);
	        System.out.println(regex);
	}
}
