package sample;

import java.util.Arrays;

public class ArraycopyRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1,2,3,4,5,6};
		Integer[] arr1 = Arrays.copyOfRange(arr, 0, 3);
		System.out.println(Arrays.toString(arr1));
	}

}
