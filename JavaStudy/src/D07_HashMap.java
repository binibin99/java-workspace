import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D07_HashMap {
	
	/*
	  	# Map
	  	
	  	- 데이터를 Key/Value 방식으로 저장하는 자료구조
	  	- 인덱스 번호 대신 Key값을 사용해 사용하기 편하게 만들어진 자료구조
	  	- Key는 중복이 허용되지 않는다
	  	- value는 중복이 허용된다
	 */
	public static void main(String[] args) {
		int[] information = {3000, 15, 5};
		
		System.out.println("돈: " + information[0]);
		System.out.println("나이: " + information[1]);
		System.out.println("구매횟수: " + information[2]);
		
		// 데이터를 구분하기 쉬운 키값으로 넣어놓기 때문에
		// 인덱스를 외우는 수고를 덜 수 있다
		Map<String, Integer> info = new HashMap<>();
		
		// map.put(K, V) : 해당 Map에 데이터를 추가하거나 수정한다
		info.put("money", 3000);
		info.put("age", 15);
		info.put("purchaseCount", 5);
		info.put("score", 3000);
		info.put("money", 50000); // 이미 있는 키에 데이터를 추가하면덮어쓰기한다
		
		// map.get(K) : 해당 키를 사용해 값을 꺼낸다
		// 인덱스 번호 대신 키 이름으로 데이터를 꺼내 사용할 수 있다
		System.out.println("money: " + info.get("money"));
		System.out.println("money: " + info.get("purchaseCount"));
		
		// 존재하지 않는 키값을 사용하면 null이 나온다
		System.out.println(info.get("future"));
		
		// map.putIfAbsent(K, V)
		// : 해당 키에 값이 없는 경우에는 전달한 값을 추가한다 (기본값)
		// 	 해당 키에 이미 값이 있는 경우에는 값을 꺼내준다
		
		// 이미 존재하는 키 money에 putIfAbsent를 하는 경우 - 이미 존재하는 값을 꺼냄
		System.out.println(info.putIfAbsent("money", 5000));
		
		// 아직 존재하지 않는 키에 putIfAbsent를 하는 경우 - 데이터가 추가됨
		System.out.println(info.putIfAbsent("stock",30));
		
		System.out.println(info);
		
		// map.keySet() : 모든 키들을 Set으로 꺼낸다
		Set<String> keys = info.keySet();
		
		System.out.println(keys);
		
		// 키를 하나씩 꺼내서 반복문을 돌릴 수 있다
		for (String key : keys) {
			System.out.printf("%s=%d\n",key,info.get(key));
		}
		
		// map.values() : 모든 값들을 Collection으로 꺼낸다
		System.out.println(info.values());
		
		
		// map.containsKey(K) : 맵에 해당 키가 있는지 확인
		System.out.println(info.containsKey("salary"));
		System.out.println(info.containsKey("money"));
		
		// map.containsValue(V) : 맵에 해당 값이 있는 확인
		System.out.println(info.containsValue(50000));
		
		// map.remove(K) : 해당 키/값을 지운다
		System.out.println(info.remove("money"));
		System.out.println(info.remove("salary"));
	}

}
