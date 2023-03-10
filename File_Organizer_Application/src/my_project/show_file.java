package my_project;
import java.io.File;
import java.util.*;

public class show_file {

	String[] checkFiles(){		
		
		sorting sortFiles = new sorting();
		
		int i=0;
		
		//Get path for repository
		set_working_directory swd=new set_working_directory();
		swd.get_working_directory();
		
		if (swd.working_directory.equals("not_set")) {
			System.out.println("\nWorking Directory is not Defined yet");
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
			System.out.println("\nNo files available in working directory");
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
			String back="";
			Scanner sc= new Scanner(System.in);
			if(fileNames.length!=0) {
				//iterate the file array 
				System.out.println("Files are: ");
				for(String name:fileNames) {
					   System.out.println("* File ->"+" "+name);
				}
			}
		
			while (true) {
			System.out.println("Enter [a] to back to Previous Menu");
			back =sc.next();
				if(back.equals("a")) {
				ui ui_obj=new ui();
				ui_obj.print_ui();
				break;
				}
				else {
				System.out.println("Enter Valid Option");
				}
			}
		//sc.close();
	}

}
