package my_project
;

public class welcome_screen {
		int w[][]= {{1,0,0,0,1,0,1,1,1,1,0,1,0,0,0,0,1,1,1,1,0,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1},
					{1,0,0,0,1,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,1,0,1,0,1,0,1,0,1,0,0,0},
					{1,0,1,0,1,0,1,1,1,0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,1,0,1,0,1,0,1,0,1,1,1,0},
					{1,0,1,0,1,0,1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1,0,0,1,0,1,0,0,0,1,0,1,0,0,0},
					{1,1,1,1,1,0,1,1,1,1,0,1,1,1,1,0,1,1,1,1,0,1,1,1,1,0,1,0,0,0,1,0,1,1,1,1}};
		
		void printLetters(int letter[][]) {
			
			for(int i=0;i<5;i++) {
				for(int j=0;j<36;j++) {
					if(letter[i][j]==1) 
						System.out.print("*");
						else {
							System.out.print(" ");
						}
					
				}
					System.out.println();
			}
					System.out.println("Application Name: File Organizer");
					
					System.out.println("Author Name: Ashutosh Vasant Raole");
		}
}

		
