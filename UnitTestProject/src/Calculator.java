import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Calculator {
	public int sum(int a, int b) {
	return a+b;
	}// sum
	public int multiply(int a, int b) {
		return a*b;
		}// sum
	
	public int divide(int a, int b) {
		return a/b;
		}// divide
	
	public String getStrPI() {
		return "3.141592";
		}// getStrPI
	
	public String setEmail(String email) throws EmailFormatException {
		String tmpEmail = "";
		Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher m = pattern.matcher(email);
		if (m.matches() ) {
			tmpEmail = email;
		} else {
			new EmailFormatException("The format of email is invalid"); //throw a new exception
		} //else
		return tmpEmail;
	} // setEmail
}

