package my_project;
import java.util.*;
public class ui {
	
	void print_ui(){
		Scanner sc=new Scanner(System.in);
		String ui_ip="";
		
		System.out.println("");
		System.out.println("a. Show Files");
		System.out.println("b. Main Menu");
		System.out.println("c. Exit");
		System.out.print("Enter your choice: ");
		
		while (true) {
			try {
				ui_ip=sc.next();
			}catch(Exception e) {
				System.out.println("\nKindly enter the valid input"
						+ "\nre-start the application to continue");
				System.exit(0);
			}
			
			//sc.close();

			if(ui_ip.equals("a")) {
				//System.out.println("1");
				show_file show_file_obj=new show_file();
				show_file_obj.printFiles();
				break;
			}
			
			else if(ui_ip.equals("b")) {
				main_menu main_menu_obj=new main_menu();
				main_menu_obj.print_main_menu();
				break;
			}
			
			else if(ui_ip.equals("c")) {
				System.out.println("Thank You for using the application");
				System.exit(0);
			}
			else {
				System.out.println("\nPlease Enter Valid Option");
			}
		}
			
	}
}

