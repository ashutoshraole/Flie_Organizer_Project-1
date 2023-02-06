package my_project_1;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class set_working_directory {
	String working_directory;
        void get_working_directory() {
        	
        	working_directory=System.getProperty("user.dir");
        	working_directory+="\\resources\\";
        	
        	try {
	        	File readWorkingDirectory=new File(working_directory+"working_directory_path.txt");
	        	
	        	Scanner myReader = new Scanner(readWorkingDirectory);
	            while (myReader.hasNextLine()) {
	              String data = myReader.nextLine();
	              working_directory=data;
	            }
	            myReader.close();
            }catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        	
        }
        
        void new_working_directory() {
        	Scanner getInput=new Scanner(System.in);
        	System.out.print("Enter path for working directory: ");
        	
        	working_directory=System.getProperty("user.dir");
        	working_directory+="\\resources\\";
        	
        	String new_working_directory=getInput.nextLine();
        	
        	try {
        	      FileWriter myWriter = new FileWriter(working_directory+"working_directory_path.txt");
        	      myWriter.write(new_working_directory);
        	      myWriter.close();
        	      System.out.println("Working directory path is updated");
        	    } catch (IOException e) {
        	      System.out.println("An error occurred.");
        	      e.printStackTrace();
        	    }
        }
        
}
