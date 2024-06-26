package bubbleSort;

public class BidirectionalBubbleSort { 

	    // Method to perform bidirectional bubble sort (Cocktail Shaker Sort)
	    public static void bidirectionalBubbleSort(int[] array) {
	        int n = array.length;
	        boolean swapped = true;
	        int start = 0;
	        int end = n - 1;

	        while (swapped) {
	            swapped = false;

	            // Traverse the array from start to end
	            for (int i = start; i < end; i++) {
	                if (array[i] > array[i + 1]) {
	                    int temp = array[i];
	                    array[i] = array[i + 1];
	                    array[i + 1] = temp;
	                    swapped = true;
	                }
	            }

	            // If no elements were swapped in the first pass, the array is sorted
	            if (!swapped) {
	                break;
	            }

	            // Otherwise, reset the swapped flag for the next phase
	            swapped = false;

	            // Decrement the end point, as the largest element is now in place
	            end--;

	            // Traverse the array from end to start
	            for (int i = end - 1; i >= start; i--) {
	                if (array[i] > array[i + 1]) {
	                    int temp = array[i];
	                    array[i] = array[i + 1];
	                    array[i + 1] = temp;
	                    swapped = true;
	                }
	            }

	            // Increment the start point, as the smallest element is now in place
	            start++;
	        }
	    }

	    // Method to print the array
	    public static void printArray(int[] array) {
	        for (int i : array) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	    // Main method to test the bidirectional bubble sort
	    public static void main(String[] args) {
	        int[] array = {88, 45, 29, 8, 77, 15, 122};

	        System.out.println("Unsorted array:");
	        printArray(array);

	        bidirectionalBubbleSort(array);

	        System.out.println("Sorted array:");
	        printArray(array);
	    }
	}
