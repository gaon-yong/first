package collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		/*
		 # Set
		 - 집합을 구현해 놓은 클래스
		 - 요소로 같은 값이 들어오는 것을 허용하지 않는다.
		
		 # Hash
		 - 어떤 값을 넣었을 때 전혀 예측하지 못할 값이 생성되어야 하는 알고리즘.
		 - 예측할 수 없는 값을 이용하기 때문에 정렬이 불가능.
		 - 생성된 값으로 원래 값을 찾는 것도 불가능에 가깝다.
		 - 다시 원래 값을 돌아갈 수 없는 단방향성 알고리즘.
		 - 속도가 빠르고 보안성이 뛰어난 알고리즘.
		 */
		
		Set<String> set = new HashSet<>();
		
		//객체를 저장: add(객체)
		set.add("Java");
		set.add("Jsp");
		set.add("Spring");
		set.add("Oracle");
		Collections.addAll(set, "My", "Java");
		System.out.println(set); //set은 중복 저장을 허용하지 않습니다.
		
		//set의 크기를 확인하기: size()
		System.out.println("set의 크기: " + set.size());
		
		/*
		 - set은 인덱스가 없기 때문에 메서드를 이용해서 객체를 얻는 게 아니라 
		  반복자(Iterator)를 통해서 요소를 하나씩 꺼내 보셔야 합니다.
		  반복자 객체는 set 인터페이스가 제공하는 iterator()를 호출하여
		  얻어옵니다.
		 */ 
		 
		Iterator<String>  iter = set.iterator();
//		String str = iter.next();
//		System.out.println(str);
//		String str2 = iter.next();
//		System.out.println(str2);
		
//		while(true) {
//			if(iter.hasNext()) {
//				System.out.println(iter.next());
//			} else {
//				break;
//			}
//				
//		}
		
		/*
		 Iterator 객체의 메서드 next()를 통해 
		 내부 요소를 하나씩 꺼내올 수 있습니다.
		 next()를 요소의 개수보다 많이 호출하게 되면
		 NoSuchElement 예외가 발생하게 됩니다.
		 
		 hasNext() -> 반복자가 가지고 잇는 객체를 더 가져올 수 있는지의 
		 여부를 확인하는 메서드를 통해 next()를 호출하셔야 합니다.
		 */
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("---------------------------");
		
		for(String s: set) {
			if(s.equals("Spring")) {
				
				System.out.println(s);
			}
		}
		
		//set에서 객체를 삭제: remove()
		set.remove("Jsp");
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
	
		
		
		
		
		
		
	}
	
}
