/* Bubble Sorter
* Authors: 794748 Raiyan Aaijaz
* Course: ICS3UO
* Teacher: Mr. King
*/

package bubble.sort;

public class BubbleSort {

	public static void main(String[] args) {  
            int arr[] = {27, 26, 31, 23, 32, 19, 20, 21, 28, 34};
            int arr2[] = {46, 49, 36, 35, 39, 45, 37, 48, 50, 44};  
            //list of 20 adults ages in two arrays
            
            System.out.println("Array BEFORE Bubble Sort:"); 
	    printArray(arr); //prints arr
            printArray(arr2); //prints arr2
            //prints out the array before sorting
            
            bubbleSort(arr);//sorting array elements using bubble sort  
            bubbleSort(arr2);//sorting second row of array elements 
            
            System.out.println("Array AFTER Bubble Sort:");  
            printArray(arr); //prints arr
            printArray(arr2); //prints arr2
            //print out the array after being sorted in static void bubbleSort

	}  //ends main
 	
        static void bubbleSort(int[] array) {  
        //static void where bubble sort occurs
            int n = array.length; 
            //length of the array is initialized in variable n 
            int temp = 0;
            //variable temp is initialized to 0
            for(int i=0; i < n; i++) { //Looping through the array length
		   
            for(int j=1; j < (n-i); j++) {  
			       
                if (array[j-1] >= array[j]) {   				    
                //if statement that allows the swap of the elements in arrays
                    temp = array[j-1]; //stores array[j-1] into temp 
                    array[j-1] = array[j]; //then array[j-1] is equal to array[j]
                    array[j] = temp; 
                    //then array[j] becomes equal to temp             
                }  
            }  
        }  
    } 
	
    static void printArray(int[] array){
    //static void where the array is printed
        for(int i=0; i < array.length; i++) {  
            System.out.print(array[i] + " ");   
	} 
	System.out.println();//makes an extrea line
    } 
} //ends class 
