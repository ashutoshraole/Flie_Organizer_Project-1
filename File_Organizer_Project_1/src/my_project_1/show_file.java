package my_project_1;
import java.io.File;
import java.util.Collections;
import java.util.*;

public class show_file {

	String[] checkFiles(){		
		
		sorting sortFiles = new sorting();
		
		int i=0;
		
		//Get path for repository
		set_working_directory swd=new set_working_directory();
		swd.get_working_directory();
		
		if (swd.working_directory.equals("not_set")) {
			swd.new_working_directory();
			swd.get_working_directory();
		}
		
		//Assigning local variable
		String folderpath=swd.working_directory;
	
		File folder=new File(folderpath);
		File [] files =folder.listFiles();
		
		int countFiles=files.length;
		String fileNames[]=new String[countFiles];
		
		if (countFiles==0) {
			System.out.println("No files available in working directory");
			
		}
		else {	
			i=0;
			for(File file:files) {
				if(file.isFile()) {
					if(file.getName().trim()!=null && !file.getName().trim().isEmpty())
					fileNames[i]=file.getName().trim();
					i++;
				}
			}
			sortFiles.sorting_method(fileNames);
		}
		return fileNames;
	}
	
	
	void printFiles(){
			String fileNames[]=checkFiles();
			int back=0;
			Scanner sc= new Scanner(System.in);
			//iterate the file array 
			System.out.println("Files are: ");
			for(String name:fileNames) {
				   System.out.println("* File ->"+" "+name);
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
