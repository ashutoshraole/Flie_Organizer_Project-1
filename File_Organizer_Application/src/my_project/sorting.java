package my_project;

public class sorting {
	   void sorting_method(String listFiles[]){
		   // define an array
	        String t;
	        int i,j,snp;

	        // run an outer loop i from 0 to listFiles.length-1 to repeat the process of selection sort
	        for(i=0; i<listFiles.length-1; i++)
	        {
	            // smallest string position
	            snp=i;
	            try {
		            // run an inner loop j for selection sort from i+1 to listFiles.length
		            for(j=i+1; j<listFiles.length; j++){
		            	
			                // now check if the value at listFiles[j] is smaller than value at listFiles[snp]
			                if(listFiles[j].compareToIgnoreCase(listFiles[snp])<0)
			                {
			                    // if the value is smaller, then store the value of j to snp   
			                		snp=j;
			                }
	            	}
	
		            // outside the body of inner loop j check if listFiles[i]>listFiles[snp]. If yes then swap the strings
		            if(listFiles[i].compareToIgnoreCase(listFiles[snp])>0)
		            {
		                t=listFiles[i];
		                listFiles[i]=listFiles[snp];
		                listFiles[snp]=t;
		            }
	            }catch(Exception e) {
    				//exception handled
            	}
	        }
	   }
}
