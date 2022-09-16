package ch15.book.exercise.p9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hond", 86);
		map.put("white", 92);
		
		String name = null; // 최고 점수를 받은 아이디 저장
		int maxScore = 0;	// 최고 점수 저장
		int totalScore = 0; // 점수 합계 저장
		
		// 작성위치
		
		Set<String> keys = map.keySet();
		
		for (String key : keys)	{
			Integer value = map.get(key);
			
			totalScore += value;
			
			if(value > maxScore) {
				maxScore = value;
				name = key;
			}
		}
	}
}
