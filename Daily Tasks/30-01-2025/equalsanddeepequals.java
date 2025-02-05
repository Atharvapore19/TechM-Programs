package sample;

import java.util.Arrays;

public class equalsanddeepequals {

	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3};
		Integer[] arr2 = {1,2,3};
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
		// TODO Auto-generated method stub

	}

}
