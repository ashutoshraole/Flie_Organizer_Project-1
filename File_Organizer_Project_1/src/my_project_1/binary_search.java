package my_project_1;

public class binary_search {
	// Returns index of x if it is present in arr[],
    boolean statusFile=false;
    void binarySearch(String[] arr, String x) {
        int start = 0, length = arr.length - 1;
        while (start <= length) {
            int mid = start + (length - start) / 2;
 
            int result = x.compareTo(arr[mid]);
 
            // Check if x is present at mid
            if (result == 0){
                System.out.println("File Exist");
                statusFile=true;
            	break;
            }
 
            // If x greater, ignore left half
            if (result > 0)
                start = mid + 1;
 
            // If x is smaller, ignore right half
            else
                length = mid - 1;
        }
    }
}
