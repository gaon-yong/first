package api.util.arrays;

import java.util.Arrays;

public class ArraysQuiz {

	public static String solution(String[] participant, String[] completion) {
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i=0; i<completion.length; i++) {
			if(!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		 return participant[participant.length-1];
		 //박영희 같은 경우는 안 나올 수 있기 때문에 참가자의 마지막 배열도 체크!
		 
	}
	
	
	public static void main(String[] args) {
		
		
		
		String[] participant = {"홍길동", "김길동", "김철수", "최철수", "박영희"};
		String[] completion = {"홍길동", "김길동", "박영희", "김철수"};
		
		
		System.out.println(solution(participant, completion));

	}

}






















