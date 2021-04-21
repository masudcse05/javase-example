package frequency;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Problem 1: Counting duplicate characters: Write a program that counts duplicate
characters from a given string.
 * @author haquem
 *
 */
public class DuplicateCounter {

	public static int countDuplicate(String input) {
		
		Map<Character, Long> map = countCharacterStream(input);
		int count=0;
		for(Map.Entry<Character, Long> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				count++;
			}
		}
		return count;
	}

	private static Map<Character, Integer> countCharacter(String input) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i< input.length(); i++) {
			Character ch = input.charAt(i);
//			if(map.containsKey(ch)) {
//				map.put(ch, map.get(ch)+1);
//			}
//			else {
//				map.put(ch, 1);
//			}
			map.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
		}
		return map;
	}
	
	/**
	 * Another solution relies on Java 8's stream feature. This solution has three steps. The
first two steps are meant to transform the given string into Stream<Character>,
while the last step is responsible for grouping and counting the characters. Here are
the steps:
1. Call the String.chars() method on the original string. This will
return IntStream. This IntStream contains an integer representation of
the characters from the given string.
2. Transform IntStream into a stream of characters via the mapToObj()
method (convert the integer representation into the human-friendly
character form).
3. Finally, group the characters (Collectors.groupingBy()) and count
them (Collectors.counting()).
	 * @param input
	 * @return
	 */
	private static Map<Character, Long> countCharacterStream(String input) {
		Map<Character, Long> map = input.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		return map;
	}
}
