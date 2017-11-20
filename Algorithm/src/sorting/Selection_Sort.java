package sorting;

import java.util.Arrays;

public class Selection_Sort {

	public void swap(int[] array, int firstIndex, int lastIndex){
		int temp = array[firstIndex];
		array[firstIndex] = array[lastIndex];
		array[lastIndex] = temp;
	}
	public int indexSmallVal(int startIndex , int[] array){
		int minValIndex = startIndex;
		int minVal = array[startIndex];
		
		for(int i = minValIndex+1;i<array.length;i++){
			if(array[i]<minVal){
				minValIndex = i;
				minVal = array[minValIndex];
			}
		}	
		return minValIndex;
	}
	
	public void selectionSort(int[] array){
		int minValIndex;
		for(int i = 0; i< array.length - 1;i++ ){
			minValIndex = indexSmallVal(i, array);
			swap(array, i, minValIndex);
		}
		
		//System.out.println(Arrays.toString(array));
		for(int no : array ){
			System.out.println(no);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10,34,12,89,46,21,49,30,60,27};
		
		Selection_Sort sort = new Selection_Sort();
		sort.selectionSort(array);
		
	}

}
