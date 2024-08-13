package Assignment_Interface;

import java.util.Scanner;

public class SortableMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Select the Sorting Algorithm/n1.Bubble Sort/n2.Merge Sort/n3.Quick Sort");
		int algorithm = sc.nextInt();

		Sortable sort = algorithm == 1 ? new bubbleSort() : algorithm == 2 ? new MergeSort() : new QuickSort();
		sort.sort(arr);
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

interface Sortable {
	void sort(int arr[]);
}

class bubbleSort implements Sortable {
	public void sort(int arr[]) {
		System.out.println("Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

class QuickSort implements Sortable {
	public void sort(int arr[]) {
		System.out.println("Quick Sort");
		quickSort(arr, 0, arr.length - 1);
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];

		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			if (arr[j] < pivot) {

				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);

			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}
}

class MergeSort implements Sortable {
	public void sort(int arr[]) {
		System.out.println("Merge Sort");
		sort(arr, 0, arr.length - 1);
	}

	static void sort(int arr[], int l, int r) {
		if (l < r) {

			// Find the middle point
			int m = l + (r - l) / 2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	static void merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}