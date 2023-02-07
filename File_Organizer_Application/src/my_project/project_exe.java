package my_project;

public class project_exe {

	public static void main(String[] args) {
		// Declaring objects
		welcome_screen welcome_screen_obj=new welcome_screen();
		ui ui_obj=new ui();
	
		welcome_screen_obj.printLetters(welcome_screen_obj.w);
		ui_obj.print_ui();


		/*
		 * set_working_directory swd=new set_working_directory();
		 * swd.select_working_directory();
		 * 
		 * System.out.println(swd.working_directory);
		 */
		//main_menu main_menu_obj=new main_menu();
		//main_menu_obj.print_main_menu();

		
//		String array[]= {"abc","def","aaa"};
//		binary_search bs=new binary_search();
//		
//		bs.binarySearch(array, "def");
//		System.out.println(bs.statusFile);
	}

}
