package maccess;
import java.util.*;
public class DemoExam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String phNo[] = {"2124567890", "212-456-7890", "(212)456-7890", "(212)-456-7890", 
				         "212.456.7890", "212 456 7890", "+12124567890", "+12124567890", 
				          "+1 212.456.7890","+212-456-7890", "1-212-456-7890"};
		System.out.println("===PhNo are likes below===");

		for(int i=0; i<phNo.length;i++) {
			String str = phNo[i].replaceAll("[-,.()]"," ");
			str.trim();
			if(str.length()>= 12) {
				
				System.out.println(str.toString());
				if(str.substring(0, 2) == "+1") {
					System.out.println(str.toString());
				}
			}else {
				}
			
		}
		
		s.close();
	}

}
