package lambda.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MainClass01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add("김철수");
		list.add("박영희");
		list.add("김뽀삐");
		list.add("최또띠");
		
		Iterator<String> iter =list.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("----------------------------------");
		/*
		Stream<String> stream = list.stream();
		
		stream.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
		});
		*/ //<- 위의  collections 익명객체문을 람다식으로
		
		list.stream().forEach((s) -> System.out.println(s));
		//향상for문 람다식은 많이 씀 
		
		
		
		
	}

}


























