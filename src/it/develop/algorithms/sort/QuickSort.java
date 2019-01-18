package it.develop.algorithms.sort;

public class QuickSort {

//	private int partition(Integer arr[], int l, int h) {
//		System.out.println("partition => arr["+this.print(arr)+"] low="+l+" high="+h);
//		int pivot = arr[l];
//		int min = l + 1;
//		int max = h;
//		while (min < max) {
//			System.out.println("before partition => arr["+this.print(arr)+"] min="+min+" max="+max);
//			while (min < max && arr[min] <= pivot) {
//				min++;
//			}
//			while (min < max && arr[max] >= pivot  ) {
//				max--;
//			}
//			int tmp = arr[min];
//			arr[min] = arr[max];
//			arr[max] = tmp;
//			System.out.println("after partition => arr["+this.print(arr)+"] min="+min+" max="+max);
//		}
//		arr[l] = arr[min];
//		arr[min] = pivot;
//		return min;
//	}
//
//	
//
//	private void quickSort1(Integer arr[], int l, int h) {
//		int p = partition(arr, l, h);
////		quickSort(arr, l, p-1);
////		quickSort(arr, p+1, h);
//	}
	
	 public  void quickSort(Integer[] arr, int low, int high)
	    {
//		 https://howtodoinjava.com/algorithm/quicksort-java-example/
		 System.out.println("partition => arr["+this.print(arr)+"] low="+low+" high="+high);
	        //check for empty or null array
	        if (arr == null || arr.length == 0){
	            return;
	        }
	         
	        if (low >= high){
	            return;
	        }
	 
	        int pivot = arr[low];
	 
	        // make left < pivot and right > pivot
	        int i = low, j = high;
	        while (i <= j)
	        {
	            //Check until all values on left side array are lower than pivot
	            while (arr[i] < pivot)
	            {
	                i++;
	            }
	            //Check until all values on left side array are greater than pivot
	            while (arr[j] > pivot)
	            {
	                j--;
	            }
	            //Now compare values from both side of lists to see if they need swapping
	            //After swapping move the iterator on both lists
	            if (i <= j)
	            {
	            	System.out.println("swap=> i="+i+" j="+j);
//	                swap (arr, i, j);
	                int tmp = arr[i];
	    			arr[i] = arr[j];
	    			arr[j] = tmp;
	                i++;
	                j--;
	            }
	        }
	        System.out.println("after partition => arr["+this.print(arr)+"] low="+i+" high="+j);
	        //Do same operation as above recursively to sort two sub arrays
	        if (low < j){
	        	System.out.println("low < j");
	            quickSort(arr, low, j);
	        }
	        if (high > i){
	        	System.out.println("high > i");
	            quickSort(arr, i, high);
	        }
	    }

	public static void main(String[] args) {
		Integer arr[] = { 54, 26, 93, 17, 77, 31, 44, 55, 20 };
		QuickSort q = new QuickSort();
		q.quickSort(arr, 0, arr.length-1);
		System.out.println(q.print(arr));

	}
	
	private StringBuffer print(Integer arr[]) {
		StringBuffer sb = new StringBuffer();
		for(Integer i:  arr) {
			sb.append(i+", ");
		}
//		System.out.println(sb);
		return sb;
	}
}
