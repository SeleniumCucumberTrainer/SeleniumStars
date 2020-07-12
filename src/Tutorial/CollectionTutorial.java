package Tutorial;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CollectionTutorial {

	public static void main(String[] args) {

		String name = "abcbabcbabcfesasas";

		char[] arrChar = name.toCharArray();

		// System.out.println(Arrays.toString(arrChar));

		// a=5
		// b=5
		// c=3
		// e=1
		// f =1
		// s=3

		Map<Character, Integer> abc = new HashMap<Character, Integer>();

		for (char chars : arrChar) {

			if (!abc.containsKey(chars)) {

				abc.put(chars, 1);
			} else {

				int value = abc.get(chars);

				abc.put(chars, value + 1);

			}

		}

		System.out.println(abc);
	}

}
