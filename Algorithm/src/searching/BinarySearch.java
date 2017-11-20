package searching;

import java.lang.reflect.Array;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sorted = {20,30,45,46,67,87,98,123,149,159};
		int search = 124;
		int n = sorted.length;
		int min = 0,max = n-1;
		int guess; 
		assert(n==10): "length = " +n;
		while(max>=min){
			guess =(min+max)/2;
			System.out.println(guess);
			System.out.println("max ="+max);
			System.out.println("min="+min);
			
			if(sorted[guess] == search){
				System.out.println("found it on "+(guess+1)+"th place");
				break;
			}else
			{
				if(sorted[guess]>search){
					max = guess-1;
				}
				else if(sorted[guess]<search){
					min = guess+1;
				}
			}
			
		}if(max<min){
			System.out.println("not found");
		}
		
	}

}
