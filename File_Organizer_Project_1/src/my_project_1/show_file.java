package my_project_1;
import java.io.File;
import java.util.Collections;
import java.util.*;

public class show_file {
	void print_file() {
		Scanner sc= new Scanner(System.in);
		int back =0;
		String folderpath="E:\\Full Stack Development\\Simplilearn\\COURSE-2\\Flie_Organizer_Project-1\\Files";
		File folder=new File(folderpath);
		File [] files =folder.listFiles(); 
		//iterate the file array 
		System.out.println("Files are: ");
		for(File file:files) {
			if(file.isFile()) {
			   System.out.println("* File ->"+" "+file.getName());
			}

		}
		while (true) {
		System.out.println("Enter [9] to back to Previous Menu");
		back =sc.nextInt();
			if(back==9) {
			ui ui_obj=new ui();
			ui_obj.print_ui();
			break;
			}
			else {
			System.out.println("Enter Valid Option");
			}
		}
	}

}
