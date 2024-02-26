import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import myobj.Apple;

public class D01_ArrayList {
	
	/*
	  	# java.util.ArrayList
	  	
	  	- 배열과 유사하지만 크기가 자동으로 조절되는 자료구조 클래스
	  	- 배열처럼 데이터를 순차적으로 저장한다
	  	- 모든 데이터를 순서대로 읽어야할 때 속도가 가장 빠른 자료구조이다
	  	
	  	# 자료구조 (Data Structure)
	  	
	  	- 데이터를 효율적으로 보관하기에 최적화된 구조들
	  	- 상황마다 데이터를 가장 효율적으로 다룰 수 있는 방법들에 대해
	  	  연구해놓은 결과물 (데이터 검색, 탐색, 정렬 .. 등등)	 
	 */
	public static void main(String[] args) {
		
		// 새 리스트를 하나 생성
		ArrayList list1 = new ArrayList();
		
		// list.add(item) : 해당 리스트에 원하는 데이터를 추가하는 메서드
		list1.add("apple");
		list1.add("kiwi");
		list1.add("lion");
		list1.add(123);
		list1.add(99);
		list1.add(new Apple());
		
		// list.add(index,item)
		list1.add(5, "Hello~");
		list1.add(5, "Hi~");
		
		
		
		// list.get(index) : 해당 번째 아이템을 꺼내는 메서드
		System.out.println("item of index3: " + list1.get(3));
		System.out.println("item of index4: " + list1.get(4));
		
		System.out.println((int)list1.get(3) + (int)list1.get(4));
		
		System.out.println(list1);
		
		// list.size() : 해당 리스트의 크기를 반환함
		System.out.println("list1의 크기 : " + (int)list1.size());
		
		// size()를 통해 리스트의 모든 요소를 쉽게 탑색할 수 있다
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(i + "번째 요소 : " + list1.get(i));
		}
	
	
		// 타입을 지정하면서 리스트 만들기 (제네릭 설정)
		ArrayList<String> fruits = new ArrayList<>();
		
		// add의 매개변수에서 요구하는 타입이 String으로 변한 것을 확인할 수 있다
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("grape");
		fruits.add(2,"mango");
		
		System.out.println(fruits);
		
		// get할때도 지정한 제네릭 타입으로 꺼내기때문에 다운캐스팅이 필요없다
		String firstFruit = fruits.get(0);
		
		System.out.println(firstFruit);
		
		// list.contains(item) : 해당 리스트에 item이 포함되었는지 여부를 반환하는 메서드
		System.out.println("리스트에 포도가 있나요? " + fruits.contains("grape"));
		System.out.println("리스트에 복숭아가 있나요? " + fruits.contains("peach"));
		
		if (fruits.contains("peach")) {
			System.out.println("복숭아가 이미 포함되어있습니다.");
		} else {
			fruits.add("peach");
			System.out.println("복숭아가 없어서 추가했습니다.");
		}
		
		// list.remove(index) : 해당 번째 요소를 지운다
		//						방금 지운 값을 반환한다
		String removed = fruits.remove(3);
		
		System.out.println("방금 지워진 값: " + removed);
		System.out.println(fruits);
		// list.remove(item) : 해당 값을 지닌 요소를 하나 지운다
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("banana");
		fruits.add("banana");
		
		// 값으로 지우는 경우 맨 앞에 있는 값부터 하나씩 지운다
		fruits.remove("apple");
		fruits.remove("apple");
		fruits.remove("apple");
		fruits.remove("apple");
		
		// 값으로 삭제하면 성공 여부를 반환한다
		System.out.println("apple 삭제 성공여부: " + fruits.remove("apple"));
		System.out.println("프링글스 삭제 성공여부: " + fruits.remove("프링글스"));
		
		System.out.println(fruits);
		
		
		ArrayList<String> countries = new ArrayList<>();
		ArrayList<String> bigCountries = new ArrayList<>();
		
		countries.add("South Korea");
		countries.add("America");
		countries.add("China");
		countries.add("England");
		countries.add("Russia");
		countries.add("France");
		
		bigCountries.add("America");
		bigCountries.add("China");
		bigCountries.add("Russia");
		
		System.out.println(countries);
		System.out.println(bigCountries);
		
		/*
			# Collection
			
			- Java에서 제공하는 자료구조 인터페이스
			- Collection 인터페이스를 구현하는 클래스로는 List, Set등이 있다
			- List는 모두 Collection 인터페이스의 자손이다
		*/
		
		// list.addAll(Collection) : 다른 컬렉션의 내용을 모두 더해준다
		countries.addAll(bigCountries);
		countries.addAll(bigCountries);
		countries.addAll(bigCountries);
		
		System.out.println(countries);
		
		// list.removeAll(collection) : 전달한 컬렉션에 포함된 내용을 모두 삭제한다
		// 리스트의 내용이 변했다면 true를 리턴한다 (변한게 없으면 false)
		countries.removeAll(bigCountries);
		System.out.println(countries);
		
		// list.containsAll(Collection) 
		/// : 리스트에 전달한 컬렉션의 모든 내용이 포함되어있으면 true
		System.out.println(countries.containsAll(bigCountries));
		
		countries.add("China");
		countries.add("North Korea");
		countries.add("India");
		countries.add("Russa");
		countries.add("America");
		countries.add("Brazil");
		
		System.out.println(countries.containsAll(bigCountries));
		System.out.println(countries);
		
		// list.set(index, item) : 해당 번째 요소를 수정한다;
		countries.set(1, "프링글스");
		System.out.println(countries);
		
		// list.subList(start,end) 
		// : 리스트를 원하는 만큼 잘라낸 리스트를 반환한다
		//	 (start 이상 end 미만)
		List<String> sub = countries.subList(3, 5);
		System.out.println(sub);
		
		// ArrayList의 업캐스팅
		ArrayList<String> drinks = new ArrayList<>();
		LinkedList<String> foods = new LinkedList<>();
		
		Collection<String> d1 = drinks;
		List<String> d2 = drinks;
		List<String> f1 = foods;
		
		// LinkedList와 ArrayList는 세부구현 및 성능이 다르지만
		// 같은 List의 자식이기 때문에 List의 메서드로 쉽게 활용이 가능하다
		f1.add("봉골레 파스타");
		f1.add("고르곤졸라 피자");
		
		System.out.println(f1);
	}
	
}
