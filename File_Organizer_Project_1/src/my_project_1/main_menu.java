package my_project_1;
import java.util.*;
public class main_menu {
	void print_main_menu() {
		String c;
		Scanner sc =new Scanner(System.in);
		System.out.println("a.Add File");
		System.out.println("b.Delete File");
		System.out.println("c.Search File");
		System.out.println("d.Main menu");
		System.out.println("e.Exit application");
		System.out.println("Enter your option:[a,b,c,d,e]");
		
		while(true) {
		c=sc.next();
		
			switch(c) {
		
			case "a":
			System.out.println("a.Add File");
			break;
			case "b":
				System.out.println("a.Add File");
				break;
			case "c":
				System.out.println("a.Add File");
				break;
			case "d":
				System.out.println("a.Add File");
				break;
			case "e":
				System.out.println("a.Add File");
				break;
			default:
			System.out.println("Enter valid input in lower case");
		
			}
		}
	}

}
