package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class Prt {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		Map.of("avi", "video",
				"mp4", "video",
				"mkv", "video",
				"png", "image",
				"jpg", "image",
				"gif", "image");
		System.out.println(map.size());
		System.out.println(map.containsKey("mp4"));
		System.out.println(map);
		
	}
}
