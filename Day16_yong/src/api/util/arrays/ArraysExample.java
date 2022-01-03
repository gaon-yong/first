package api.util.arrays;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		
		//배열의 복사
		char[] arr = {'J', 'A', 'V','A'} ;
//		char[] arr2 = arr;//복사를 한게 아니라 주소값만 같은거 즉, 하나의 배열을 둘이 보는것
		char[] arr2 = Arrays.copyOf(arr, 4);
//		char[] arr2 = Arrays.copyOf(arr, arr.length);
		char[] arr3 = Arrays.copyOfRange(arr, 1, 4);//끝은 미만
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		//배열의 탐색: binarySearch(배열, 검색할 값)
		//반드시 정렬이 선행되어야 합니다.
		
		int[] numbers = {1, 3, 5, 7, 9, 13};
		System.out.println("5의 위치: " + Arrays.binarySearch(numbers, 5));
		
		//배열의 정렬
		int[] nums = {42, 11, 35, 88, 34, 100};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		//배열의 내부 요소가 동일한지의 여부를 확인
		System.out.println(Arrays.equals(arr, arr2));
		System.out.println(Arrays.equals(arr, arr3));

	}

}






















