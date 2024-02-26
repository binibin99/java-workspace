import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D05_Collections {
	
	/*
	  	# java.util.Arrays
	 
	 	- 배열을 편하게 다룰 수 있는 메서드들을 모아놓은 클래스
	 	
	 	# java.util.Collections
	 	
	 	- 컬렉션을 편하게 다룰 수 있는 메서드들을 모아놓은 클래스
	 */
	public static void main(String[] args) {
		
		int[] arr1 = new int[10];
		
		// Arrays.fill(arr, value) : 전달한 배열을 해당 값으로 초기화한다
		Arrays.fill(arr1, 100);
		
		System.out.println(Arrays.toString(arr1));

		// Arrays.sort(arr) : 배열의 모든 값을 크기순으로 정렬한다
		arr1[5] = -99;
		arr1[2] = 30;
		arr1[9] = 30;
		
		Arrays.sort(arr1);
		
		System.out.println("정렬 후: " + Arrays.toString(arr1));
		
		// Arrays.binarySearch(arr, value) : 
		// 원하는 값의 인덱스를 찾아 반환한다 (*정렬 후에만 작동한다)
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("찾은 위치:" + Arrays.binarySearch(arr1, -99));
		
		// Arrays.copyOF(arr, newLength) :
		// 전달한 배열의 복사본을 만들어주는 메서드. 새로운 길이를 설정할 수 있다
		int[] arr2 = Arrays.copyOf(arr1, 20);
		
		 System.out.println(Arrays.toString(arr2));
		 
		 // Arrays.compare(arr1, arr2) : 두 배열의 크기를 비교해준다
		 // 배열 크기 비교시 가장 앞에 있는 값이 우선 순위가 높다
		 // 왼쪽 배열이 더 크면 1, 오른쪽 배열이 더 크면 -1, 두 배열이 완전히 같으면 0
		 int[] stu1 = {1, 1, 1};
		 int[] stu2 = {1, 1, 1};
		 
		 System.out.println(Arrays.compare(stu1, stu2));
		 
		 // Collections.addAll(Collection, values ...)
		 // : 해당 컬렉션에 여러개의 값을 한번에 추가할 때 사용한다
		 List<Integer> numList = new ArrayList<>();
		 Set<String> animalSet = new HashSet<>();

		 
		 Collections.addAll(numList, 60, 20, 30, 99, 50, 1);
		 Collections.addAll(animalSet, "monkey", "lion", "whale", "tiger");
		 
		 System.out.println(numList);
		 System.out.println(animalSet);
		 
		 
		 // Collections.sort(List) : 전달한 리스트를 크기순으로 정렬해준다
		 // Set은 정렬할 수 없기 때문에 정렬된 모습을 보고싶다면
		 // 리스트로 만들어서 정렬해야 한다.
		 List<String> animalList = new ArrayList<>(animalSet);
		 
		 Collections.sort(numList);
		 Collections.sort(animalList);
		 
		 System.out.println("정렬 후 : " + numList);
		 System.out.println(animalList);
		 
		 
		 // Collections.shuffle(List) : 전달한 리스트의 순서를 섞는다
		 Collections.shuffle(numList);
		 System.out.println("석은 후: " + numList);
		 
		 // Collections.fill(List, value) : 전달한 리스트의 값을 초기화
		 Collections.fill(numList, 0);
		 System.out.println("0으로 채운 후 : " + numList);
		 
		 // Collections.frequency(Collection, value)
		 // : 해당 값이 몇 번 나오는지 세준다
		 int pigCount = Collections.frequency(animalSet, "pig");
		 int monkeyCount = Collections.frequency(animalSet, "monkety");
		 int zeroCount = Collections.frequency(numList, 0);
		 
		 System.out.println("pig가 나온 횟수: " + pigCount);
		 System.out.println("monkey가 나온 횟수: " + monkeyCount);
		 System.out.println("0이 나온 횟수: " + zeroCount);
	}
}


