package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class D02_Jiphap<T> {
	
	/*
	  	1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드
	  		[1, 2, 3] + [2, 3, 4, 5] => [1, 2, 3, 4, 5]
	  	
	  	2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
	  		[1, 2, 3] 교 [2, 3, 4, 5] => [2, 3]
	  	
	  	3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드
	  		[1, 2, 3] - [2, 3, 4, 5] => [1]
	  		[2, 3, 4, 5] - [1, 2, 3] => [4, 5]
	 */
	
	// 두 Set을 전달받으면 합집합을 만들어 리턴하는 메서드
	 Set<T> union(Collection<? extends T> a, Collection<? extends T> b) {
		HashSet<T> union = new HashSet<>();
		
		union.addAll(a);
		union.addAll(b);
		
		return union;
	}
	
	 Set<T> inter(Collection<T> a, Collection<T> b) {
		HashSet<T> inter = new HashSet<>();
		
		inter.addAll(a);
		inter.retainAll(b); // b와 일치하는것만 남긴다 (교집합)
		
//		for (int i : a) {
//			if (b.contains(i)) {
//					inter.add(i);
//			}
//		}
//		
		return inter;
	}
	
	Set<T> diff(Collection<T> a, Collection<T> b) {
		HashSet<T> diff = new HashSet<>();
		
		diff.addAll(a);
		diff.removeAll(b);
		
		return diff;
	}
	
	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		list1.add(2);
		list1.add(2);
		list1.add(4);
		list1.add(6);
		
		// 새 인스턴스 만들때 <T>가 결정
		D02_Jiphap<Integer> quiz = new D02_Jiphap<Integer>();
		D02_Jiphap<String> quiz2 = new D02_Jiphap<String>();
		
		System.out.println(quiz.union(set1,set2));
		System.out.println(quiz.union(set1,list1));

		System.out.println(quiz.inter(set1, set2));
		System.out.println(quiz.inter(set2, list1));
		System.out.println(quiz.inter(set1, list1));
		
		System.out.println(quiz.diff(list1, set2));
		System.out.println(quiz.diff(list1, set1));
		System.out.println(quiz.diff(set2, set1));
	}
}
		

		
