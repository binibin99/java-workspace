import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_HashSet {
	
	/* 
	 	# Set
	 	
	 	- 집합을 구현해놓은 클래스
	 	- 중복을 허용하지 않는다
	 	- Collection 인터페이스를 구현한 클래스이다
	 	
	 	
	 	# Hash
	  
	 	- 같은 값을 넣으면 항상 일정한 값이 나와야하는 단방향성 알고리즘
	 	- HashSet은 중복임을 체크하는데 해당 객체의 Object.hashcode() 메서드를 사용한다
	 	- 해쉬의 결과는 규칙적이지 않기 때문에 순서는 존재하지 않는다 -> index가 없다
	 	
	 	# java.util.HashSet
	 	
	 	- 해쉬 알고리즘을 사용하는 Set
	 	- 중복된 데이터를 허용하지 않으며 순서가 없다
	*/
	public static void main(String[] args) {
		
		HashSet<Integer> numbers = new HashSet<>();
		
		// Set.add(item) : 요소를 추가한다
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		System.out.println(numbers);
		
		// HashSet은 index가 없어서 get을 할 수 없다
		// 내용을 사용하고 싶다면 반복문을 통해 하나씩 모두 꺼내는 방법밖에 없다
		
		// forEach 반복문 : 오른쪽에서 값을 하나씩 꺼내며 반복한다
		for (Integer number : numbers) {
			System.out.println(number);
			
			// Object 타입의 hashCode : 주소값 리턴
			// String 타입의 hashCode 오바라이드 : 문자열 값을 통한 계산값 리턴
			// Integer 타입의 hashCode 오버라이드 : 기본형 값 리턴
			System.out.println("Integer hashCode: " 
					+ Integer.valueOf(1234).hashCode());			
		}
		System.out.println("abcd".hashCode());
		
		HashSet<String> fruits = new HashSet<>();
		HashSet<String> animals = new HashSet<>();
		ArrayList<String> animalList = new ArrayList<>();
		
		animalList.add("monkey");
		animalList.add("monkey");
		animalList.add("monkey");
		animalList.add("rabbit");
		animalList.add("raccon");
		animalList.add("tiger");
		animalList.add("zibra");
		
		fruits.add("lemon");
		fruits.add("mango");
		fruits.add("grape");
		fruits.add("orange");
		
		animals.add("zibra");
		animals.add("lion");
		animals.add("tiger");
		animals.add("tiger");
		
		System.out.println(animals);
		
		// set.addAll(Collection<? extends Generic<Type>) :
		// : 해당 Set에 다른 컬렉션의 값을 모두 더한다. 중복은 제거된다
		animals.addAll(fruits); 
		// animal.addAll(numbers); // 제네릭이 Integer라 더할 수 없다
		animals.addAll(animalList); // List도 Collection이므로 더할 수 있다
		
		System.out.println(animalList);
		System.out.println(animals);
		
		// Set.removeAll(collection) : 다른 컬렉션에 포함된 값을 모두 삭제한다
		animals.removeAll(fruits);
		System.out.println(animals);
		
		// set.contains(item) : 포함 여부를 반환한다
		System.out.println("오리 있나요? "+ animals.contains("duck"));
		
		// 컬렉션은 다른 컬렉션으로의 변환이 자유롭다 (해당 컬렉션의 생성자를 사용)
		
		// Set을 List로 변환하기
		List<String> list1 = new ArrayList<>(animals);
		// List를 Set으로 변환하기
		Set<String> set1 = new HashSet<>(animalList);
		
		System.out.println("리스트가 된 셋: " + list1);
		System.out.println("셋이 된 리스트: " + set1);
		
		
		
	}

}
