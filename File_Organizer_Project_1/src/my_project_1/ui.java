package my_project_1;
import java.util.*;
public class ui {
	
	void print_ui() {
		Scanner sc=new Scanner(System.in);
		int ui_ip=0;
		boolean exitFlag=false;
		while (!exitFlag) {
			System.out.println("1. Show Files");
			System.out.println("2. Main Menu");
			System.out.println("3. Exit");
			System.out.print("Enter Option: ");
			ui_ip=sc.nextInt();
			if(ui_ip==1) {
				//System.out.println("1");
				show_file show_file_obj=new show_file();
				show_file_obj.printFiles();
				break;
			}
			
			else if(ui_ip==2) {
				System.out.println("2");
				main_menu main_menu_obj=new main_menu();
				main_menu_obj.print_main_menu();
				break;
			}
			
			else if(ui_ip==2) {
				exitFlag=true;
				break;
			}
			else {
				System.out.println("Please Enter Valid Option");
			}
			
		}
	}
	

}
