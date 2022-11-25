package maccess;
import java.util.*;
public class DemoExam2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a user Pre_link");
		String str = s.nextLine();
		String st = str.replace("https://", "");
		//System.out.println(st);
		DemoExam2 ob = new DemoExam2();
		ob.socialLinks(st);
		ob.email(st);
		ob.contacts();
		s.close();
	}

	public void socialLinks(String str){
		System.out.println("\n===Social links are===");
		String st = str.replace(".", "");
		//System.out.println(st);
		String link1 = "https://www.facebook.com/*Tech/";
		String s1 = link1.replace("*", (st));
		System.out.println(s1.toString());
		
		String stri = str.replace(".", "-");
		String link2="https://www.linkedin.com/company/*/";
		String s2 = link2.replace("*", (stri));
		System.out.println(s2);
	
	}
	
	public void email(String st) {
		System.out.println("\n===Email is===");
		String str = "support@";
		System.out.println(str.concat(st));
	}
	
	public void contacts() {
		System.out.println("\n===Contacts no is===");
		String s1 = "343 303 6668";
		String s2 = "+1 ";
		System.out.println(s2.concat(s1));
	}
	
}

