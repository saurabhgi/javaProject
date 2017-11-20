package sorting;

import java.util.Arrays;

public class Insertion_Sort {

	public void insert(int[] array, int rightIndex, int value ){
		int i;
		for(i = rightIndex;i>=0 && array[i]>value;i--){
			array[i+1] = array[i];
		}
		array[i+1] = value;
		
	}
	public void insertionSort(int[] array){
		
		for(int i = 1;i<array.length;i++){
			insert(array,i-1,array[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {20,14,70,36,20,19,49,91,35};
		Insertion_Sort sort = new Insertion_Sort();
		sort.insertionSort(array);
		System.out.println(Arrays.toString(array));
	}

}
