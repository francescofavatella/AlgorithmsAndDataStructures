package it.develop.algorithms.sort;

public class MergeSort {

	private Integer[] sort(Integer arr[]) {
//		https://en.wikibooks.org/wiki/Algorithm_Implementation/Sorting/Merge_sort
		if (arr == null || arr.length == 0 || arr.length == 1) {
			return arr;
		}
		Integer arr1[] = new Integer[arr.length / 2];
		Integer arr2[] = new Integer[arr.length - arr1.length];

		for(int i = 0; i<arr1.length;i++) {
			arr1[i] = arr[i];
		}
		
		for(int i = 0; i<arr2.length;i++) {
			arr2[i] = arr[i+arr1.length];
		}
		
		arr1 = sort(arr1);
		arr2 = sort(arr2);
		
		int i=0, arr1_index=0, arr2_index=0;
		while(arr1_index<arr1.length && arr2_index<arr2.length) {
			if(arr1[arr1_index]<=arr2[arr2_index]) {
				arr[i] = arr1[arr1_index];
				arr1_index++;
				i++;
			}
			else if(arr1[arr1_index]>arr2[arr2_index]) {
				arr[i] = arr2[arr2_index];
				arr2_index++;
				i++;
			}			
		}
		
		while(arr1_index<arr1.length) {
			arr[i] = arr1[arr1_index];
			arr1_index++;
			i++;
		}
		while(arr2_index<arr2.length) {
			arr[i] = arr2[arr2_index];
			arr2_index++;
			i++;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		Integer arr[] = { 54, 26, 93, 17, 77, 31, 44, 55, 20 };
		MergeSort q = new MergeSort();
		System.out.println(q.print(arr));
		q.sort(arr);
		System.out.println(q.print(arr));

	}

	private StringBuffer print(Integer arr[]) {
		StringBuffer sb = new StringBuffer();
		for (Integer i : arr) {
			sb.append(i + ", ");
		}
		return sb;
	}
}
