package second_semester;

import java.util.HashMap;
import java.util.Map;

public class Chap_11_prac_11_08 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("�ȳ�", 1);
		map.put("�ȳ�", 2);
		map.put(null, 3);
		System.out.println(map.size());
		System.out.println(map);

	}

}
