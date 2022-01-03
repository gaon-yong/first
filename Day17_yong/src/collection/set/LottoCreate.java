package collection.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoCreate {

	public static void main(String[] args) {

		Set<Integer> lotto  = new HashSet<>();
		Random r = new Random();

		while(lotto.size()<6) {
			int num = r.nextInt(45) + 1;
			lotto.add(num);
		}
		System.out.println(lotto);
		List<Integer> list = new ArrayList<>(lotto);//<- set 자료 구조를 List 자료 구조로 바꿀때
		Collections.sort(list);
		System.out.println(list);

	}

}





















