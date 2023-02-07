package my_project;
import java.util.*;
import java.io.File;
import java.io.IOException;
public class main_menu {
	void print_main_menu(){
		boolean exitFlag=false;
		ui ui_obj=new ui();
		main_menu main_menu_obj=new main_menu();
		
		String choice = null,fileName;
		Scanner sc =new Scanner(System.in);
		//Get path for repository
		set_working_directory swd=new set_working_directory();
		swd.get_working_directory();
		if (swd.working_directory.equals("not_set")) {
			swd.new_working_directory();
			swd.get_working_directory();
		}
			
		String folderpath=swd.working_directory;
				
		System.out.println("a. Add File");
		System.out.println("b. Delete File");
		System.out.println("c. Search File");
		System.out.println("d. Home Screen");
		System.out.println("e. Show working directory");
		System.out.println("f. Change working directory");
		System.out.println("g. Exit application");
		System.out.println("Enter your option:[a,b,c,d,e,f,g]");
		
		while(!exitFlag) {
			try {
				choice=sc.next();
			}catch(Exception e){
				System.out.println("\nKindly Enter the valid input\n"
						+ "restart the application to continue");
				System.exit(0);
			}
		
			switch(choice.toLowerCase()) {
		
			case "a":
			//System.out.println("a.Add File");
				try {
					System.out.println("\nEnter File Name: ");
					System.out.println("hint: Do not use spaces in File Name,\ne.g.:SimpliLearn.txt");
					
					String file_name="";
					file_name=sc.next();
					File new_file=new File(folderpath + " " + file_name);
					if(new_file.createNewFile()) {
						System.out.println("\nFile created: " + new_file.getName());
				     } else {
				       System.out.println("\nFile already exists.");
				     }
				}catch(IOException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				}
				exitFlag=true;
			break;
			
			case "b":
				//System.out.println("b.delete File");
				System.out.print("\nEnter File Name: ");
				String file_name="";
				file_name=sc.next();
				 File delete_file=new File(folderpath + " " + file_name);
				 if(delete_file.delete()) {
					 System.out.println("\nDeleted the File : " + delete_file.getName());
			      } else {
			        System.out.println("\nFailed to Delete the File");
			      }
				 exitFlag=true;
				 break;
			case "c":
				binary_search searchFile=new binary_search();
				show_file getList=new show_file();
				String fileList[]=getList.checkFiles();
				
				if(fileList.length!=0) {
					System.out.print("\nKindly Enter the file name to search: ");
					fileName=sc.next();
					
					searchFile.binarySearch(fileList, fileName);
					
					if(searchFile.statusFile){
						System.out.println(fileName + " is available in working directory");
					}
					else {
						System.out.println(fileName + " is not available in working directory");
					}
				}
				exitFlag=true;
				break;
			case "d":
				//System.out.println("d.main menu");
				ui_obj.print_ui();
				
				exitFlag=true;
				break;
			case "e":
				swd.get_working_directory();
				System.out.println("\nWorking Directory: " + swd.working_directory);
				
				exitFlag=true;
				break;
			case "f":
					swd.new_working_directory();
					exitFlag=true;
					break;
			case "g":
				System.out.print("\nThank you for using the Application");
				System.exit(0);
			default:
			System.out.println("\nEnter valid input");
			}
		}
		
		exitFlag=false;
		while(!exitFlag) {
			System.out.println("\nEnter [a] to show options again");
			System.out.println("Enter [b] back to home screen");
			String back =sc.next();
			
			if(back.equals("b")) {
				ui_obj.print_ui();
				break;
			}
			else if(back.equals("a")) {
				main_menu_obj.print_main_menu();
				break;
			}
			else {
			System.out.println("\nEnter Valid Option");
			}
		}
	}
	
}
